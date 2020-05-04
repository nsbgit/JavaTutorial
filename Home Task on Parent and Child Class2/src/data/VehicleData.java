package data;

public class VehicleData
{
	protected int wheel;
	protected double speed;
	
	public int getWheel()
	{
		return wheel;
	}
	
	
	public void setWheel(int w1)
	{
		wheel = w1;
	}
	
	public void dis()
	{
		System.out.println("Is it " + wheel);
	}
	
	public double getSpeed()
	{
		return speed;
	}
	
	
	public void setSpeed(double s1)
	{
		speed = s1;
	}

}
