package p1;

import java.util.Scanner;

public class CarModule
{
	Scanner sc = new Scanner(System.in);
	
	Car objCar = new Car();
	//Vehicle vehicleCar = new Vehicle();
	
	public void carInput()
	{
		System.out.println("Enter passenger number of car:");
		objCar.setCarPassengerNumber(sc.nextInt());
	}
	
	
	public void displayCar()
	{
		//System.out.println("Wheels of car	:	" + vehicleCar.getWheel());
		System.out.println("Wheels of car	:	" + objCar.getWheel());
		System.out.println("Speed of car	:	" + objCar.getSpeed());
		System.out.println("Passengers of car	:	" + objCar.getCarPassengerNumber());
	}
}