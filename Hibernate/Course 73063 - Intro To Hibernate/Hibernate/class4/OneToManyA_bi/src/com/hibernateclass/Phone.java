package com.hibernateclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PHONE")
public class Phone {

	private long phoneId;
	private String phoneType;
	private String phoneNumber;
	private Student student;

	public Phone() {
	}

	public Phone(String phoneType, String phoneNumber) {
		this.phoneType = phoneType;
		this.phoneNumber = phoneNumber;
	}
	
	@ManyToOne
	@JoinTable(name = "STUDENT_PHONE", joinColumns = { @JoinColumn(name = "PHONE_ID") }, inverseJoinColumns = { @JoinColumn(name = "STUDENT_ID") })
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Id
	@GeneratedValue
	@Column(name = "PHONE_ID")
	public long getPhoneId() {
		return this.phoneId;
	}

	public void setPhoneId(long phoneId) {
		this.phoneId = phoneId;
	}

	@Column(name = "PHONE_TYPE", nullable = false, length=10)
	public String getPhoneType() {
		return this.phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}
	
	@Column(name = "PHONE_NUMBER", nullable = false, length=15)
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
