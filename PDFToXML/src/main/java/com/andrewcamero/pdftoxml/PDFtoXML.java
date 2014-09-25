package com.andrewcamero.pdftoxml;

import java.io.IOException;
import javax.xml.bind.JAXBException;

/*
 * This Program 
 */

public class PDFtoXML {
	
	private static Answers answers = new Answers();
	private static String inputPDF = "C:\\Projects\\Java\\PDFToXML\\sample.pdf";
	private static String outputXML = "C:\\Projects\\Java\\PDFToXML\\sample.xml";
	
	  public static void main(String[] args) throws JAXBException, IOException {
		  
		// Reads the PDF  
		ReadPDF readPDF = new ReadPDF();
		answers = readPDF.getPDFFields(answers, inputPDF);

		// Exports to an XML
		ExportToXML exportToXML = new ExportToXML();
		exportToXML.writeToXML(answers,outputXML);
	}

}
