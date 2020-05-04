package t1;

interface I2
{
	void f1();
	void f5();
}


interface I3
{
	void f2();
	void f5();//ambiguity (i.e. child has more than one parent)
	//ambiguity is removed because two function has same function name but there are no body
}


interface I4 extends I2,I3//Multiple inheritance can only occur in interface
{
	void f3();
}


class All implements I4
{
	/* We must have to over ride all the function of interface to avoid error
	 * We must have to write public before the over riding function
	 * */
	public void f1()//Must write public
	{
		System.out.println("F1");
	}
	
	public void f2()
	{
		System.out.println("F2");
	}
	
	public void f3()
	{
		System.out.println("F3");
	}
	public void f5()
	{
		System.out.println("F5");
	}
}


public class InterfaceInheritence
{

	public static void main(String[] args)
	{
		//I1 i = new I1();//We can't create object of a interface
		All ob1 = new All();
		
		ob1.f1();
		ob1.f2();
		ob1.f3();
		ob1.f5();
	}

}
