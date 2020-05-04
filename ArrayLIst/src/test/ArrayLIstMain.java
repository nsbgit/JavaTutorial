package test;

import java.util.ArrayList;

class Al
{
	ArrayList<Integer> alist = new ArrayList<Integer>();
	
	void addData()
	{
		int v = 50;
		for(int i=0;i<5;i++)
		{
			alist.add(v);
			v++;
		}
	}
	void f1()
	
	{
		alist.add(1,500);
		
		alist.remove(2);
		
	}
	
	void dispData()
	{
		for(int i = 0; i<alist.size();i++)
		{
			System.out.println(alist.get(i));//extract object from arraylist
		}
	}
	}

public class ArrayLIstMain {

	
	public static void main(String[] args) {
		Al ob1 = new Al();
		ob1.addData();
		ob1.f1();
		ob1.dispData();

	}

}
