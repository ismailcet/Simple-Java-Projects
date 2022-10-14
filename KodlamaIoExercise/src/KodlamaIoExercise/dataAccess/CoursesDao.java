package KodlamaIoExercise.dataAccess;

import java.util.ArrayList;

import KodlamaIoExercise.entities.Course;

public interface CoursesDao {
	void add(Course course);
	
	ArrayList<Course> getAllCourses();
}
