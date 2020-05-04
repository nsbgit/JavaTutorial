package test3;

public class Ex1
{
	public static void main(String[] args)
	{
		System.out.println("Hello");
		try
		{
			System.out.println("Inside try");
			int z = 5/0;
			System.out.println("Hi");
			
		}catch(Exception e){System.out.println("Catch Block");}
		finally//excecute when exception occur or doesnt occur
		{
			System.out.println("Finally Block");
		}

	}

}
