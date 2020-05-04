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


public class OperatorDeleteDisplay extends JFrame
{
	String data[][];
	String heading[]={"First Name","Last name","Password","Address","City","Gender","Date Of Birth","Reg Date","Reg Time"};
	ArrayList<OperatorRegData> list1;
	
	public OperatorDeleteDisplay(String name)
	{
		try
		{
		  FileInputStream fin=new FileInputStream("Reg.dat");
		  ObjectInputStream oin=new ObjectInputStream(fin);
		  list1=(ArrayList<OperatorRegData>)oin.readObject();
		}catch(Exception e){}
		
		int x = list1.size();
		data=new String[x][9];
		int r=0;
		for(OperatorRegData re : list1)
		{
			if(re.getName().equals(name))
			{
				list1.remove(re);
			}
			else
			{
				JOptionPane.showMessageDialog(this, "No Data Found");
			}

		}
	}

}
