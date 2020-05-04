package prog5;

public class Circle implements Area {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double computeArea() {
		System.out.println("------ CIRCLE ------");
		System.out.println("Radius	:	" + this.getRadius());
		System.out.println("Area	:	" + (this.getRadius()*pi));
		System.out.println();
		return 0;
	}

}
