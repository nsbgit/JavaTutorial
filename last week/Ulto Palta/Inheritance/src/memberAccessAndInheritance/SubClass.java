package memberAccessAndInheritance;

// SuperClass's j is not accessible here.

public class SubClass extends SuperClass {
	int total;
	void sum() {
		//total = i + j; // ERROR, j is not accessible here
	}
}
