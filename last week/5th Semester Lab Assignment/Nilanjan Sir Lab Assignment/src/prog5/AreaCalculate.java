package prog5;

import java.util.Scanner;

public class AreaCalculate {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		Rectangle objRec = new Rectangle();
		Circle objCir = new Circle();
		
		System.out.println("=====================================================");
		System.out.println("Program for area calculation of rectangle and circle.");
		System.out.println("=====================================================");
		
		System.out.println("Enter length of a rectangle :");
		objRec.setLength(sc.nextDouble());
		
		System.out.println("Enter width of a rectangle :");
		objRec.setWidth(sc.nextDouble());
		
		objRec.computeArea();
		
		System.out.println("Enter radius of a circle :");
		objCir.setRadius(sc.nextDouble());
		
		objCir.computeArea();
	}

}
