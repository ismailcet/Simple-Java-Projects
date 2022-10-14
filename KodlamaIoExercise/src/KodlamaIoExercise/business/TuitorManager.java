package KodlamaIoExercise.business;

import java.lang.System.Logger;
import java.util.ArrayList;
import java.util.Iterator;

import KodlamaIoExercise.dataAccess.TuitorsDao;
import KodlamaIoExercise.entities.Tuitors;

public class TuitorManager {
	private TuitorsDao tuitorDao;
	private ArrayList<Tuitors> tuitors;
	private Logger[] loggers;
	
	public TuitorManager(TuitorsDao tuitorDao,Logger[] loggers) {
		this.tuitorDao = tuitorDao;
		this.tuitors=tuitorDao.getAllteacher();
		this.loggers = loggers;
	}
	
	public void add(Tuitors tuitor) {
		for(Tuitors t :tuitors ) {
			if(!t.getTuitorName().isEmpty()) {
				tuitorDao.add(t);
			}
		}
		for(Logger logger:loggers) {
			System.out.println(logger);
		}
	}
}
