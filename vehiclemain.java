import java.io.*;

class vehicle
{
	private int wheels;
	private int speed;

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	
        void setdata() throws Exception
        {
            System.out.println("Enter The no. of wheels::\n");
 	    wheels= Integer.parseInt(br.readLine());

            System.out.println("Enter The max speed::\n");
	    speed= Integer.parseInt(br.readLine());
        }

        void disp()
        {
              System.out.println("No OF Wheel is " + wheels);
              System.out.println("Speed is " + speed);
        }

        int getdata()
        {
             return speed;
        }
 
}

class car extends vehicle
{
	private int pass;
     
        void setdata() throws Exception
        {
           System.out.println("Enter car information");
           super.setdata();
 
           System.out.println("Enter The max no. of passengers::\n");
	   pass = Integer.parseInt(br.readLine());
        }

        void disp()
        {
           System.out.println("CAR INFORMATION IS....");
           super.disp();
            System.out.println("No of Passenger is  "+pass);
        }
}

class truck extends vehicle
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

class compare
{
     void check(car c, truck t)
     {
       if(c.getdata() > t.getdata())
             System.out.println("CAR SPEED IS MORE THAN TRUCk SPEED");
       else
             System.out.println("TRUCK SPEED IS MORE THAN CAR SPEED");  


     }


}



class vehiclemain
{
	public static  void main(String gd[])throws Exception
	{
	   car c1=new car();
           truck t1 = new truck();
 
          c1.setdata();

          t1.setdata();   
           
          c1.disp();
          t1.disp(); 


          compare c = new compare();
          c.check(c1,t1);    
	
	}
}