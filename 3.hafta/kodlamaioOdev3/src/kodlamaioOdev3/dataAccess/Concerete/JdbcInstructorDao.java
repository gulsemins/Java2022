package kodlamaioOdev3.dataAccess.Concerete;

import kodlamaioOdev3.dataAccess.Abstract.InstructorDao;
import kodlamaioOdev3.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {
	
	public void add(Instructor instructor) {
		
		System.out.println("JDBC ile eğitime eklendi" + instructor.getName());
		
	}

}
