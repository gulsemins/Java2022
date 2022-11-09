package kodlamaioOdev3.business;

import kodlamaioOdev3.dataAccess.Abstract.InstructorDao;
import kodlamaioOdev3.entities.Instructor;
import kodlamaioOdev3.logger.Logger;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;
	
	
	public InstructorManager(InstructorDao instructorDao) {
		this.instructorDao = instructorDao;
		this.loggers=loggers;

	}
	
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		for (Logger logger : loggers) {
			logger.Log();
		}
	}

}
