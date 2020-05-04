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


public class UserRemoveDisplay extends JFrame
{
	ArrayList<Create> list2;
	public UserRemoveDisplay(String name)
	{
		try
		{
		  FileInputStream fin=new FileInputStream("Regis.dat");
		  ObjectInputStream oin=new ObjectInputStream(fin);
		  list2=(ArrayList<Create>)oin.readObject();
		}catch(Exception e){}
		
		int x = list2.size();
		//data=new String[x][12];
		int r=0;
		for(int i=0;i<x;i++)
		{
			if(list2.get(i).getAc().equals(name))
			{
				r++;
				list2.remove(i);
			}
		
		}
		/*for(Create re : list2)
		{
			if(re.getName().equals(name))
			{
				r++;
list2.remove(re);
			}
		}*/
			
       try	
		 {
		       FileOutputStream fout=new FileOutputStream("Regis.dat");
		       ObjectOutputStream oout=new ObjectOutputStream(fout);
		       oout.writeObject(list2);
		}catch(Exception e){}
        if(r>0)
        {
        	JOptionPane.showMessageDialog(this, "USER RECORD REMOVED");

        }
        else
        {
        	JOptionPane.showMessageDialog(this, "No Data Found");

        }
	}

}
