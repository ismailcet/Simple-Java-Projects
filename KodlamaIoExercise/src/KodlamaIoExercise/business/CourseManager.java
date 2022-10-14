package KodlamaIoExercise.business;

import java.lang.System.Logger;
import java.util.ArrayList;

import KodlamaIoExercise.dataAccess.CoursesDao;
import KodlamaIoExercise.entities.Course;

public class CourseManager {
	private CoursesDao courseDao;
	private ArrayList<Course> courses;
	private Logger[] loggers;
	
	public CourseManager(CoursesDao courseDao,Logger[] loggers) {
		this.courseDao=courseDao;
		this.courses=courseDao.getAllCourses();
		this.loggers=loggers;
	}
	
	public void add(Course course) {
		for(Course c : courses) {
			if(course.getCoursePrice()>=0) {
				courseDao.add(course);
			}
		}
		for(Logger logger:loggers) {
			logger.log("deneme");
		}
	}
}
