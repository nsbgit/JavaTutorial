package t1;

public class B4 extends A4
{
	B4()
	{
		super();
		/* Compiler will create this super function if we didn't write this.
		 * 1. super() function should be written in the first line of a constructor
		 * 2. super() function is used to call parent class constructor from child class constructor
		 * */
		
		//super(5);//we have to use super for argument constructor
		/* 1. Whenever we will use a user defined constructor, system defined constructor
		 *    will not work.
		 * 2. Here we are passing an integer argument as in parent class a constructor is present
		 *    with one argument.
		 * */
		System.out.println("HELLO");
	}


}
