package test;
/**
 * Objects may be passed to methods
 * @author Sukanta
 *
 */

class Test {
	int a,b;
	
	//constructor
	Test(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	//return true if ref is equal to the invoking object
	boolean equals(Test ref) {
		if(ref.a == a && ref.b == b) return true;
		else return false;
	}
}

public class PassOb {
	
	public static void main(String[] args) {
		Test obj1 = new Test(100,22);
		Test obj2 = new Test(100,22);
		Test obj3 = new Test(-1,-1);
		
		System.out.println("obj1 == obj2 : " + obj1.equals(obj2));
		System.out.println("obj1 == obj3 : " + obj1.equals(obj3));
	}

}