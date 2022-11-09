package kodlamaioOdev3;

import java.util.ArrayList;
import java.util.List;

import kodlamaioOdev3.business.CategoryManager;
import kodlamaioOdev3.business.CourseManager;
import kodlamaioOdev3.business.InstructorManager;
import kodlamaioOdev3.dataAccess.Concerete.HibernateInstructorDao;
import kodlamaioOdev3.dataAccess.Concerete.JdbcCategoryDao;
import kodlamaioOdev3.dataAccess.Concerete.JdbcCourseDao;
import kodlamaioOdev3.entities.Category;
import kodlamaioOdev3.entities.Course;
import kodlamaioOdev3.entities.Instructor;
import kodlamaioOdev3.logger.DatabaseLogger;
import kodlamaioOdev3.logger.FileLogger;
import kodlamaioOdev3.logger.Logger;
import kodlamaioOdev3.logger.MailLogger;

public class Main {

	public static void main(String[] args) throws Exception {
		
		List<Instructor> instructors = new ArrayList<>();
		Instructor instructor = new Instructor(1, "Ayşe","Yılmaz");
		Instructor instructor2 = new Instructor(2,"Ali", "Yılmaz");
		
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao());
		instructorManager.add(instructor);
		
		List<Course> courses = new ArrayList<>(); 
		Course course = new Course(1, "Java");
		Course course2 = new Course(2,"Python");
		
		CourseManager courseManager =  new CourseManager(new JdbcCourseDao(), null);
		courseManager.add(course);
		Logger[] loggers = {
				new DatabaseLogger(),
				new FileLogger(),
				new MailLogger()
		};
		
		List<Category> categoryes = new ArrayList<>();
		Category category = new Category(2, "Eğitimler");
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao());
		categoryManager.add(category);
		
		
		
		
		
	
		
	

	}

}
