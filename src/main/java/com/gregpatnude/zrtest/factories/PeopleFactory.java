package com.gregpatnude.zrtest.factories;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;

import com.gregpatnude.zrtest.datamodels.Person;
import com.gregpatnude.zrtest.enums.PersonType;

/** 
 * This is a utility class used to generate random Persons suitable for testing or populating a database or whatever.
 * 
 * @author Greg Patnude
 *
 */
public class PeopleFactory {
	
	public static final String[] firstNames = {"Bobby", "Karen", "Ken", "Allison", "Tammy", "Hadoop", "Scott", "Sam", "Gregory", "Virgil", "Reese", "Samantha", "Simon", "Myrtle", "Angela", "Oscar", "Elijah", "Darth", "Princess"};

	public static final String[] lastNames = {"Smith", "Brown", "Venugopal", "Patnude", "Emerson", "Palonis", "Vader", "Leia", "Stevens", "Agnus", "Magnuson", "Dorkinson"};
		
	private static Random rand = new Random();
	
	// PROVATE CONSTRUCTOR --> SIMPLE SINGLETON:
	private PeopleFactory() {}
	
	public static List<Person> getRandomStudents() {
		
		List<Person> students = new ArrayList<Person>();
		int limit = randBetween(1, 41);
		
		for (int s = 1; s <= limit; s++) {
			
			students.add(newRandomPerson(s, PersonType.STUDENT, 17, true));
			
		}
		
		// AND RETURN:
		return students;
				
	}
	
	/** 
	 * This is a utility method to generate a new random person of the specified PersonType [Student, Instructor, etc] with the minimum age specified.
	 * @param id
	 * @param type
	 * @return
	 */
	public static Person newRandomPerson(int id, PersonType type, int minimumAge, boolean active) {
		
    	Person pers = new Person();
    	
    	pers.setId(id);
    	pers.setPersonType(PersonType.STUDENT);
    	pers.setFirstName(PeopleFactory.getRandomName(PeopleFactory.firstNames));
    	pers.setLastName(PeopleFactory.getRandomName(PeopleFactory.lastNames));
    	pers.setBirthday(PeopleFactory.getRandomBirthday(minimumAge));
    	pers.setActive(active);
    	
    	return pers;
		
		
	}
		
	/** 
	 * This method will return a random first or last name, depending on the array of names specified to use.
	 * @param names
	 * @return
	 */
    public static String getRandomName(String[] names) {
		
		return names[Math.abs((0) + rand.nextInt(names.length))];
	
    }
    
    /** 
     * This method generates a random age / birthday for a person within the minimum age specified.
     * @return
     */
    public static Date getRandomBirthday(int minimumAge) {
    	
    	GregorianCalendar gc = new GregorianCalendar();
    	
    	// MUST BE AT LEAST 16 YEARS OLD:
        gc.set(gc.YEAR, randBetween(1940, gc.get(gc.YEAR) - minimumAge));
        gc.set(gc.DAY_OF_YEAR, randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR)));
        
        // AND RETURN:
        return gc.getTime();

    }
    
    public static boolean getRandomActive() {
    	
    	// WEIGHTED: 83% ACTIVE:
    	return (randBetween(1, 100) <= 83);
    	
    }

    /** 
     * Private static method to generate a random number between two points.
     * @param start
     * @param end
     * @return
     */
    public static int randBetween(int start, int end) {
        
    	return start + (int)Math.round(Math.random() * (end - start));
    
    }

}
