package test;

class ExceptionHandeling2
{
	void f1() throws Exception
	{
		/* 1. Exception is a system defined class.
		 * 2. Whenever any error is occurred a object is created automatically of Exception class or
		 * 	  its child class.
		 * 3. "throws Exception" -----> If within the function body any exception/error occurred it
		 *     will return the exception class object from where the function is called.
		 * */
		
		
		//NullPointerException np = new NullPointerException();
		//throw np;
		//throw new NullPointerException();//This line is a combination of the above two lines.
		int z = 5/0;
		System.out.println("After exception.");
	}
	
}

public class C
{
	
	public static void main(String[] args)
	{
		try
		{
			ExceptionHandeling2 ob1 = new ExceptionHandeling2();
			ob1.f1();//From f1() function the object will be thrown here
		}
		catch(Exception e)// e reference creation of Exception system defined class
		{
			/* catch block catches the object from try block and store that object in e reference
			 * */
			System.out.println(e.toString());
			/* As we can't print object using System.out.println(), so convert e to a string.
			 * e.toString will return the class name in which the error or exception is occurred.
			 * */
		}
		System.out.println("HELLO");
	}

}