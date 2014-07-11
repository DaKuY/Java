
import org.apache.xmlbeans.XmlException;
import andrewNamespace.xsdconfig.ColleaguesDocument;
import andrewNamespace.xsdconfig.ColleaguesDocument.Colleagues;
import andrewNamespace.xsdconfig.EmployeeDocument.Employee;
import andrewNamespace.xsdconfig.NameDocument.Name;
import andrewNamespace.xsdconfig.impl.ColleaguesDocumentImpl;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


public class ReadXMLFile {
 	
	private  File xmlFile;
	private  Colleagues colleagues;
	private  ColleaguesDocument colleaguesDoc;
	private  String targetFile = "xml//test.xml";
	private  String outputFile = "xml//outputFileTest.xml";
	
	public static void main(String argv[]) {
		
		ReadXMLFile xml = new ReadXMLFile();
		xml.findFile();
		xml.printConsole();
		xml.generateData();
		xml.wrtieXML();
  }
 
  public void findFile(){
	  
	  xmlFile = new File(targetFile);
	  
	  
	  
	  try {
		    colleaguesDoc = ColleaguesDocument.Factory.parse(xmlFile);
			colleagues =  colleaguesDoc.getColleagues();
	  } 
	  catch (XmlException e) {
		e.printStackTrace();
	  } 
	  catch (IOException e) {
		e.printStackTrace();
	  }
  }
  
  public void printConsole(){
	  List<Employee> listEmployee = colleagues.getEmployeeList();
	
	  System.out.println("\nColleagues/Employees:\n");
	  for(Employee employee: listEmployee){
			System.out.println("--------------------");
			System.out.println("Name: "+employee.getName());
			System.out.println("NickName: "+employee.getNickname());			
		}
		System.out.println("--------------------");
  }
  
  public void generateData(){
	  Employee employee = colleagues.addNewEmployee();
	  Name name = null;
	  employee.setName(name.ANDREW);
	  employee.setNickname("That Filipino Guy.");
	  System.out.println("\nAdded to XML:\nName: " + employee.getName() + "\nNickname: " + employee.getNickname());
  }
  
  public void wrtieXML(){
	 
	  File newFile = new File(outputFile);
	  
	  try { 
		colleagues.save(new File(outputFile));
	  } 
	  catch (IOException e) {
		e.printStackTrace();
	  } 
	 /* try {
		  
			File newFile = new File("xml//newData.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(ColleaguesDocument.Factory.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
	
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			List<Employee> listEmployee = colleagues.getEmployeeList();
			
			jaxbMarshaller.marshal(listEmployee, newFile);
			jaxbMarshaller.marshal(listEmployee, System.out);
	 
	  } 
	  catch (JAXBException e) {
			e.printStackTrace();
	  }*/
  		 		
  }
 
}