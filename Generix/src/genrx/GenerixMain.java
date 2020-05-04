package genrx;


/* 1. The mechanism is called GENERIX  in java.
 * 2. This is use to use different data type for different memory allocation for object
 *    but every object has same variable name.
 * */

class D<T>//T is a data type variable (which is actually a class variable)
{
	private T firstvalue; //Here T belongs to Wrapper class contains Integer, Double, Character etc.
	private T secondvalue;
	
	D(T f1 , T f2)//Parameterised constructor (constructor with argument)
	{
		/* To store the value here AUTOBOXING & AUTOUNBOXING occurred.
		 * */
		firstvalue = f1;
		secondvalue = f2;
		
	}
	
	void display()
	{
		System.out.println("First Value is = " + firstvalue);
		System.out.println("Second Value is = " + secondvalue);
		
	}
}


public class GenerixMain 
{
	 public static void main(String[] args) 
		{
		 	D<Integer> ob1 = new D<Integer>(5,10);//Creating Generic class object with Integer type class
			D<String> ob2 = new D<String>("HELLO","HI");
			ob1.display();
			ob2.display();
		}
}
