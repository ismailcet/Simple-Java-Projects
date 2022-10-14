package KodlamaIoExercise.dataAccess;

import java.util.ArrayList;

import KodlamaIoExercise.entities.Category;

public interface CategoryDao {
	void add(Category category);
	
	ArrayList<Category> getAllCategory();
}
