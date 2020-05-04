package test1;

public class Rectangle extends Figure
{
	public Rectangle(double dim1, double dim2)
	{
		super(dim1, dim2);
	}

	@Override
	double area()
	{
		System.out.println("Inside area of rectangle\n\n");
		return dim1*dim2;
	}
}
