package test;

import java.awt.BorderLayout;
import java.awt.Container;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Seraching extends JFrame 
{
	String data[][];
	String heading[]={"Name","Password","Address","City","Gender","Date Of Birth","Interests","Reg Date","Reg Time"};
	ArrayList<RegistrationData> list;
	public Seraching(String name)
	{
		try
		{
		  FileInputStream fin=new FileInputStream("Regi.dat");
		  ObjectInputStream oin=new ObjectInputStream(fin);
		  list=(ArrayList<RegistrationData>)oin.readObject();
		}catch(Exception e){}
		
		int x = list.size();
		data=new String[x][9];
		int r=0;
		for(RegistrationData re : list)
		{
			if(re.getName().equals(name))
			{
			  data[r][0]=re.getName();
			  data[r][1]=re.getPassword();
			  data[r][2]=re.getAddress();
			  data[r][3]=re.getCity();
			  data[r][4]=re.getGender();
			  data[r][5]=re.getDob();
			  data[r][6]=re.getInterests();
			  data[r][7]=re.getDate();
			  data[r][8]=re.getTime();
			  r++;
			}
		}
		if (r>0)
		{
		  Container con=getContentPane();
		  con.setLayout(new BorderLayout());
		
		  JTable datatable=new JTable(data, heading);
		  JScrollPane jsp=new JScrollPane(datatable);
		
		  con.add(new JLabel("Registration Details"),BorderLayout.NORTH);
		  con.add(jsp,BorderLayout.CENTER);
		
		  setSize(650, 300);
		  setLocation(200, 200);
		  setVisible(true);
		}
		else
		{
			JOptionPane.showMessageDialog(this, "No Data Found");
		}
	}
}