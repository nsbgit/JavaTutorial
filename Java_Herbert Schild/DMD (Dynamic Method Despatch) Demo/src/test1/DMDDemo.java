package test1;

public class DMDDemo
{
	public static void main(String[] args)
	{
		/**
		 * Object creation of the classes
		 */
		Parent objParent = new Parent();
		Child objChild = new Child();
		
		/**
		 * Reference creation of Parent class
		 */
		Parent refParent;
		
		/**
		 * Pointing the reference to the super class
		 */
		refParent = objParent;
		refParent.callMe();
		
		/**
		 * Pointing the reference to the sub class
		 */
		refParent = objChild;
		refParent.callMe();
		
		/**
		 * Actually when the number of classes increase with inheritance property then
		 * if we want to access a overridden say 75th positional class then it will override
		 * the 74th then 73rd up to the 1st super class, so the number of override is increased
		 * for direct object creation of that particular class. To solve this problem we have to create
		 * a reference of the top most class and and then assign the particular class object to that
		 * reference then the override will happen only single time. It is called DMD(Dynamic Method Despatch).
		 */
		
		
		/**
		 * DMD :-
		 * ======
		 * 		DMD is a runtime polymorphorism where super class reference variable can refer to sub class object.
		 */
		
	}

}
