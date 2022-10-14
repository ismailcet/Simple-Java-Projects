package KodlamaIoExercise.entities;

public class Course {
	private int courseId;
	private String courseTitle;
	private String tuitors;
	private double coursePrice;
	
	public Course(int courseId, String courseTitle, String tuitors,double coursePrice) {
		this.courseId = courseId;
		this.courseTitle = courseTitle;
		this.tuitors = tuitors;
		this.coursePrice=coursePrice;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public String getTuitors() {
		return tuitors;
	}

	public void setTuitors(String tuitors) {
		this.tuitors = tuitors;
	}

	public double getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}
	
	
	
}
