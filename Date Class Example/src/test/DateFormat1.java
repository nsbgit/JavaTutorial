package test;

import java.text.DateFormat;//We have to write this two lines
import java.util.Date;

class DateShow
{
	void f1()
	{
		DateFormat dft;//reference creation of DateFormat system defined class
		String s;//reference creation of String system defined class
		
		Date date_ob = new Date();//pick up the date from system
		
		dft = DateFormat.getDateInstance(DateFormat.SHORT);
		s = dft.format(date_ob);
		System.out.println(s);
		
		dft = DateFormat.getDateInstance(DateFormat.LONG);
		s = dft.format(date_ob);
		System.out.println(s);
	}
}

public class DateFormat1
{
	public static void main(String[] args)
	{
		DateShow ob1 = new DateShow();
		ob1.f1();
	}

}
