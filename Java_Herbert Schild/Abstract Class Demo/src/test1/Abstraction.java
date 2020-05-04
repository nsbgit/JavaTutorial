package test1;

public class Abstraction
{
	public static void main(String[] args)
	{
		Rectangle objRectangle = new Rectangle(10.5, 16.87);
		Triangle objTriangle = new Triangle(16.23, 5.27);
		
		Figure refFigure;
		
		refFigure = objRectangle;
		System.out.println("Area of rectangle is : " + refFigure.area());
		
		refFigure = objTriangle;
		System.out.println("Area of triangle is : " + refFigure.area());
	}

}
