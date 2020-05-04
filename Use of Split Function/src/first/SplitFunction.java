package first;

public class SplitFunction
{
	public static void main(String[] args)
	{
		String str = "E1:John:Paris";
		String[] strArray = new String[5];
		
		strArray = str.split(":");
		
		for(String element : strArray)
		{
			System.out.println(element);
		}
	}

}
