package test1;

public class Super1
{
	double height, wedth, depth;
	
	Super1(double height, double wedth, double depth)
	{
		this.height = height;
		this.depth = depth;
		this.wedth = wedth;
		
		System.out.println("You have entered in Super1 class :\n");
		System.out.println("Height = " + this.height);
		System.out.println("Wedth = " + this.wedth);
		System.out.println("Depth = " + this.depth);
	}
	
	
	void print()
	{
		System.out.println("The volume is :	" + height*wedth*depth);
	}
}
