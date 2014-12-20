package com.hibernateclass;

// Generated May 30, 2009 6:48:40 AM by Hibernate Tools 3.2.4.GA

import java.util.HashSet;
import java.util.Set;

/**
 * This class contains the student details.
 */
public class Student implements java.io.Serializable {

	private long studentId;
	private String studentName;
	private Set<Course> courses = new HashSet<Course>(0);

	public Student() {
	}

	public Student(String studentName) {
		this.studentName = studentName;
	}

	public Student(String studentName, Set<Course> courses) {
		this.studentName = studentName;
		this.courses = courses;
	}

	public long getStudentId() {
		return this.studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Set<Course> getCourses() {
		return this.courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

}
