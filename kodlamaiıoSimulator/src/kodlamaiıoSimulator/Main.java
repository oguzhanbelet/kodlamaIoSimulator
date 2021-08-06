package kodlamaiıoSimulator;

public class Main {

	public static void main(String[] args) {
				
		StudentManager studentManager = new StudentManager();
		studentManager.add(null);
		
		Student student1 = new Student();
		student1.setFirstName("Oğuz");
		
		User user = new User();
		user.setUserName("userA");
		
		System.out.println(student1.getFirstName());
		
	}

}
