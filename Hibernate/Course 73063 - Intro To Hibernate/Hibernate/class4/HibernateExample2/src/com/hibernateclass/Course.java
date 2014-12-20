package com.hibernateclass;

// Generated May 30, 2009 6:48:40 AM by Hibernate Tools 3.2.4.GA

/**
 * 	This class contains the course details.
 * 	
 */
public class Course implements java.io.Serializable {

	private long courseId;
	private String courseName;

	public Course() {
	}

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public long getCourseId() {
		return this.courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
