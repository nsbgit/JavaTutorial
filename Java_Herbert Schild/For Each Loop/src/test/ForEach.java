package test;

public class ForEach
{
	public static void main(String[] args)
	{
		int nums[] = {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		
		//use of normal for loop
		/*
		for(int i=0; i<nums.length; i++)
		{
			System.out.println("Value is : " + nums[i]);
			sum += nums[i]; 
		}
		*/
		
		//use of for each loop
		/**
		 * for(type iterationVariable : collection)
		 */
		for(int re : nums)
		{
			System.out.println("Value is : " + re);
			sum += re;
		}
		
		System.out.println("Summation is : " + sum);
	}

}
