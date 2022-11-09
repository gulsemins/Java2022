package kodlamaioOdev3.dataAccess.Concerete;

import kodlamaioOdev3.dataAccess.Abstract.CourseDao;
import kodlamaioOdev3.entities.Course;

public class JdbcCourseDao implements CourseDao {
	public void add(Course course) {
		System.out.println("JDBC ile eğitime eklendi" + course.getName());
	}

}
