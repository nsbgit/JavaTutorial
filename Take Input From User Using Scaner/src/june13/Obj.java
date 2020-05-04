/**
 * 
 */
package june13;

/**
 * @author Sukanta
 *
 */
public class Obj
{
	private static int count;
	private int id;
	
	Obj()
	{
		id = count;
		count++;
	}
	
	
	/*void createId()
	{
		id= count;
		count++;
	}*/
	  
	
	void dispId()
	{
		System.out.println("Id is " + id);
	}
	
	
	void dispCount()
	{
		System.out.println("The total number of object is " + count);
	}

}
