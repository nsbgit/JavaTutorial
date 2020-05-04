package abstractClassDemo;

public class AbstractClassDemo
{


	public static void main(String[] args) 
	{
		//A5 ob1 = new A5();
		/* We can't create object of a abstract class
		 * We can only create it's reference
		 * */
		/* To access function of abstract class we have to do that
		 * in the following way
		 * 1. Create object of child class
		 * 2. Then call it from child class
		 * */
		B5 ob1 = new B5();
		ob1.f1();//Abstract function calling
		ob1.f3();
		ob1.f2();//Abstract function calling
	}

}
