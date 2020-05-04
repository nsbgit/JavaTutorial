package t5;

import java.util.Scanner;

public class AreaMain {
	private static Scanner sc;

	public static void main(String[] args) {
		int choice;
		sc = new Scanner(System.in);
		
		System.out.println("Enter your choice :\n");
		System.out.println("1. Calculare the area of rectangle.");
		System.out.println("2. Calculare the area of circle.");
		
		choice = sc.nextInt();
		
		switch(choice) {
			case 1:
				System.out.println("Enter width and height:");
				new Rectangle().computeArea(sc.nextDouble(), sc.nextDouble());
				break;
			case 2:
				System.out.println("Enter radius :");
				new Circle().computeArea(sc.nextDouble(), 1);
				break;
			default :
		}

	}

}
