package memberAccessAndInheritance;

public class Access {
	public static void main(String[] args) {
		SubClass subOb = new SubClass();
		
		subOb.setIJ(10, 12);
		subOb.sum();
		System.out.println("Total is = " + subOb.total);
	}

}
