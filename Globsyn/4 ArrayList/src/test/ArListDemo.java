package test;

import java.util.ArrayList; //As ArratList is a system defined class, we have to import this.

class A1 {
	// Here integer is a Wrapper class
	ArrayList<Integer> alist = new ArrayList<Integer>();
	
	void addData() {
		int v = 50;
		for(int i=0; i<5; i++) {
			alist.add(v); // Add is a system defined function, which will add object in ArrayList with Auto-boxing
			v++;
		}
	}
	
	void f1() {
		alist.add(1,500); //add 500 value at index number 1
		/* 1. If we not give any index number it added it in last
		 * 2. add is a system defined function and remove is also
		 * 	  a system defined function
		 * */
		alist.remove(2);
	}
	
	void dispData() {
		for(int i=0; i<alist.size(); i++) { //alist.size() returns the size of ArrayList
			System.out.println(alist.get(i)); //alist.get we can print or use the data object at index i.
		}
	}
	
	void displayArrayListSize() {
		System.out.println("alist.size() ---> " + alist.size());
	}
	
	
}
public class ArListDemo {
	public static void main(String[] args) {
		A1 ob1 = new A1();
		ob1.addData();
		ob1.f1();
		ob1.dispData();
		ob1.displayArrayListSize();
	}

}
