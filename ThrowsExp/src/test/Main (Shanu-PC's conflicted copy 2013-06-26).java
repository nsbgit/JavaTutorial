package test;

class C
{
	void f1() throws Exception	
	{
		/* throws keyword can be only written before any function name within function any
		 * exception occurs this function will return back the object from where the function is called
		 * */
		//NullPointerException np = new NullPointerException();
		//throw np;
		//throw new NullPointerException(); //creating exception explicitly using throw keyword 
		int z= 5/0;
	}
	
	
}


public class Main
{
	public static void main(String[] args) 
	{
		try
		{
			C ob1 = new C();
			ob1.f1();
		}catch(Exception e)
		{
			System.out.println(e.toString());//It will display the class name of which error object is created
		}
		System.out.println("Hello");
	}

}
