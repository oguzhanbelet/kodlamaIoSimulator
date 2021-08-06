package kodlamaiıoSimulator;

public class Student extends Person{
	String number;
	
	public Student() {
		
	}

	public Student(String number) {
		super();
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}
