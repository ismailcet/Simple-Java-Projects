package KodlamaIoExercise.entities;

public class Category {
	private int categoryId;
	private String categoryTitle;
	private String categoryClass;

	public Category(int categoryId , String categoryTitle,String categoryClass) {
		this.categoryId = categoryId;
		this.categoryTitle=categoryTitle;
		this.categoryClass=categoryClass;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryTitle() {
		return categoryTitle;
	}

	public void setCategoryTitle(String categoryTitle) {
		this.categoryTitle = categoryTitle;
	}

	public String getCategoryClass() {
		return categoryClass;
	}

	public void setCategoryClass(String categoryClass) {
		this.categoryClass = categoryClass;
	}
	
	
}
