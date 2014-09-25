package com.andrewcamero.pdftoxml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;

/*
 * This class exports a class to an XML using JaxB
 */
public class ExportToXML {
	
	public void writeToXML(Answers answers, String outputXML){

		try {
			File file = new File(outputXML);
			JAXBContext jaxbContext = JAXBContext.newInstance(Answers.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
 
			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
 
			jaxbMarshaller.marshal(answers, file);
			//jaxbMarshaller.marshal(answers, System.out);
			
		} catch (PropertyException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

}
