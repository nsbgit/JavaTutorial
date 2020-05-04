package test;

/* 1. The mechanism is called GENERIX  in java.
 * 2. This is use to use different data type for different memory allocation for object
 *    but every object has same variable name.
 * */

class D<T> { //T is a data type variable (which is actually a class variable)
	// This T will take a class name
	private T firstValue; //Here T belongs to Wrapper class contains Integer, Double, Character etc.
	private T secondValue;
	
	
	D(T firstValue, T secondValue) { //Parameterised constructor (constructor with argument)
		/* To store the value here AUTO-BOXING & AUTO-UNBOXING occurred.
		 * */
		this.firstValue = firstValue;
		this.secondValue = secondValue;
	}
	
	
	void display() {
		System.out.println("First value is	:	" + firstValue);
		System.out.println("Second value is	:	" + secondValue);
	}
}

public class GenerixMain {
	public static void main(String[] args) {
		D<Integer> ob1 = new D<Integer>(5, 10); //Creating Generic class object with Integer type class
		D<String> ob2 = new D<String>("Hello", "Hi");
		
		ob1.display();
		ob2.display();
	}

}
