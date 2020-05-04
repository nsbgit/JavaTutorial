package module;

import java.util.Scanner;

import data.CarData;

import data.VehicleData;

public class CarModule extends VehicleModule
{
	Scanner sc = new Scanner(System.in);
	
	data.CarData objCar = new data.CarData();
	//Vehicle vehicleCar = new Vehicle();
	
	public void carInput()
	{
		System.out.println("Enter passenger number of car:");
		objCar.setCarPassengerNumber(sc.nextInt());
	}
	
	
	public void displayCar()
	{
		//System.out.println("Wheels of car	:	" + vehicleCar.getWheel());
		System.out.println("Wheels of car	:	" + objCar);
		System.out.println("Speed of car	:	" + objCar.getSpeed());
		System.out.println("Passengers of car	:	" + objCar.getCarPassengerNumber());
	}
}