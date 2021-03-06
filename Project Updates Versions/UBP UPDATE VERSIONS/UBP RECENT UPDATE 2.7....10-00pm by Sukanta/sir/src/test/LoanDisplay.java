package test;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;
import java.awt.Container;
import java.io.*;
import java.util.*;

public class LoanDisplay  extends JFrame
{
public LoanDisplay()
{
	super("LOAN DETAILS");
	String heading[]={"Loan A/C no","Loan Amount","Loan Type","Terms","Rate","Date","Time"};
	String data[][];
	ArrayList<LoanData> list;
	try
	{
		FileInputStream fin=new FileInputStream("loan.dat");
		ObjectInputStream oin=new ObjectInputStream(fin);
		list=(ArrayList<LoanData>)oin.readObject();
		
		
		data = new String[list.size()][heading.length+1];
		
		
		int r=0;
		for(LoanData re : list)
		{
			data[r][0]=re.getAcc();
			data[r][1]=re.getAmnt();
			data[r][2]=re.getAcctype();
			data[r][3]=re.getTerms();
			data[r][4]=re.getRate();
			data[r][5]=re.getDate();
			data[r][6]=re.getTime();
			
			r++;
}

	Container con=getContentPane();
	con.setLayout(new BorderLayout());//refer copy
	
	JTable datatable=new JTable(data, heading);//datatable is the obj of the JTABLE,data is the array
	JScrollPane jsp=new JScrollPane(datatable);
	
	con.add(new JLabel("All Registration Details"),BorderLayout.NORTH);
	con.add(jsp,BorderLayout.CENTER);//jsp=jscrollpane
	
	setSize(650, 300);
	
	setLocation(200, 200);
	setVisible(true);
}catch(Exception e)
{
	//e.printStackTrace();
	//System.out.println(e.toString());
	JOptionPane.showMessageDialog(this, "No file found in data base", "Error", JOptionPane.ERROR_MESSAGE);
}
}
}
