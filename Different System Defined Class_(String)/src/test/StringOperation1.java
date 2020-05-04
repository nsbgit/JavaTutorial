package test;

public class StringOperation1 
{
	public static void main(String[] args) 
	{
		//String is system defined class
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		String s3 = "abcba";
		
		System.out.println(s1.length());//length() is a function here not variable
		//prints the length of string
		System.out.println(s1.toUpperCase());
		
		if(s1 == s2)//it checks if s1 and s2 share same memory or not
		{
			System.out.println("AA");
		}
		else
		{
			System.out.println("BB");
		}
		
		if(s1.equals(s2))//Checks the strings are same or not
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}
		
		System.out.println(s1.substring(2));
		/*
		 * H	e	l	l	o
		 * 0	1	2	3	4
		 * 			<------->
		 * it will print only this char
		 * */
		String ss = s1.substring(2);
		System.out.println(ss);
		/*
		 * Above same method in 2 lines
		 * */
		
		System.out.println(s1.substring(1,4));
		/*
		 * H	e	l	l	o
		 * 0	1	2	3	4
		 * 		<------->
		 * it will print only this char, starting from 1 ends before 4
		 * */
		
		char a = s1.charAt(2);
		/*
		 * H	e	l	l	o
		 * 0	1	2	3	4
		 * 				<>
		 * it will print only character at position number 2
		 * */
		System.out.println(a);
		
		
		StringBuffer b = new StringBuffer(s3);
		//when we have to modify string we can use this
		b.reverse();
		//it will reverse the s3 string using b StringBuffer of s3
		
		//check the main and reverse string are same or not
		/*
		 * if(s3.equals(b))
		 * Here it will compare with s3 string and b StringBuffer (reverse string buffer)
		 * as they are different the comparison will not be correct
		 * so we have to write it in this way that it can compare with
		 * strings on both side
		 * */
		if(s3.equals(b.toString()))			
		{
			System.out.println("It is a plaindrome");
		}
		else
		{
			System.out.println("It is not a plaindrome");
		}
		
		
	}

}
