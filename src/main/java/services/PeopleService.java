/**
 * 
 */
package services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.gregpatnude.zrtest.datamodels.Course;
import com.gregpatnude.zrtest.datamodels.Person;
import com.gregpatnude.zrtest.enums.PersonType;
import com.gregpatnude.zrtest.factories.PeopleFactory;

@ManagedBean(name = "peopleService")
@ApplicationScoped
public class PeopleService {
	
	private int allStudents = 581;
	private int activeStudents = 379;
	private int allStaff = 91;
	private int activeStaff = 63;
	
	public PeopleService() {
		
		
	}
     
    public List<Person> getStudents(boolean active) {
        
    	List<Person> students = new ArrayList<Person>();
    	int minimumAge = 16;
    	int limit = (active) ? activeStudents : allStudents - activeStudents;
        
        for (int i = 0 ; i < limit; i++) {
        
        	students.add(PeopleFactory.newRandomPerson(i + 1, PersonType.STUDENT, minimumAge, active));
        
        }
         
        return students;

    }

	public List<Person> getAllStudents() {
        
    	List<Person> students = new ArrayList<Person>();
    	int minimumAge = 16;
        
        for (int i = 0 ; i < allStudents; i++) {
        	
        	students.add(PeopleFactory.newRandomPerson(i + 1, PersonType.STUDENT, minimumAge, PeopleFactory.getRandomActive()));
        
        }
         
        return students;

    }

    public List<Person> getStaff(boolean active) {
        
    	List<Person> students = new ArrayList<Person>();
    	int minimumAge = 27;
    	int limit = (active) ? activeStaff : allStaff - activeStaff;
        
        for (int i = 0 ; i < limit; i++) {
        
        	students.add(PeopleFactory.newRandomPerson(i + 1, PersonType.INSTRUCTOR, minimumAge, active));
        
        }
         
        return students;

    }

	public List<Person> getAllStaff() {
        
    	List<Person> students = new ArrayList<Person>();
    	int minimumAge = 27;
        
        for (int i = 0 ; i < allStaff; i++) {
        	
        	students.add(PeopleFactory.newRandomPerson(i + 1, PersonType.INSTRUCTOR, minimumAge, PeopleFactory.getRandomActive()));
        
        }
         
        return students;

    }

}