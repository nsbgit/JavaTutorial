package test;

/**
 * Use of for-each style on a two-dimensional array.
 * @author Sukanta
 *
 */

public class ForEachMultiDim {
	
	public static void main(String[] args) {
		int sum = 0;
		int nums[][] = new int[3][5];
		
		//give some values
		/**
		 * We can use for-each loop only for readable case
		 * not for any write operations
		 */
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				nums[i][j] = (i+1)*(j+1);
			}
		}
		
		//for-each loop for to display and sum the values
		for(int re[] : nums) {
			for(int re2 : re) {
				System.out.println("Value is : " + re2);
				sum += re2;
			}
		}
		
		System.out.println("Sumation is : " + sum);
		
	}

}
