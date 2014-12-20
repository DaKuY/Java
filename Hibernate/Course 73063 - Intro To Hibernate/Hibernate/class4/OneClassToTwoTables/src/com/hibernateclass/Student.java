package com.hibernateclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="Student")
@SecondaryTable(name="StudentDetails")
public class Student {

	private Long id;
	private String name;
	private String age;
	private String year;
	private String major;
	
	public Student() {
	}

	public Student(String name, String age, String year, String major) {
		this.name = name;
		this.age = age;
		this.year = year;
		this.major = major;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="STUDENT_ID")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Column(table="StudentDetails")
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Column(table="StudentDetails")
	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Column(table="StudentDetails")
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age
				+ ", year=" + year + ", major=" + major + "]";
	}
	
	
	
	
	
}