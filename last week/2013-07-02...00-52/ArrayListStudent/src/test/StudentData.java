package test;

public class StudentData 
{
	public String StudentName;
	private int math;
	private int phy;
	private int chem;
	private int total;
	   
	public int getTotal()
	{
		return total;
	}

	public void setTotal(int t1)
	{
		total = t1;
	}

	public String getStudentName()
	{
		return StudentName;
	}

	public void setStudentName(String sn)
	{
	   StudentName = sn;
	}


	public int getMath() 
	{
	   return math;
	}


	public void setMath(int m1)  																													
	{
	   math = m1;
	}


	public int getPhy()
	{
		return phy;
	}


	public void setPhy(int p1) 
	{
	   phy = p1;
	}


	public int getChem()
	{
		return chem;
	}


	public void setChem(int c1)
	{
		chem = c1;
	}
	   
}
