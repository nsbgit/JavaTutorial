package example;

public class StringToCharacterArray
{
	public static void main(String[] args)
	{
		String testString = "This Is Test";
		char[] stringToCharArray = testString.toCharArray();

		for (char output : stringToCharArray)//for each loop
		{
			System.out.println(output);
		}
	}
}