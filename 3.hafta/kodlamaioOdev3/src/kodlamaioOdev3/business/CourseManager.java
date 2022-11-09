package kodlamaioOdev3.business;

import java.util.List;

import kodlamaioOdev3.dataAccess.Abstract.CourseDao;
import kodlamaioOdev3.entities.Course;
import kodlamaioOdev3.logger.Logger;

public class CourseManager {
	private CourseDao coursedao;
	private List<Course> _course;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.coursedao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		if(course.getPrice()<0) {
			throw new Exception("Kurs Fiyatı 0 dan küçük olamaz" + course.getPrice());
			}
		for (Course courses: _course) {
			if(courses.getName().equals(course.getName())) {
				throw new Exception("Bu Ders İsmi Sistemde Mevcuttur !!" + course.getName());
			}
		}
		coursedao.add(course);
		for (Logger loggers : loggers) {
			
			loggers.Log();
		
	}	
}}
