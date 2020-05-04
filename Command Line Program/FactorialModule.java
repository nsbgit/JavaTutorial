class FactorialModule {
	private int value;
	private int backUpValue;
	private int result;
	
	FactorialModule(int value) {
		this.value = value;
		this.result = 1;
		this.backUpValue = value;
	}
	
	void factorialCalculation() {
		for(int i=1; i<= value; i++)
			result = result * i;
	}
	
	void factorialDisplay() {
		System.out.println("\nFactorial of " + backUpValue + " is : " + result);
	}
}