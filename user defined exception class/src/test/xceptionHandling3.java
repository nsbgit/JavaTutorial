package test;

class Excep extends Exception//should write
{
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
	void f1() throws Excep
	{
		throw new Excep("User defined");
	}
}

public class xceptionHandling3
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("aaa");
			//throw new Excep("User defined");//object of user def class
			AB ob1 = new AB();
			ob1.f1();
		}catch(Excep e)
		{
			System.out.println(e.info());
			
		}
		

	}

}
