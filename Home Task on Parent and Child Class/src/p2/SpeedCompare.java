package p2;

import p1.VehicleModule;

public class SpeedCompare extends  VehicleModule
{
	p1.VehicleModule scm = new p1.VehicleModule();
	double car,truck;
	
	/*SpeedCompare()
	{
		car = scm.c;
		truck = scm.t;
	}*/
	
	
	void compare()
	{
		if(car>truck)
			System.out.println("Car is fast");
		else if(truck>car)
			System.out.println("Truck is fast");
		else
			System.out.println("Both speed are same");
	}
	void print()
	{
		System.out.println("Car " + car);
		System.out.println("Truck " + truck);
	}

}
