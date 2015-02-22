package com.gregpatnude.zrtest.view;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import services.CoursesService;

import com.gregpatnude.zrtest.datamodels.Course;
 
@ManagedBean(name="coursesView")
@ViewScoped
public class CoursesView implements Serializable {
     
    /**
	 * 
	 */
	private static final long serialVersionUID = 4498078955534869386L;

    @ManagedProperty("#{coursesService}")
    private CoursesService service;
    
    private Course newCourse = new Course();
 
    public List<Course> getActiveCourses() {
    	
    	return service.getCourses(true);

    }
    
    public List<Course> getInactiveCourses() {
    	
        return service.getCourses(false);

    }
 
    public void setService(CoursesService service) {
    	
        this.service = service;
        
    }

	/**
	 * @return the newCourse
	 */
	public Course getNewCourse() {
		
		return newCourse;
		
	}
	

	/**
	 * @param newCourse the newCourse to set
	 */
	public void setNewCourse(Course newCourse) {
		
		this.newCourse = newCourse;
		
	}
    
}