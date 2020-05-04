package test;

/**
 * Although the for-each for loop iterates until all elements in an
 * array have been examined, it is possible to terminate the loop early
 * by using a break statement. For example, this program sums only the
 * first five elements of nums[]. 
 * 
 * @author Sukanta
 *
 */

public class ForEachLoopWithBreak {
	
	public static void main(String[] args) {
		int sum = 0;
		int nums[] = {1,2,3,4,5,6,7,8,9,10};
		
		//use of for each loop
		/**
		 * for(type iterationVariable : collection)
		 */
		for(int re : nums)
		{
			System.out.println("Value is : " + re);
			sum += re;
			
			if(re == 5) break;//stop the loop when 5 is obtained
		}
				
		System.out.println("Summation of the first 5 elements : " + sum);
		
	}

}
