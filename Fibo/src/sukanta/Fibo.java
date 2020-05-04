package sukanta;

public class Fibo {
	private int a;
    private int b;
    private int c;
    private int num;
    
    Fibo()
    {
        a = 0;
        b = 1;
        c = 0;
        num = 10;
    }
    
    void cal_dis()
    {
        System.out.println("The Fibonacci Series of "+num+" items :\n");
        System.out.println("    "+a);
        System.out.println("    "+b);
        for(int i=1; i<=num-2; i++)
        {
            c = a+b;
            a=b;
            b=c;
            System.out.println("    "+c);
        }
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fibo f1 = new Fibo();
        f1.cal_dis();
		// TODO Auto-generated method stub

	}

}
