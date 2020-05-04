package test;

public class Ex1
{
	public static void main(String[] args)
	{
		int a[] = new int[5];
		System.out.println("Before exception");
		
		
		a[8] = 100;
		
		System.out.println("After exception");
		for(int i=0;i<5;i++)
			System.out.println(i);
	}

}
