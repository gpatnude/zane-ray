package services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.gregpatnude.zrtest.datamodels.Course;
import com.gregpatnude.zrtest.factories.CourseFactory;

@ManagedBean(name = "coursesService")
@ApplicationScoped
public class CoursesService {
	
	public CoursesService() {
		
		
	}
     
    public List<Course> getCourses(boolean active) {
        
    	List<Course> courses = new ArrayList<Course>();
        
        for(int i = 0 ; i < 79 ; i++) {
        
        	courses.add(CourseFactory.getRandomCourse(i + 1));
        
        }
         
        return courses;

    }

}