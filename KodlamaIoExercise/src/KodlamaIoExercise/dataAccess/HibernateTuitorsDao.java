package KodlamaIoExercise.dataAccess;

import java.util.ArrayList;

import KodlamaIoExercise.entities.Tuitors;

public class HibernateTuitorsDao implements TuitorsDao{

	@Override
	public void add(Tuitors tuitor) {
		System.out.println("Öğretmen verileri Hibernate ile kaydedildi.");
		
	}

	@Override
	public ArrayList<Tuitors> getAllteacher() {
		// TODO Auto-generated method stub
		ArrayList<Tuitors> tuitors = new ArrayList<>();
		tuitors.add(new Tuitors(1, "Engin", "Demiroğ"));
		tuitors.add(new Tuitors(2, "Osman", "Saray"));
		tuitors.add(new Tuitors(3, "Ahmet", "Yücel"));

		
		return tuitors;
	}

}
