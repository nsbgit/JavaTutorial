package sir;

public class Compare
{
	void check(Car c, Truck t)
    {
      if(c.getdata() > t.getdata())
            System.out.println("CAR SPEED IS MORE THAN TRUCK SPEED");
      else
            System.out.println("TRUCK SPEED IS MORE THAN CAR SPEED");  


    }

}