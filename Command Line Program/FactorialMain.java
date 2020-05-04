class FactorialMain {
	public static void main(String[] args) {
		/*
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		*/
		
		/*
		FactorialModule obj = new FactorialModule(Integer.parseInt(args[0]));
		FactorialModule obj2 = new FactorialModule(Integer.parseInt(args[1]));
		
		obj.factorialCalculation();
		obj.factorialDisplay();
		
		obj2.factorialCalculation();
		obj2.factorialDisplay();
		*/
		
		for(int i=0; i<args.length; i++) {
			FactorialModule obj = new FactorialModule(Integer.parseInt(args[i]));
			
			obj.factorialCalculation();
		obj.factorialDisplay();
		}
	}
}