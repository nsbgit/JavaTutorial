package test;

import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		int a;
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		s=sc.next();
		System.out.print("Enter age");
		a=sc.nextInt();
		Student k=new Student(a,s);
		try {
			k.cal();
		}catch(AgeException e) {}
	}
}
