package test;

import java.awt.BorderLayout;
import java.awt.Container;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class OperatorDeleteDisplay extends JFrame
{
	//String data[][];
	//String heading[]={"First Name","Last name","Password","Address","City","Gender","Date Of Birth","Reg Date","Reg Time"};
	ArrayList<OperatorRegData> list1;
	
	public OperatorDeleteDisplay(String name)
	{
		try
		{
		  FileInputStream fin=new FileInputStream("Reg.dat");
		  ObjectInputStream oin=new ObjectInputStream(fin);
		  list1=(ArrayList<OperatorRegData>)oin.readObject();
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(this, "No file found in data base", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		
		
		/**********for same user name more than one********************/
		/*int count=0;
		for(OperatorRegData re : list1)
		{
			if(re.getName().equals(name))
			{
				count++;
			}
		}
		JOptionPane.showMessageDialog(this, count);
		/**********operation**************/
		
		
		//int x = list1.size();
		//data=new String[x][9];
		//data = new String[list1.size()][heading.length+1];
		
		
		int r=0;
		//JOptionPane.showMessageDialog(this, "dhokar age " + list1.size());
		
		for(int i=0;i<list1.size();i++)
		{
			/*******delete******************/
			if(list1.get(i).getName().equals(name))
			{
				list1.remove(i);
				r++;
				
				/*******update file***********************/
				try	
				 {
				       FileOutputStream fout=new FileOutputStream("Reg.dat");
				       ObjectOutputStream oout=new ObjectOutputStream(fout);
				       oout.writeObject(list1);
				}
				catch(Exception e){}
				
				
				/**********read file***********************/
				try
				{
				  FileInputStream fin=new FileInputStream("Reg.dat");
				  ObjectInputStream oin=new ObjectInputStream(fin);
				  list1=(ArrayList<OperatorRegData>)oin.readObject();
				}
				catch(Exception e){}
				
				//JOptionPane.showMessageDialog(this, "value " + l);
			}
			
			
		}
		
		
		//JOptionPane.showMessageDialog(this, "no of del operation " + r);
		//JOptionPane.showMessageDialog(this, "no of loop " + l);
		if(r==0)
		{
			JOptionPane.showMessageDialog(this, "Match not Found");
		}
		else
		{
			JOptionPane.showMessageDialog(this, "Successfully deleted");
		}
		
		/*********************writing file******************/
		/*try	
		 {
		       FileOutputStream fout=new FileOutputStream("Reg.dat");
		       ObjectOutputStream oout=new ObjectOutputStream(fout);
		       oout.writeObject(list1);
		}catch(Exception e){}*/
	}

}

