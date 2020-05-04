package test;

/* Interface is nothing but a block of code where we can do function declaration
 * */
interface I2
{
	void f1();//only function declaration
}


interface I3
{
	void f2();
}


interface I4 extends I2,I3
{
	/* 1. Interface can have multiple inheritance
	 * 2. This I4 interface can access all of its parent interface
	 * */
	void f3();
}


class All implements I4//attach interface with class
{
	/* 1. We have to make all function over riding, which can be accessed by I4
	 * 2. We must have to use "public" access specifier for that over riding function.
	 *    Otherwise it will give an error.
	 * 3. We can't create object of interface, but we can create its reference.
	 * */
	public void f1()
	{
		System.out.println("F1");
	}
	
	public void f2()
	{
		System.out.println("F2");
	}
	
	public void f3()
	{
		System.out.println("F3");
	}
}


public class InterfaceInhertence
{

	public static void main(String[] args)
	{
		All ob1 = new All();
		
		ob1.f1();
		ob1.f2();
		ob1.f3();

	}

}