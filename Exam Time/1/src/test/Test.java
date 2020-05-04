package test;

class Number {
	int x;
	void store(Number num) {
		num.x++;
	}
}

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Number n = new Number();
		n.x = 10;
		n.store(n);
		System.out.println(n.x);

	}

}
