package example;

public class CharacterToStringExample
{
	public static void main(String[] args)
	{
		char ch = 'U';

        // char to string using Character class
		/*
		 *Character to String Example 1: Character.toString
		 *Character class provides a convenient toString()
		 *method which takes a character and return its String equivalent.
		 *toString() is static method in Character class and can be accessed
		 *using class name like Character.toString(). here is an example of
		 *converting char to String using Character.toString():
		 * */
        String charToString = Character.toString(ch);
        System.out.println("Converting Char to String using Character class: " + charToString);
        
        

        // char to String using String concatenation
        /*
         *Character to String Example 2: String concatenation operator
         *In Java + can be used to concatenate String but it can also
         *concatenate an String and a character and can result another
         *String. This is another shortcut you can use to convert Character
         *into String in Java. here is an example of converting character
         *to String in Java:
         * */
        String str = "" + ch;
        System.out.println("Converting Char to String using String concatenation: " + str);

        
        // char to String using anonymous array
        /*
         * Character to String Example 3: using Anonymous Array
         *Anonymous array in Java can be used to wrap a single
         *character into a char array and than passing that array
         *into String constructor. a new String will be created
         *from that character. see below for char to String example in Java:
         */
        String fromChar = new String(new char[] { ch });
        System.out.println("Converting Char to String using anonymous array: " + fromChar);
        

        // char to String using String valueOf
        /*
         *Character to String Example 4: using String.valueOf()
         *String.valueOf() is another neat and clean way of
         *converting character into String in Java. I like this
         *method because its simple and straightforward or I say
         *neat and clear.
         *See following character to String conversion example in Java
         * */
        String valueOfchar = String.valueOf(ch);
        System.out.println("Converting Char to String using String valueOf: " + valueOfchar);
	}

}
