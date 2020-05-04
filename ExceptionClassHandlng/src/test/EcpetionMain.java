package test;

class Excep extends Exception
{
	/* To create user defined exception instead of system
	 * defined we should create class which must be a child of Exception class
	 * */
	private String s;
	
	Excep(String s1)
	{
		s = s1;
	}
	
	String info()
	{
		return s;
	}
	

}


class AB
{
	void f1() throws Excep//We can write throws only before Exception class or its child class
	{
		throw new Excep("In normal class");//Excep class object creation i.e. error occurred.
	}
}
	
public class EcpetionMain
{
	public static void main(String[] args) 
	{
		AB obj = new AB();
		
		try
		{
			//throw new Excep("In try block");
			obj.f1();
			
		}catch(Excep e)//first e is reference then after catching object from try block it becomes object
		{
			System.out.println(e.info());//function calling by objectname.functionname
		}

	}

}
