
public class MainEx1 
{
	
	public static void main(String[] args)
	{
		int a[] = new int [5];
		System.out.println("Before Exception");
		try
		{
			System.out.println("Inside try  block");
			//a[2]=100;
			a[8] = 100; //jumps to catch body
			//int z =5/0;
			System.out.println("HI");
			System.out.println("Hello");
		}
		catch(ArithmeticException |NullPointerException ae) 
		{
			System.out.println("AE block");
			System.out.println(ae.toString());
			
		}
		catch(Exception ex)//class name [Exception] variable name [ex] = reference
		{	                 //ex =object created by jvm
			System.out.println("Catch block");
			
			System.out.println(ex.toString()); //system defined function and gets the clas name and returns string
												//ex belongs to where it extracts the class name ->String
		}
		
		System.out.println("After Exception");
		for(int i=0;i<5;i++)
		{
			System.out.println(i);	
		}
		
	}

}