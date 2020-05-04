package test;

interface I1
{
	void f1();
	void f2();//function declaration only
}


class A7
{}


class A6 implements I1//attach interface
{
	
	/* Over riding of all function body of interface
	 * and make the function public
	 * */
	public void f1()//make over riding with public access specifier
	{
		System.out.println("F1");
	}
	
	public void f2()//make over riding with public access specifier
	{
		System.out.println("F2");
	}
	
	void f3()//Separated function
	{
		System.out.println("F3");
	}
}

public class InterfaceDemo
{

	public static void main(String[] args)
	{
		/* By using class object we can access all interface function as well as own class function
		 * */
		A6 ob1 = new A6();
		ob1.f1();
		ob1.f2();
		ob1.f3();
		
		A7 ob2 = new A7();
		
		I1 ref;//we can only create reference of an interface
		ref = ob1;//implements a6 class object ob1 because it implements the interface I1
		//ref = ob2;
		/* 1. As ob2 is a object of class A7 and the class doesn't implements the interface I1
		 *    it will give an error. Actually interface implements on that class which class object
		 *    can't store interface reference.
		 * 2. Using interface reference we can restrict function in a class (i.e. only some function can be
		 *    accessed)
		 * */
		
		/* By using interface reference and then make that reference object of implementing class
		 * By this we can use only over riding function in class A6.
		 * */
		ref.f1();
		ref.f2();
		//ref.f3();//As we can only call over riding function that is why this line give error
	}

}
