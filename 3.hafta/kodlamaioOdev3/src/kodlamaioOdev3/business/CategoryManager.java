package kodlamaioOdev3.business;

import java.util.List;

import kodlamaioOdev3.dataAccess.Abstract.CategoryDao;
import kodlamaioOdev3.dataAccess.Concerete.JdbcCategoryDao;
import kodlamaioOdev3.entities.Category;
import kodlamaioOdev3.logger.Logger;

public class CategoryManager {
	private CategoryManager categoryDao;
	private List<Category> categories;
	private Logger[] loggers;
	
	public CategoryManager(CategoryManager jdbcCategoryDao) {
		this.categoryDao = jdbcCategoryDao;
		this.loggers = loggers;
	}

	public CategoryManager(JdbcCategoryDao jdbcCategoryDao) {
		// TODO Auto-generated constructor stub
	}

	public void add(Category category) throws Exception {
		for (Category category1 : categories) {
			if (category1.getName() == category1.getName()) {
				throw new Exception("Bu isimle bir kategori bulunmaktadır. Lütfen farklı bir isim giriniz.");
			}

		}
		
		categoryDao.add(category);
		
	}	

}
