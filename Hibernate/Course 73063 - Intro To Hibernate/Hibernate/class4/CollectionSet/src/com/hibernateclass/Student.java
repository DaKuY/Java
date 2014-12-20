package com.hibernateclass;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {

	private Long id;
	private String name;
	private String age;
	private String year;
	private String major;
	private Address address;
	private Set<Phone> phones = new HashSet<Phone>();
	
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	@Embedded
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	@ElementCollection
	@JoinTable(name="Phones", joinColumns=@JoinColumn(name="student_id"))
	public Set<Phone> getPhones() {
		return phones;
	}

	public void setPhones(Set<Phone> phones) {
		this.phones = phones;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age
				+ ", year=" + year + ", major=" + major + ", address="
				+ address + ", phones=" + phones + "]";
	}
	
}