package org.miabis.exchange.schema;

import java.math.BigInteger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleMarshallerTest {

	 private JAXBContext jc;
	 private Marshaller marshaller;

	 @Test
	 public void testMarshalRoot() throws JAXBException {
		 Sample sample = new Sample();
		 
		 System.out.println("");
		 marshaller.marshal(sample, System.out);
	 }

	 @Test
	 public void testMarshalBiobank() throws JAXBException {
		 
		 Biobank biobank = new Biobank();
	     biobank.setAcronym("TEST");
	     biobank.setCountry("NL");
	     biobank.setDescription("Test biobank");
	     biobank.setName("Test");
	     
	     Sample sample = new Sample();
	     sample.setBiobank(biobank);
	     
	     System.out.println("");
	     marshaller.marshal(sample, System.out);
	 }
	 
	 @Test
	 public void testMarshalSampleCollection() throws JAXBException { 
		 
		 SampleCollection sCollection = new SampleCollection();
		 sCollection.setAcronym("Sample colletion acronym");
		 sCollection.setAgeHigh(50);
		 sCollection.setAgeLow(10);
		 sCollection.setAgeUnit(TimeUnit.YEAR);
	     sCollection.setDescription("This is a sample collection");
	     sCollection.setId("1");
	     sCollection.setName("Sample collection 1");
		 
		 
	     Sample sample = new Sample();
	     sample.setSamplecollection(sCollection);
	     
	     System.out.println("");
	     marshaller.marshal(sample, System.out);
		 
	 }
	 
	 @Test
	 public void testMarshalSudy() throws JAXBException { 
		 
		 Study study = new Study();
		 study.setAgeHigh(10);
		 study.setAgeLow(5);
		 study.setAgeUnit(TimeUnit.WEEK);
		 study.setDescription("description for study one");
		 study.setName("Study one");
		 study.setId("1");
		 study.setTotalNumberOfDonors(BigInteger.valueOf(new Integer(500).intValue()));
		 study.setTotalNumberOfParticipants(BigInteger.valueOf(new Integer(500).intValue()));
		 
	     Sample sample = new Sample();
	     sample.setStudy(study);
	     
	     System.out.println("");
	     marshaller.marshal(sample, System.out);
		 
	 }

	 @BeforeMethod
	 public void setUpMethod() throws Exception {
		 jc = JAXBContext.newInstance("org.miabis.exchange.schema");
	     marshaller = jc.createMarshaller();
	 }

	 @AfterMethod
	 public void afterMethod() throws Exception {
	 }
	
	
}
