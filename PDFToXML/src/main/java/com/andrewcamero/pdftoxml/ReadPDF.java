package com.andrewcamero.pdftoxml;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfReader;

/*
 * Reads the PDF and assigns the value to Answers
 * Values are currently hardcoded and will be changed to dynamic
 */

public class ReadPDF {

	public Answers getPDFFields(Answers answers, String inputPDF){
		
		PdfReader reader = null;
		try {
			reader = new PdfReader(inputPDF);
		} catch (IOException e) {
			e.printStackTrace();
		}

		final AcroFields fields = reader.getAcroFields();				// Gets the fields and field values from the pdf
		
		final Map<String, Object> values = new HashMap<>();
		for (String fieldName : (Set<String>) fields.getFields().keySet()) {
		    values.put(fieldName, fields.getField(fieldName));
		    System.out.println("sysout FieldName: " + fieldName);
			System.out.println("sysout FieldValue: " + fields.getField(fieldName));
			
		    if(fieldName.contains("First_Name")){
		    	answers.setFirstName(fields.getField(fieldName));
		    	//System.out.println("qa Patient's Name: " + answers.getPatientName());
		    }
		    else if(fieldName.contains("Last_Name")){
		    	answers.setLastName(fields.getField(fieldName));
		    }
		    else if(fieldName.contains("Date")){
		    	answers.setDate(fields.getField(fieldName));
		    }
		    else if(fieldName.contains("Gender")){
		    	answers.setGender(fields.getField(fieldName));
		    }
		    else if(fieldName.contains("Drop_Down")){
		    	answers.setDropDown(fields.getField(fieldName));
		    }
		    else if(fieldName.contains("Java")){
		    	answers.setProgrammingJava(fields.getField(fieldName));
		    }
		    else if(fieldName.contains("Spring")){
		    	answers.setProgrammingSpring(fields.getField(fieldName));
		    }
		    else if(fieldName.contains("Ruby")){
		    	answers.setProgrammingRuby(fields.getField(fieldName));
		    }
		    else if(fieldName.contains("Rails")){
		    	answers.setProgrammingRails(fields.getField(fieldName));
		    }
		    else if(fieldName.contains("Groovy")){
		    	answers.setProgrammingGroovy(fields.getField(fieldName));
		    }
		    else if(fieldName.contains("Cpp")){
		    	answers.setProgrammingCpp(fields.getField(fieldName));
		    }
		    else if(fieldName.contains("C_Sharp")){
		    	answers.setProgrammingC_Sharp(fields.getField(fieldName));
		    }
		    else if(fieldName.contains("Pascal")){
		    	answers.setProgrammingPascal(fields.getField(fieldName));
		    }
		    else if(fieldName.contains("SQL")){
		    	answers.setProgrammingSQL(fields.getField(fieldName));
		    }
		    else if(fieldName.contains("JSP")){
		    	answers.setProgrammingJSP(fields.getField(fieldName));
		    }
		}
		
		return answers;
	}
	
}
