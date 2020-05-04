package t5;

public class Circle implements Area {

	@Override
	public double computeArea(double x, double y) {
		System.out.println("The area of the rectangle is : " + (x * pi));
		return 0;
	}

}
