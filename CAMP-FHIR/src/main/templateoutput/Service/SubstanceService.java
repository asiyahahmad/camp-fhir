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
import main.java.com.campfhir.dao.SubstanceDao;
import main.java.com.campfhir.service.conversion.SubstanceConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Substance.
 * @see .Substance
 * @author Paul Kovach
 */

public class SubstanceService {

	private static SubstanceDao SubstanceDao;
	private static SubstanceConversion SubstanceConversion;

	public SubstanceService() 
	{
		SubstanceDao = new SubstanceDao();
		SubstanceConversion = new SubstanceConversion();
	}

	public void persist(main.java.com.campfhir.model.Substance entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 SubstanceDao.openCurrentSessionwithTransaction();
		 SubstanceDao.persist(entity);
		 SubstanceDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Substance entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 SubstanceDao.openCurrentSessionwithTransaction();
		 SubstanceDao.update(entity);
		 SubstanceDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Substance findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SubstanceDao.openCurrentSession();
		main.java.com.campfhir.model.Substance resource = SubstanceDao.findById(id);
		SubstanceDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Substance> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SubstanceDao.openCurrentSession();
		List<main.java.com.campfhir.model.Substance> resource =  SubstanceDao.findByPatientId(id);
		SubstanceDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		SubstanceDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Substance resource =  SubstanceDao.findById(id);
		SubstanceDao.delete(resource);
		SubstanceDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  SubstanceDao.openCurrentSession();
		ScrollableResults resources =  SubstanceDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Substance.html")  			   
			   .setResource(SubstanceConversion.Substances((main.java.com.campfhir.model.Substance) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  SubstanceDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Substance> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  SubstanceDao.findAll();
		List<main.java.com.campfhir.model.Substance> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Substance) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 SubstanceDao.openCurrentSessionwithTransaction();
		 SubstanceDao.deleteAll();
		 SubstanceDao.closeCurrentSessionwithTransaction();
	}

	public SubstanceDao  SubstanceDao() 
	{
		return  SubstanceDao;
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
