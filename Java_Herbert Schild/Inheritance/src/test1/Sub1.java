package test1;

public class Sub1 extends Super1
{
	double mass;
	
	Sub1(double height, double wedth, double depth, double mass)
	{
		super(height,wedth,depth);
		
		this.mass = mass;
		
		System.out.println("You have entered in Sub1 class :\n");
		System.out.println("Mass = " + this.mass);
	}
	
	/*void print()
	{
		//super.print();
		System.out.println("The weight is :	" + super.height*super.wedth*super.depth*this.mass);
	}*/
}
