package KodlamaIoExercise.dataAccess;

import java.util.ArrayList;

import KodlamaIoExercise.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Kategoriler verileri Hibernate ile kaydedildi.");

		
	}

	@Override
	public ArrayList<Category> getAllCategory() {
		// TODO Auto-generated method stub
		ArrayList<Category> categories=new ArrayList<>();
		categories.add(new Category(1,"React","Frontend"));
		categories.add(new Category(2,"Java","Backend"));
		categories.add(new Category(3,"Sql","Data"));
		
		
		return categories;
	}

}
