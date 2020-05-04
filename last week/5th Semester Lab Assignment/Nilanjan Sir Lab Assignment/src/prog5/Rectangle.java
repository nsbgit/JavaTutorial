package prog5;

public class Rectangle implements Area {
	private double length;
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	private double width;
	
	@Override
	public double computeArea() {
		System.out.println("------ RECTANGLE ------");
		System.out.println("Length	:	" + this.getLength());
		System.out.println("Width	:	" + this.getWidth());
		System.out.println("Area	:	" + (this.getLength() * this.getWidth()));
		System.out.println();
		return 0;
	}

}
