package t1;

public class A4
{
	A4()
	{
		System.out.println("HI");
	}
	/* N. B:- If we didn't write A4() constructor it will give error because we are using here
	 * 		  a user defined constructor so system defined constructor will not work automatically.
	 * 		  To solve this error we must have to write this A4() constructor.
	 * */
	
	A4(int p)
	{
		System.out.println("Overlodded");
	}

}
