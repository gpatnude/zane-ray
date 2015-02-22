package com.gregpatnude.zrtest.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TestBean {

    private String firstName = "John";
    private String lastName = "Doe";
    
    private String catchPhrase = null;
    
    public String getCatchPhrase() {
    	
    	// NULL TEST:
    	if (null == catchPhrase) {
    		
    		// INITIALIZE:
    		
    		
    		
    	}
    	
    	// AND RETURN:
    	return catchPhrase;
    	
    }

    public String getFirstName() {
    	
        return firstName;
    
    }

    public void setFirstName(String firstName) {
    
    	this.firstName = firstName;
    
    }

    public String getLastName() {
    
    	return lastName;
    
    }

    public void setLastName(String lastName) {
    
    	this.lastName = lastName;
    
    }

    public String showGreeting() {
    
    	return "Hello" + " " + firstName + " " + lastName + "!";
    
    }

}