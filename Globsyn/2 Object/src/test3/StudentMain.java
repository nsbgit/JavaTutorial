package test3;

public class StudentMain {
	public static void main(String[] args) {
		StudentModule obj = new StudentModule();
		StudentModule obj2 = new StudentModule();
		
		obj.studentInformationInput();
		obj.marksCalculation();
		
		obj2.studentInformationInput();
		obj2.marksCalculation();
		
		
		obj.display();
		obj2.display();
	}

}
