/*
 *  In a class hierarchy, private members remain private
 *  to their class.
 *  
 *  This program contain an error and will not compile 
 */


package memberAccessAndInheritance;

// Create a superclass.
public class SuperClass {
	int i; // public by default
	private int j; // private to class SuperClass
	
	void setIJ(int i, int j) {
		this.i = i;
		this.setJ(j);
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}
}
