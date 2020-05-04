package test;

class D<T>//Here T belongs to Wrapper class
{
	private T firstValue;
	private T secondValue;
	/* Here we can only use wrapper class we can't use
	 * premitive data types and the firstValue is a reference
	 * */
	
	D(T f1, T f2)// T f1 = 5;
	{
		firstValue = f1;
		secondValue = f2;
	}
	
	void display()
	{
		System.out.println("First value is : " + firstValue);
		System.out.println("Second value is : " + secondValue);
	}
}

public class Gen1
{
	public static void main(String[] args)
	{
		D<Integer> ob1 = new D<Integer>(5,10);
		D<String> ob2 = new D<String>("Hello", "Hi");
		ob1.display();
		ob2.display();
		
	}

}
