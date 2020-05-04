package test;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;
import java.awt.Container;
import java.io.*;
import java.util.*;


public class displayAll2 extends JFrame //child of jframe class
{
	public displayAll2()
	{
		super("Display All");
		String heading[]={"A/c no","Balance"};
		String data[][]=new String[20][12];//2-d array of string type of 20 rows,9 col
		ArrayList<Create> list=new ArrayList<Create>();
		try
		{
			FileInputStream fin=new FileInputStream("Regi2.dat");
			ObjectInputStream oin=new ObjectInputStream(fin);
			list=(ArrayList<Create>)oin.readObject();
			
			int r=0;
			for(Create re : list)
			{
				data[r][0]=re.getAc();
				data[r][1]=re.getBalance();				/*data[r][2]=re.getAddress();
				data[r][3]=re.getNationality();
				data[r][4]=re.getAcctype();
				data[r][5]=re.getDob();
				data[r][6]=re.getIdentity();
				data[r][7]=re.getProfession();
				data[r][8]=re.getDate();
				data[r][9]=re.getTime();
				data[r][10]=re.getAc();
				data[r][11]=re.getInitialamnt();*/
				
				r++;
			}
			
			Container con=getContentPane();
			con.setLayout(new BorderLayout());//refer copy
			
			JTable datatable=new JTable(data, heading);//datatable is the obj of the JTABLE,data is the array
			JScrollPane jsp=new JScrollPane(datatable);
			
			con.add(new JLabel("Acount current details Details"),BorderLayout.NORTH);
			con.add(jsp,BorderLayout.CENTER);//jsp=jscrollpane
			
			setSize(650, 300);
			
			setLocation(200, 200);
			setVisible(true);
		}catch(Exception e)
		{
			//e.printStackTrace();
			System.out.println(e.toString());
		}
		
	}
}