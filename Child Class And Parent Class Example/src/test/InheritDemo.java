package test;

public class InheritDemo
{

	public static void main(String[] args)
	{
		A8 ob1 = new A8();//ob1 object(of parent class) can access only parent class
		
		ob1.f1();//it will call f1() function from parent class
		
		//ob1.f2();
		/*this line will give error because ob1 can access only
		 * parent class but f2() is present in child class and
		 * ANY OBJECT OF PARENT CLASS CAN NOT ACCESS THE CHILD CLASS
		 * */
		
		
		B8 ob2 = new B8();
		/* It will access both child class and parent class.
		 * First it will search the function or variable is present
		 * in child class or not. If it is not found in child class then it will go for parent class
		 * */
		
		ob2.f3();
		/* Like as above description ob2 object will call f3() function.
		 * First it will check child class having it or not. If not found
		 * in child class then it will go for parent class. As this is OVER RIDDING
		 * function (i.e. it is present in both parent and child class function with
		 * same function name, same argument, same return type, same access specifier),
		 * it is found in child class so it will not go to parent class and parent
		 * class f3() will not be executed.
		 * */
		ob2.f1();//not found in child class it will go to parent class
		ob2.f2();//found in child class
		
		
		A8 refA;//It will create a reference of A8 parent class only
		refA = ob1;//It can access parent only
		/* This line will make refA an object from a parent class reference and
		 * it will point to parent class object ob1 
		 * */
		refA.f1();// It will call parent class function f1()
		
		
		B8 refB;//It will create a reference of B8 child class
		refB = ob2;//It can access both parent and child
		/* This line will make refB an object from a reference and
		 * it will point to child class object ob2 
		 * */
		refB.f1();// It will call f1() from parent class
		refB.f2();// It will call f2() from child class
		//refB.f3();
		
		refA = ob2;//only access parent
		/* For this line parent class reference refA will point to the
		 * child class object ob2 but it cannot access child class, it can only 
		 * access parent class because it is now the object of parent class
		 * 
		 * For understanding PARENT CLASS REFERENCE CAN CONTROL CHILD CLASS OBJECT BUT
		 * CHILD CLASS REFERENCE CANNOT CONTROL PARENT CLASS OBJECT.
		 * */
		refA.f1();// It will access f1() from parent class
		refA.f3();//EXCEPTION CASE for over riding function and it will access child class
		/* When we want to try to access here OVER RIDING function it
		 * will first access child.
		 * As it will find the OVER RIDING function in child class every
		 * time it will not use that OVER RIDING function present in 
		 * parent class.
		 * */
		
		//refA.f2();
		/* As f2() is not over riding function. It cannot access f2() from
		 * child class. It will give an error.
		 * */
	
		//refB = ob1;
		/* The above line will give error because as above mentioned
		 * PARENT REFERENCE CAN CONTROL CHILD CLASS OBJECT BUT
		 * CHILD CLASS REFERENCE CANNOT CONTROL PARENT CLASS OBJECT.
		 * */
	}

}
