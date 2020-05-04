package t2;

public class B3 extends A3
{
	int x;//Own class variable x.
	
	void f8()
	{
		super.x = 50;//parent class x
		//by super.x compiler understand that its parent class variable
		x = 40;
		System.out.println(super.x + " " + x);
	}
	
	void f1()//Overriding function
	{
		System.out.println("Child Class");
		super.f1();//parent class function
		/* 1. Here super class can be used in any line.
		 * 2. ONLY super() CONSTRUCTOR CALLING FUNCTION MUST BE WRITTEN IN FIRST LINE.
		 * 3. Super function super variable name can be written in any line.
		 * */
		
		/* N. B.:- For parent class and child class cases if a over rided function is called
		 * 		   then it always execute the function body present in child class. But if we
		 * 		   want to access the overriding function from parent class we have to use
		 * 		   super function as above and it can be called from a child class only. As like
		 * 		   here from function f1() is called then child class function will execute
		 * 		   and when it will get super.f1() then it will go to parent class f1() function.
		 * */
	}

}
