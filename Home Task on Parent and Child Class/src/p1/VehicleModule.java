package p1;

import java.util.Scanner;

public class VehicleModule
{
	Scanner sc = new Scanner(System.in);
	
	Vehicle vcar = new Vehicle();
	Vehicle vtruck = new Vehicle();
	
	
	
	
	public void vehicleInput()
	{
		System.out.println("Enter wheel number of car:");
		vcar.setWheel(sc.nextInt());
		System.out.println("Enter speed of car:");
		vcar.setSpeed(sc.nextDouble());
		//vcar.dis();
		
		System.out.println("Enter wheel number of truck:");
		vtruck.setWheel(sc.nextInt());
		System.out.println("Enter speed of truck:");
		vtruck.setSpeed(sc.nextDouble());
		//vtruck.dis();
		//vcar.dis();
		System.out.println("car:" + vcar.getSpeed());
		System.out.println("truck:" + vtruck.getSpeed());
	}
}
