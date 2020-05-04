package abstractClassDemo;

abstract class A5
{
	void f2()
	{
		System.out.println("Inside Abstract  Class function/ Normal method of abstract function");
	}
	/* Above rule is called COMMON RULE/ NORMAL METHOD.
	 * To access this common rule we have to create a child class
	 * and over ride the function
	 * */
	abstract void f1();//Function with no body is abstract function
	abstract void f8();
	/*
	 *  There must be present at least one abstract function so that
	 *  the is abstract class
	 *  */
	
	/* FEATURES OF ABSTRACT CLASS:-
	 * ============================
	 * 1. Function with no body is abstract function.
	 * 2. If there is present at least one abstract function the class must be abstract class.
	 * 3. "abstract" word can be written before class name and function name.
	 * 4. Abstract class contain normal method.
	 * 5. REFERENCE OF A ABSTRACT CLASS CAN BE CREATED BUT
	 * 	  OBJECT OF A ABSTRACT CLASS CAN'T BE CREATED.
	 * 6. To access the normal method of a abstract class we must have to CREATE A CHILD CLASS and OVER RIDE ALL THE
	 *    FUNCTION OF PARENT ABSTRACT CLASS. If it is not done child class will become a abstract class.
	 * 7. By only creating the child class we can access the normal method of abstract class.
	 * */

}
