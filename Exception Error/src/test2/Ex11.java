package test2;

public class Ex11
{
	public static void main(String[] args)
	{
		int a[] = new int[5];
		System.out.println("Before exception");
		
		try
		{
			System.out.println("Inside try block");
			//a[2] = 100;//doesnot not excecute catch block
			a[8] = 100;//jumps to the catch block
			//obj creation sys
			//int z = 5/0;
			System.out.println("Hi");
			System.out.println("Hello");
		}catch(ArithmeticException |NullPointerException ae)
		{
			System.out.println("AE");
		}
		catch(Exception ex)//ex is ref of exception class
		{
			System.out.println("Catch block");
			System.out.println(ex.toString());//extract the class name --->toString
		}
		
		System.out.println("After exception");
		for(int i=0;i<5;i++)
			System.out.println(i);
	}

}
