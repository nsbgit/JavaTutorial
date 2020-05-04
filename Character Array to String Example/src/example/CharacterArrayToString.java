package example;

public class CharacterArrayToString
{
	public static void main(String[] args)
	{
		char[] myString = new char[] {'T', 'H', 'I', 'S', ' ',  'I', 'S', ' ', 'T', 'E', 'S', 'T'};
		 
        String output1 = new String(myString);
        System.out.println("By passing the character array as argument of String constructor : " + output1);
 
        String output2 = String.valueOf(myString);
        System.out.println("By using of String.valueOf(char[]) function : " + output2);
        
        /*String output3 = myString.toString();
        System.out.println("By using of char[].toString() function : " + output3);*/
	}

}
