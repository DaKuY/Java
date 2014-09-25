package com.andrewcamero.pdftoxml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/*
 * List of Answers from the PDF to convert to XML
 */

@XmlRootElement
public class Answers {
	
	String firstName;
	String lastName;
	String date;
	String gender;
	String dropDown;
	String programmingJava;
	String programmingSpring;
	String programmingRuby;
	String programmingRails;
	String programmingGroovy;
	String programmingCpp;
	String programmingC_Sharp;
	String programmingPascal;
	String programmingSQL;
	String programmingJSP;
	
	public String getFirstName() {
		return firstName;
	}
	
	@XmlElement
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	@XmlElement
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getDate() {
		return date;
	}
	
	@XmlElement
	public void setDate(String date) {
		this.date = date;
	}
	public String getGender() {
		return gender;
	}
	
	@XmlElement
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDropDown() {
		return dropDown;
	}
	
	@XmlElement
	public void setDropDown(String dropDown) {
		this.dropDown = dropDown;
	}
	public String getProgrammingJava() {
		return programmingJava;
	}
	
	@XmlElement
	public void setProgrammingJava(String programmingJava) {
		this.programmingJava = programmingJava;
	}
	public String getProgrammingSpring() {
		return programmingSpring;
	}
	
	@XmlElement
	public void setProgrammingSpring(String programmingSpring) {
		this.programmingSpring = programmingSpring;
	}
	public String getProgrammingRuby() {
		return programmingRuby;
	}
	
	@XmlElement
	public void setProgrammingRuby(String programmingRuby) {
		this.programmingRuby = programmingRuby;
	}
	public String getProgrammingRails() {
		return programmingRails;
	}
	
	@XmlElement
	public void setProgrammingRails(String programmingRails) {
		this.programmingRails = programmingRails;
	}
	public String getProgrammingGroovy() {
		return programmingGroovy;
	}
	
	@XmlElement
	public void setProgrammingGroovy(String programmingGroovy) {
		this.programmingGroovy = programmingGroovy;
	}
	public String getProgrammingCpp() {
		return programmingCpp;
	}
	
	@XmlElement
	public void setProgrammingCpp(String programmingCpp) {
		this.programmingCpp = programmingCpp;
	}
	public String getProgrammingC_Sharp() {
		return programmingC_Sharp;
	}
	
	@XmlElement
	public void setProgrammingC_Sharp(String programmingC_Sharp) {
		this.programmingC_Sharp = programmingC_Sharp;
	}
	public String getProgrammingPascal() {
		return programmingPascal;
	}
	
	@XmlElement
	public void setProgrammingPascal(String programmingPascal) {
		this.programmingPascal = programmingPascal;
	}
	public String getProgrammingSQL() {
		return programmingSQL;
	}
	
	@XmlElement
	public void setProgrammingSQL(String programmingSQL) {
		this.programmingSQL = programmingSQL;
	}
	public String getProgrammingJSP() {
		return programmingJSP;
	}
	
	@XmlElement
	public void setProgrammingJSP(String programmingJSP) {
		this.programmingJSP = programmingJSP;
	}
	
}