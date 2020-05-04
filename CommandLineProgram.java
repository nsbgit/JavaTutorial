class FactorialModule
{
	private int result;
	private int value;
	
	
	FactorialModule()
	{}

	FactorialModule(int x)//a constructor with one argument(parameterised constructor)
	{
		value = x;
		result = 1;
	}
	
	
	void calculation()
	{
		for(int i=1; i<=value; i++)
		{
			result = result *i;
		}
	}
	
	
	void display()
	{
		System.out.println("The factorial is " + result);
	}
	
	/* As this program first takes value from user then it will
	 * start to run that is why it is call command line program
	 * */
	
	/* It will not run in eclipse.
	 * We have to run this using console
	 * */
}


class FactorialRun
{
	public static void main(String a[])
	{
		int number1 = Integer.parseInt(a[0]);
		int number2 = Integer.parseInt(a[1]);

		FactorialModule fm1 = new FactorialModule(number1);
		FactorialModule fm2 = new FactorialModule(number2);
		FactorialModule fm3 = new FactorialModule();

		
		fm1.calculation();
		fm1.display();

		
		fm2.calculation();
		fm2.display();
	}

}

