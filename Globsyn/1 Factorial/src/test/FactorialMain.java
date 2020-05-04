package test;

public class FactorialMain {
	public static void main(String[] args) {
		Factorial f1 = new Factorial();
		f1.calculation();
		f1.display();
	}
	
	/**
	 * The meaning of psvm
	 * ===================
	 * public --->	It can be access publically i.e. can be from
	 * 				any where
	 * static --->	For this we don't have to allocate any memory for
	 * 				executing the main function we can call static function
	 * 				by "objectName.memberName"
	 * void --->	it will return nothing
	 * main --->	function starts from main 
	 * 
	 */
}
