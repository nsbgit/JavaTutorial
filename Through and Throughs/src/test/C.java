package test;

class ExceptionHandeling2
{
	void f1() throws Exception
	{
		//NullPointerException np = NUllPointerException();
		//through np;
		int z = 5/0;
	}
	
}

public class C
{
	
	public static void main(String[] args)
	{
		try
		{
			ExceptionHandeling2 ob1 = new ExceptionHandeling2();
			ob1.f1();
		}catch(Exception e)
		{
			System.out.println(e.toString());
		}
		System.out.println("HELLO");
	}

}


