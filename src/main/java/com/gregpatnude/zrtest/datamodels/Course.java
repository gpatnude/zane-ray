package com.gregpatnude.zrtest.datamodels;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Course {
	
	private int id;
	
	private String courseName;
	
	private Date startDate;
	
	private Date endDate;
	
	private Person instructor;
	
	private Collection<Person> students = new ArrayList<Person>();
	
	public Course() {
		
		super();
		
	}
		
	public Course(int id, String courseName, Date startDate, Date endDate, Person instructor, Collection<Person> students) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.instructor = instructor;
		this.students = students;
	}
	
	public int getStudentCount() {
		
		return this.students.size();
		
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		
		return id;
		
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		
		this.id = id;
		
	}

	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		
		return courseName;
		
	}

	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		
		this.courseName = courseName;
		
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		
		return startDate;
		
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		
		this.startDate = startDate;
		
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		
		return endDate;
		
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		
		this.endDate = endDate;
		
	}

	/**
	 * @return the instructor
	 */
	public Person getInstructor() {
		
		return instructor;
		
	}

	/**
	 * @param instructor the instructor to set
	 */
	public void setInstructor(Person instructor) {
		
		this.instructor = instructor;
		
	}

	/**
	 * @return the student
	 */
	public Collection<Person> getStudents() {
		
		return students;
		
	}	

	/**
	 * @param student the student to set
	 */
	public void setStudents(Collection<Person> students) {
		
		this.students = students;
		
	}
	
}
