package sir;

import java.io.*;

public class Vehicle
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
