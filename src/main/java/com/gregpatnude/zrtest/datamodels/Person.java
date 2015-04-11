package com.gregpatnude.zrtest.datamodels;

import java.util.Date;

import com.gregpatnude.zrtest.enums.PersonType;

public class Person {
	
	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private Date birthday;
	
	private PersonType personType; 
	
	private boolean active = true;	
	
	public Person() {
	
		super();
		
	}
	
	public Person(int id, String firstName, String lastName, Date birthday, PersonType personType) {
		
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
		this.personType = personType;
	
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
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return the personType
	 */
	public PersonType getPersonType() {
		return personType;
	}

	/**
	 * @param personType the personType to set
	 */
	public void setPersonType(PersonType personType) {
		this.personType = personType;
	}

	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	
	

}
