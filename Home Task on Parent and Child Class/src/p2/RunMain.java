package p2;

public class RunMain
{
	public static void main(String[] args)
	{
		/*p1.Vehicle mainVehicle = new p1.Vehicle();
		p1.Car mainCar = new p1.Car();
		Truck mainTruck = new Truck();*/
		
		p1.VehicleModule mainVehicleModule = new p1.VehicleModule();
		p1.CarModule mainCarModule = new p1.CarModule();
		TruckModule mainTruckModule = new TruckModule();
		SpeedCompare mainSpeedCompare = new SpeedCompare();
		
		mainVehicleModule.vehicleInput();
		mainCarModule.carInput();
		mainTruckModule.tuckInput();
		
		mainCarModule.displayCar();
		mainTruckModule.displayTruck();
		mainSpeedCompare.print();
		mainSpeedCompare.compare();
	}

}
