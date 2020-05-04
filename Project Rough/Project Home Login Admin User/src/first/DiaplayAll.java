package first;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;
import java.awt.Container;
import java.io.*;
import java.util.*;


public class DiaplayAll extends JFrame //child of jframe class
{
	public DiaplayAll()
	{
		super("Display All Information");
		String heading[]={"First Name","Last Name","User ID","Password","Address","City","Gender","Date Of Birth","Interests","Reg Date","Reg Time"};
		String data[][];//=new String[20][9];//2-d array of string type of 20 rows,9 col
		ArrayList<UserRegistrationData> list=new ArrayList<UserRegistrationData>();
		try
		{
			FileInputStream fin=new FileInputStream("Regi.dat");
			ObjectInputStream oin=new ObjectInputStream(fin);
			list=(ArrayList<UserRegistrationData>)oin.readObject();
			
			data = new String[list.size()][heading.length+1];
			int r=0,i=0;
			for(UserRegistrationData re : list)//for each loop//re is ref of UserRegistrationData
			{//list is the obj of array list 
				data[r][0]=re.getName();
				data[r][1]=re.getLastName();
				data[r][2]=re.getUserID();
				data[r][3]=re.getPassword();
				data[r][4]=re.getAddress();
				data[r][5]=re.getCity();
				data[r][6]=re.getGender();
				data[r][7]=re.getDob();
				data[r][8]=re.getInterests();
				data[r][9]=re.getDate();
				data[r][10]=re.getTime();
				r++;
			}
			
			Container con=getContentPane();
			con.setLayout(new BorderLayout());//refer copy
			
			JTable datatable=new JTable(data, heading);//datatable is the obj of the JTABLE,data is the array
			JScrollPane jsp=new JScrollPane(datatable);
			
			con.add(new JLabel("All Registration Details"),BorderLayout.NORTH);
			con.add(jsp,BorderLayout.CENTER);//jsp=jscrollpane
			
			setSize(650, 300);
			
			setLocation(0, 0);
			setVisible(true);
		}catch(Exception e)
		{
			//e.printStackTrace();
			//System.out.println(e.toString());
			JOptionPane.showMessageDialog(this, "No user data found\nTry Again.");
			//new AdminPageGUI1();
			//setVisible(false);
		}
		
	}
}
