package sir;

public class Vehiclemain
{
	public static void main(String[] args) throws Exception
	{
		Car c1=new Car();
        Truck t1 = new Truck();

       c1.setdata();

       t1.setdata();   
        
       c1.disp();
       t1.disp(); 


       Compare c = new Compare();
       c.check(c1,t1);  

	}

}
