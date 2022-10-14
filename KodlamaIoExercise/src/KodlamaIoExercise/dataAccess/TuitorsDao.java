package KodlamaIoExercise.dataAccess;

import java.util.ArrayList;

import KodlamaIoExercise.entities.Tuitors;

public interface TuitorsDao {
	void add(Tuitors tuitor);
	
	ArrayList<Tuitors> getAllteacher();
}
