package inheritanceBasics;

public class SimpleInterface {
	public static void main(String[] args) {
		SuperClass superOb = new SuperClass();
		SubClass subOb = new SubClass();
		
		// The superclass may be used by itself.
		superOb.i = 10;
		superOb.j = 20;
		System.out.println("Contents of superOb : ");
		superOb.showIJ();
		System.out.println();
		
		// The subclass has access to all public members of its superclass.
		subOb.i = 7;
		subOb.j = 8;
		subOb.k = 9;
		System.out.println("Contents of subOb :");
		subOb.showIJ();
		subOb.showK();
		System.out.println();
		
		System.out.println("Sum of i, j and k in subOb : ");
		subOb.sum();
	}

}
