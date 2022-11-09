package kodlamaioOdev3.dataAccess.Concerete;

import kodlamaioOdev3.dataAccess.Abstract.CategoryDao;
import kodlamaioOdev3.entities.Category;

public class JdbcCategoryDao implements CategoryDao{
	
	public void add(Category category) {
		System.out.println("JDBC ile eğitime eklendi"+ category.getName());
		
	}

}
