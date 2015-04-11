package com.gregpatnude.zrtest.view;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import services.PeopleService;

import com.gregpatnude.zrtest.datamodels.Person;
 
@ManagedBean(name="personsView")
@ViewScoped
public class PersonsView implements Serializable {
     
    @ManagedProperty("#{peopleService}")
    private PeopleService service;
    
    private Person newPerson = new Person();
 
    public List<Person> getActiveStudents() {
    	
    	return service.getStudents(true);

    }
    
    public List<Person> getInactiveStudents() {
    	
        return service.getStudents(false);

    }
    
    public List<Person> getAllStudents() {
    	
        return service.getAllStudents();

    }
    
    public List<Person> getActiveStaff() {
    	
    	return service.getStaff(true);

    }
    
    public List<Person> getInactiveSaff() {
    	
        return service.getStaff(false);

    }
    
    public List<Person> getAllStaff() {
    	
        return service.getAllStaff();

    }
    
    
 
    public void setService(PeopleService service) {
    	
        this.service = service;
        
    }

	/**
	 * @return the newCourse
	 */
	public Person getNewPerson() {
		
		this.newPerson = new Person();
		return newPerson;
	
	}

	/**
	 * @param newCourse the newCourse to set
	 */
	public void setNewPerson(Person person) {
		
		this.newPerson = person;
	
	}
	
	public void saveNewPerson() {
		
		// SERVICE CALL:
		
	}
    
}