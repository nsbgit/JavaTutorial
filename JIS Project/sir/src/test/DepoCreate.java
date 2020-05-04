package test;
import java.util.*;
import java.io.*;
import javax.swing.*;
public class DepoCreate extends JFrame {
	private String sysdate,systime;
	DepoCreate(String a,String b,String c,String d,String e,String f) {
		Calendar cal = Calendar.getInstance();
		String cday = ""+cal.get(Calendar.DATE);
		int x =cal.get(Calendar.MONTH);
		String cmonth = ""+(x+1);
		String cyear =""+cal.get(Calendar.YEAR);
		sysdate = cday+"/"+cmonth+"/"+cyear;
		String chr = ""+cal.get(Calendar.HOUR_OF_DAY);
		String cmin = ""+cal.get(Calendar.MINUTE);
		String csec =""+cal.get(Calendar.SECOND);
		systime = chr+":"+cmin+":"+csec;
		Depo sd1=new Depo();
		sd1.setSavingsacc(a);
		sd1.setFixeddepoacc(b);
		sd1.setSavingsaccbal(c);
		sd1.setFixedamnt(d);
		sd1.setTerms(e);
		sd1.setRate(f);
		sd1.setDate(sysdate);
		sd1.setTime(systime);
		ArrayList<Depo> list4;
		try {
			FileInputStream fin=new FileInputStream("fixed.dat");
			ObjectInputStream oin=new ObjectInputStream(fin);
			list4=(ArrayList<Depo>)oin.readObject();
		}catch(Exception e1) {
			list4=new ArrayList<Depo>();
		}
		list4.add(sd1);
		try	{
			FileOutputStream fout=new FileOutputStream("fixed.dat");
			ObjectOutputStream oout=new ObjectOutputStream(fout);
			oout.writeObject(list4);
		}catch(Exception e1){}
	}
}