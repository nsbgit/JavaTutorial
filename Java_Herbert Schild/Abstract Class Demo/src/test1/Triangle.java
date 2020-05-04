package test1;

public class Triangle extends Figure
{
	public Triangle(double dim1, double dim2)
	{
		super(dim1, dim2);
	}

	@Override
	double area()
	{
		System.out.println("Inside area of triangle\n\n");
		return (0.5*dim1*dim2);
	}
}
