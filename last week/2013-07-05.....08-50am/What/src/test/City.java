package test;

class A {
	enum City1 {KOLKATA, DELHI, MUMBAI, CHENNAI}
	
	void f1() {
		City1 c1 = City1.KOLKATA;
		System.out.println(c1);
	}
}

public class City {
	
	public static void main(String[] args) {
		A obj = new A();
		obj.f1();
	}

}
