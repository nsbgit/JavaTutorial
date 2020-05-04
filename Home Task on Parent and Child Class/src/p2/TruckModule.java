package p2;

import java.util.Scanner;

public class TruckModule
{
	Scanner sc = new Scanner(System.in);
	
	Truck objTruck = new Truck();
	
	public void tuckInput()
	{
		System.out.println("Enter load limit of truck:");
		objTruck.setTruckLoadLimit(sc.nextDouble());
	}
	
	public void displayTruck()
	{
		System.out.println("Wheels of truck	:	" + objTruck.getWheel());
		System.out.println("Speed of truck	:	" + objTruck.getSpeed());
		System.out.println("Load limit of truck	:	" + objTruck.getTruckLoadLimit());
	}
}
