package kodlamaioOdev3.dataAccess.Concerete;

import kodlamaioOdev3.dataAccess.Abstract.CategoryDao;
import kodlamaioOdev3.entities.Category;


public class HibernateCategoryDao implements CategoryDao{
	public void add(Category category) {
		System.out.println("Hibernate ile eğitime eklendi"+ category.getName());
		

}}
