// @ The target of a loop can be empty.

/**
 * This program finds the midpoint between i and j. It generates the following output:
Midpoint is 150


Here is how this while loop works. The value of i is incremented, and the value of j is
decremented. These values are then compared with one another. If the new value of i is still
less than the new value of j, then the loop repeats. If i is equal to or greater than j, the loop
stops. Upon exit from the loop, i will hold a value that is midway between the original values
of i and j. (Of course, this procedure only works when i is less than j to begin with.) As you
can see, there is no need for a loop body; all of the action occurs within the conditional
expression, itself. In professionally written Java code, short loops are frequently coded
without bodies when the controlling expression can handle all of the details itself.
 */
package test2;

public class WhileLoopWithNoBody {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i;
		int j;
		
		i = 100;
		j = 200;
		
		// find midpoint between i and j
		while(++i < --j); // no body in this loop
		System.out.println("Midpoint is " + i);
	}

}
