package KodlamaIoExercise.business;


import java.util.ArrayList;

import KodlamaIoExercise.dataAccess.CoursesDao;
import KodlamaIoExercise.entities.Course;
import KodlamaIoExercise.logger.Logger;

public class CourseManager {
	private CoursesDao courseDao;
	private ArrayList<Course> courses;
	private Logger[] loggers;
	
	public CourseManager(CoursesDao courseDao,Logger[] loggers) {
		this.courseDao=courseDao;
		this.courses=courseDao.getAllCourses();
		this.loggers=loggers;
	}
	
	public void add(Course course) throws Exception{
		for(Course c : courses) {
			if(course.getCoursePrice()>=0 || course.getCourseTitle().equalsIgnoreCase(c.getCourseTitle())) {
				courseDao.add(course);
			}else {
				throw new Exception("Bu ad ile Kursumuz vardır veya Fiyatınız 0`dan düşük olamaz!");
			}
		}
		for(Logger logger:loggers) {
			logger.log(course.getCourseTitle());
		}
	}
}
