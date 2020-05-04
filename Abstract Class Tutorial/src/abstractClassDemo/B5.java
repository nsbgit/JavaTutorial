package abstractClassDemo;

class B5 extends A5//It means that class B5 is child class of class A5
{
	/*
	 * parent abstract function should be over ride in child class
	 * */
	
	/* Over ride all abstract function present in abstract class
	 * */
	void f1()
	{
		System.out.println("Function over riding");
	}
	
	
	void f8(){}//over riding this function to remove error
	/* If we don't have to need abstract function f8() we have to over
	 * ride that function like as above otherwise it will give error
	 * */
	void f3()//this is separated function of class B5
	{
		System.out.println("Another function");
	}

}
