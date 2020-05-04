package t5;

public class Rectangle implements Area {
	
	@Override
	public double computeArea(double x, double y) {
		System.out.println("The area of the rectangle is : " + (x * y));
		return 0;
	}
}
