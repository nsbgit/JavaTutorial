package sir;

public class Truck extends Vehicle
{
	private int load;
	
    void setdata() throws Exception
    {
        System.out.println("Enter Truck information");
        super.setdata();

       System.out.println("Enter The max load::\n");
       load = Integer.parseInt(br.readLine());
    }

     void disp()
    {
        System.out.println("TRUCK INFORMATION IS....");
        super.disp();
        System.out.println("MAx Load is  "+load);
    }

}
