package test5;

public class StudentMain {
	public static void main(String[] args) {
		StudentModule obj = new StudentModule();
		
		obj.studentInformationInput();
		obj.marksCalculation();
		obj.resultDisplay();
		System.out.println("===============================");
		obj.highestSearch();
		obj.highestDisplay();
	}

}
