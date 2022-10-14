package KodlamaIoExercise.business;


import java.util.ArrayList;

import KodlamaIoExercise.dataAccess.CategoryDao;
import KodlamaIoExercise.entities.Category;
import KodlamaIoExercise.entities.Course;
import KodlamaIoExercise.logger.Logger;

public class CategoryManager {
	private CategoryDao categoryDao;
	private ArrayList<Category> categories;
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao,Logger[] loggers) {
		this.categoryDao=categoryDao;
		this.categories=categoryDao.getAllCategory();
		this.loggers=loggers;
	}
	
	public void add(Category category) throws Exception{
		for(Category cat:categories ) {
			if(category.getCategoryTitle().equalsIgnoreCase(cat.getCategoryTitle())) {
				throw new Exception("Bu Başlıkla Kategory vardır ! ");
			}
		}
		categoryDao.add(category);
		for(Logger log:loggers) {
			log.log(category.getCategoryTitle());
		}
	}
}
