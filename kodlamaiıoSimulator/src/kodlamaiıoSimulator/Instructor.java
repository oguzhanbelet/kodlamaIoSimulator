package kodlamaiýoSimulator;

public class Instructor extends Person{
	String profession;
	
	public Instructor() {
		
	}

	public Instructor(String profession) {
		super();
		this.profession = profession;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	
}
