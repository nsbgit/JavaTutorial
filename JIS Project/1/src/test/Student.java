package test;

public class Student {
	int age;
	String name;
	Student(int g,String m) {
		age=g;
		name=m;
	}
	void cal() throws AgeException {
		if(age<16)
			throw new AgeException("Invalid");
		else {
			System.out.println("Welcome to school");
			System.out.println("Name="+name);
			System.out.println("Age="+age);
		}
	}
}
