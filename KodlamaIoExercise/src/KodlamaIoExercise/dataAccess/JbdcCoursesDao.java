package KodlamaIoExercise.dataAccess;

import java.util.ArrayList;

import KodlamaIoExercise.entities.Category;
import KodlamaIoExercise.entities.Course;

public class JbdcCoursesDao implements CoursesDao{

	@Override
	public void add(Course course) {
		System.out.println("Kurs verileri JBDC ile kaydedildi.");
		
	}

	@Override
	public ArrayList<Course> getAllCourses() {
		ArrayList<Course> courses=new ArrayList<>();
		courses.add(new Course(1,"JAVA","Engin Demiroğ",12));
		courses.add(new Course(2,"Python","Engin Demiroğ",16));
		courses.add(new Course(3,"C#","Engin Demiroğ",18));
		
		return courses;
	}

}
