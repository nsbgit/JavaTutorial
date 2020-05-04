package test3;

public class ExpMain 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello");
		try
		{
			System.out.println("Try Block");
			int z =5/2;
			System.out.println("Hi");
		}
		catch(Exception ex)
		{
			System.out.println("Catch Block");
			System.out.println(ex.toString());
		}
		finally
		{
			System.out.println("Finally Block");
		}
		System.out.println("After Finally");
	}

}
