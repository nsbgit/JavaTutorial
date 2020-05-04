package mySelf2June17;

public class AdditonData
{
	private double[] value;
	private double total;
	private int arraySize;
	
	
	public double[] getValue()
	{
		return value;
	}
	
	
	public void setValue(double[] v1)
	{
		value = v1;
	}
	
	
	public double getTotal()
	{
		return total;
	}
	
	
	public void setTotal(double t1)
	{
		total = t1;
	}
	
	
	public int getArraySize()
	{
		return arraySize;
	}
	
	
	public void setArraySize(int a1)
	{
		arraySize = a1;
	}
	
	//Creates Array of numbers
	void arrayCreation()
	{
		value = new double[arraySize];
	}
}
