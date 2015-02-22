package com.gregpatnude.zrtest.factories;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.gregpatnude.zrtest.datamodels.Course;
import com.gregpatnude.zrtest.enums.PersonType;

public class CourseFactory {
	
	private static final String[] courseNames = {"Math 100", "Math 331", "Calculus 3", "Physics", "Computer Science: Algorithms", "Business Economics", "Macro-economics: An Introduction", "Introduction to Computers", "Biological Science 100", "Chemistry 400", "Distributed Systems Programming", "Enterprise Software Integration", "RDBMS Systems", "Data Structures", "Parallel Processing", "Fly Fishing in Montana", "Heat Transfer &amp; Fluid Flow", "Skiing Whitefish", "Nuclear Physics", "Music Appreciation"};
	
	/// LETS KEEP IT SINGLETON:
	private CourseFactory() {}
	
	public static Course getRandomCourse(int id) {
		
		Course cr = new Course();
		cr.setId(id);
		cr.setCourseName(getRandomCourseName());
		cr.setInstructor(PeopleFactory.newRandomPerson(id, PersonType.INSTRUCTOR, 27, true));
		cr.setStartDate(getStartDate());
		cr.setEndDate(getEndDate(cr.getStartDate()));
		cr.setStudents(PeopleFactory.getRandomStudents());
		
		// AND RETURN:
		return cr;
				
	}
	
	private static Date getStartDate() {
	
    	GregorianCalendar gc = new GregorianCalendar();
    	
        gc.set(gc.YEAR, PeopleFactory.randBetween(gc.get(gc.YEAR), 2));
        gc.set(gc.MONTH, PeopleFactory.randBetween(gc.get(gc.MONTH), 12));
        gc.set(gc.DAY_OF_MONTH, PeopleFactory.randBetween(1, 13));
        
        // AND RETURN:
        return gc.getTime();
		
		
	}
	
	private static Date getEndDate(Date start) {
		
		// ADD 45 DAYS:
		start.setTime(start.getTime() + 45 * 1000 * 60 * 60 * 24);
		
		// AND RETURN:
		return start;
		
	}
	
	private static String getRandomCourseName() {
		
		return PeopleFactory.getRandomName(courseNames);
		
	} 

}
