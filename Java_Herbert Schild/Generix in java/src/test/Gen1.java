package test;

class GenericClass<ClassName>//Here ClassName belongs to Wrapper class
{
	private ClassName firstValue;
	private ClassName secondValue;
	/* Here we can only use wrapper class we can't use
	 * Primitive data types and the firstValue is a reference
	 * */
	
	GenericClass(ClassName firstValue, ClassName secondValue)// ClassName f1 = 5;
	{
		this.firstValue = firstValue;
		this.secondValue = secondValue;
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
		GenericClass<Integer> ob1 = new GenericClass<Integer>(5,10);
		GenericClass<String> ob2 = new GenericClass<String>("Hello", "Hi");
		ob1.display();
		ob2.display();	
	}

}
