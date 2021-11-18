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
import main.java.com.campfhir.dao.ConceptmapDao;
import main.java.com.campfhir.service.conversion.ConceptmapConversion;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleType;
import org.xml.sax.SAXException;

/**
 *  object for domain model class Conceptmap.
 * @see .Conceptmap
 * @author Paul Kovach
 */

public class ConceptmapService {

	private static ConceptmapDao ConceptmapDao;
	private static ConceptmapConversion ConceptmapConversion;

	public ConceptmapService() 
	{
		ConceptmapDao = new ConceptmapDao();
		ConceptmapConversion = new ConceptmapConversion();
	}

	public void persist(main.java.com.campfhir.model.Conceptmap entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ConceptmapDao.openCurrentSessionwithTransaction();
		 ConceptmapDao.persist(entity);
		 ConceptmapDao.closeCurrentSessionwithTransaction();
	}

	public void update(main.java.com.campfhir.model.Conceptmap entity) throws ParserConfigurationException, SAXException, IOException 
	{
		 ConceptmapDao.openCurrentSessionwithTransaction();
		 ConceptmapDao.update(entity);
		 ConceptmapDao.closeCurrentSessionwithTransaction();
	}

	public main.java.com.campfhir.model.Conceptmap findById(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ConceptmapDao.openCurrentSession();
		main.java.com.campfhir.model.Conceptmap resource = ConceptmapDao.findById(id);
		ConceptmapDao.closeCurrentSession();
		return resource;
	}
	
	public List<main.java.com.campfhir.model.Conceptmap> findByPatientId(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ConceptmapDao.openCurrentSession();
		List<main.java.com.campfhir.model.Conceptmap> resource =  ConceptmapDao.findByPatientId(id);
		ConceptmapDao.closeCurrentSession();
		return resource;
	}

	public void delete(String id) throws ParserConfigurationException, SAXException, IOException 
	{
		ConceptmapDao.openCurrentSessionwithTransaction();
		main.java.com.campfhir.model.Conceptmap resource =  ConceptmapDao.findById(id);
		ConceptmapDao.delete(resource);
		ConceptmapDao.closeCurrentSessionwithTransaction();
	}

	public void findAll(int partition, String path) throws ParserConfigurationException, SAXException, IOException, ParseException 
	{
		Session session =  ConceptmapDao.openCurrentSession();
		ScrollableResults resources =  ConceptmapDao.findAll();
		
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
			   .setFullUrl("https://www.hl7.org/fhir/Conceptmap.html")  			   
			   .setResource(ConceptmapConversion.Conceptmaps((main.java.com.campfhir.model.Conceptmap) resources.get(0)));
			
	     }
	     
	     writeFile(path, i, bundle);
		  ConceptmapDao.closeCurrentSession();
	}
	
	public List<main.java.com.campfhir.model.Conceptmap> findPatientAll() throws ParserConfigurationException, SAXException, IOException, ParseException, FHIRException 
	{
		ScrollableResults resources =  ConceptmapDao.findAll();
		List<main.java.com.campfhir.model.Conceptmap> e = new ArrayList<>();  

		while ( resources.next() ) 
		{		
			e.add((main.java.com.campfhir.model.Conceptmap) resources.get(0));
		}

		return e;
	}

	
	
	public void deleteAll() throws ParserConfigurationException, SAXException, IOException 
	{
		 ConceptmapDao.openCurrentSessionwithTransaction();
		 ConceptmapDao.deleteAll();
		 ConceptmapDao.closeCurrentSessionwithTransaction();
	}

	public ConceptmapDao  ConceptmapDao() 
	{
		return  ConceptmapDao;
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

