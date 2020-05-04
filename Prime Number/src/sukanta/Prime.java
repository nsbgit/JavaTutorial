package sukanta;

public class Prime 
{
	private int num;
    private int count;
    
    Prime()
    {
        num = 5;
        count = 0;
    }
    
    void calculation()
    {
        for(int i = 2;i <num;i++)
        {
            if(num%i == 0)
            {
                count++;
            }
        }
    }
    
    void display()
    {
        if(count == 0)
        {
            System.out.println(num + " is a prime number");
        }
        else
        {
            System.out.println(num + " is not a prime number");
        }
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Prime p1 = new Prime();
        p1.calculation();
        p1.display();
		// TODO Auto-generated method stub

	}

}
