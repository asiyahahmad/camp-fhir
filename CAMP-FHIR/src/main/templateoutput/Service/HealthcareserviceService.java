//// default package
package main.templateoutput.Service;

// Generated on Nov 18, 2021, 1:48:14 PM 


import ca.uhn.fhir.context.FhirContext;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import main.java.com.campfhir.dao.HealthcareserviceDao;
import main.java.com.campfhir.service.conversion.HealthcareserviceConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Healthcareservice.
 * @see .Healthcareservice
 * @author Paul Kovach
 */

public class HealthcareserviceService {

	private static HealthcareserviceDao HealthcareserviceDao;
	private static HealthcareserviceConversion HealthcareserviceConversion;

	public HealthcareserviceService() 
	{
		HealthcareserviceDao = new HealthcareserviceDao();
		HealthcareserviceConversion = new HealthcareserviceConversion();
	}

	public void persist(main.java.com.campfhir.model.Healthcareservice entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 HealthcareserviceDao.openCurrentSessionwithTransaction();
		 HealthcareserviceDao.persist(entity);
		 HealthcareserviceDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Healthcareservice entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 HealthcareserviceDao.openCurrentSessionwithTransaction();
		 HealthcareserviceDao.update(entity);
		 HealthcareserviceDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Healthcareservice findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		HealthcareserviceDao.openCurrentSession();
		main.java.com.campfhir.model.Healthcareservice resource = HealthcareserviceDao.findById(id);
		HealthcareserviceDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Healthcareservice> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		HealthcareserviceDao.openCurrentSession();
		List<main.java.com.campfhir.model.Healthcareservice> resource =  HealthcareserviceDao.findByPatientId(id);
		HealthcareserviceDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		HealthcareserviceDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Healthcareservice resource =  HealthcareserviceDao.findById(id);
		HealthcareserviceDao.delete(resource);
		HealthcareserviceDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  HealthcareserviceDao.openCurrentSession();
		ScrollableResults resources =  HealthcareserviceDao.findAll();
		
	     int i = 0;
	     System.out.println("start");
	     Bundle bundle = new Bundle().setType(BundleType.COLLECTION);
	     

	     while ( resources.next() ) 
	     {	
			if ((i % partition) == 0)
			{
				session.clear();
				
		    	writeFile(path, i, bundle);
			    bundle = new Bundle().setType(BundleType.COLLECTION);
			}
			
			i++;
			
			bundle.addEntry()
			   .setFullUrl("https://www.hl7.org/fhir/Healthcareservice.html")  			   
			   .setResource(HealthcareserviceConversion.Healthcareservices((main.java.com.campfhir.model.Healthcareservice) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  HealthcareserviceDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Healthcareservice> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  HealthcareserviceDao.findAll();
		List<main.java.com.campfhir.model.Healthcareservice> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Healthcareservice) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 HealthcareserviceDao.openCurrentSessionwithTransaction();
		 HealthcareserviceDao.deleteAll();
		 HealthcareserviceDao.closeCurrentSessionwithTransaction();
	}

	public HealthcareserviceDao  HealthcareserviceDao() 
	{
		return  HealthcareserviceDao;
	}
	
	public static void writeFile(String path, int domain, Bundle bundle)
	{			
	    
		
		try 
		{
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path+"/"+domain+".json", true), StandardCharsets.UTF_8));
			
			String file = FhirContext.forR4().newJsonParser().setPrettyPrint(false).encodeResourceToString(bundle);			
			
		    writer.write(file);
		    writer.close();

		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}

	    
	}
}

