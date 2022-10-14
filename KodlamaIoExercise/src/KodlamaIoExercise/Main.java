package KodlamaIoExercise;


import KodlamaIoExercise.business.CategoryManager;
import KodlamaIoExercise.business.CourseManager;
import KodlamaIoExercise.business.TuitorManager;
import KodlamaIoExercise.dataAccess.CategoryDao;
import KodlamaIoExercise.dataAccess.CoursesDao;
import KodlamaIoExercise.dataAccess.HibernateCoursesDao;
import KodlamaIoExercise.dataAccess.JdbcTuitorsDao;
import KodlamaIoExercise.dataAccess.TuitorsDao;
import KodlamaIoExercise.dataAccess.JbdcCategoryDao;
import KodlamaIoExercise.entities.Category;
import KodlamaIoExercise.entities.Course;
import KodlamaIoExercise.entities.Tuitors;
import KodlamaIoExercise.logger.DatabaseLogger;
import KodlamaIoExercise.logger.FileLogger;
import KodlamaIoExercise.logger.Logger;
import KodlamaIoExercise.logger.MailLogger;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger[] loggers= {new DatabaseLogger(),new MailLogger(),new FileLogger()};
		
		Tuitors tuitor1=new Tuitors(4, "İsmail", "Çetin");
		TuitorsDao tuitorDao = new JdbcTuitorsDao();
		
		TuitorManager tuitorManager = new TuitorManager(tuitorDao,loggers);
		try{
			tuitorManager.add(tuitor1);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		//-----------------------------------------------------------------------------------------------------
		Course course1=new Course(4,"JAVA","İSmail Çetin",10);
		CoursesDao courseDao=new HibernateCoursesDao();
		
		CourseManager courseManager=new CourseManager(courseDao, loggers);
		try {
			courseManager.add(course1);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		//-----------------------------------------------------------------------------------------------------
		
		Category category=new Category(5,"C++","Oyun");
		CategoryDao categoryDao=new JbdcCategoryDao();
		
		CategoryManager categoryManager = new CategoryManager(categoryDao, loggers);
		
		try {
			categoryManager.add(category);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
