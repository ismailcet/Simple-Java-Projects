package KodlamaIoExercise.entities;

public class Tuitors {
	private int tuitorId;
	private String tuitorName;
	private String tuitorLastName;
	
	
	public Tuitors(int tuitorId, String tuitorName, String tuitorLastName) {
		this.tuitorId = tuitorId;
		this.tuitorName = tuitorName;
		this.tuitorLastName = tuitorLastName;
	}


	public int getTuitorId() {
		return tuitorId;
	}


	public void setTuitorId(int tuitorId) {
		this.tuitorId = tuitorId;
	}


	public String getTuitorName() {
		return tuitorName;
	}


	public void setTuitorName(String tuitorName) {
		this.tuitorName = tuitorName;
	}


	public String getTuitorLastName() {
		return tuitorLastName;
	}


	public void setTuitorLastName(String tuitorLastName) {
		this.tuitorLastName = tuitorLastName;
	}
	
	
	
}


