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
	ArrayList<Actotal>list1;
	ArrayList<Create> list2;
	int p;
	private boolean flagRegis = false;
	private boolean flagActotal = false;
	public UserRemoveDisplay(String name)
	{
		p=Integer.parseInt(name);
		try
		{
		  FileInputStream fin=new FileInputStream("Regis.dat");
		  ObjectInputStream oin=new ObjectInputStream(fin);
		  list2=(ArrayList<Create>)oin.readObject();
		}catch(Exception e)
		{
			list2 = new ArrayList<Create>();
		}
		
		//data=new String[x][12];
		int r=0,c=0;
		for(int i=0;i<list2.size();i++)
		{
			if(list2.get(i).getAc().equals(name))
			{
				r++;
				list2.remove(i);
				
				flagRegis = true;
			}
		
		}
		
		//JOptionPane.showMessageDialog(this, "After reding first time r = " + r);
		
		try	
		{
			FileOutputStream fout=new FileOutputStream("Regis.dat");
			ObjectOutputStream oout=new ObjectOutputStream(fout);
		    oout.writeObject(list2);
		}catch(Exception e){}

		
		try
		{
			FileInputStream fin=new FileInputStream("actotal.dat");
			ObjectInputStream oin=new ObjectInputStream(fin);
			list1=(ArrayList<Actotal>)oin.readObject();
		}catch(Exception e)
		{
			list1 = new ArrayList<Actotal>();
		}
		
		
		
		for(int i=0;i<list1.size();i++)
		{
			//JOptionPane.showMessageDialog(this, "for loop i = " + i + "\nk = " + k);
			
			if(list1.get(i).getAccount()==p)
					
			{
				//JOptionPane.showMessageDialog(this, "iffffffffffff i = " + i + "\nk = " + k);
				
				c++;
				list1.remove(i);
				
				flagActotal = true;
			}
		
		} 
		
		
		//JOptionPane.showMessageDialog(this, "After reding first time c = " + c);
		 
		try	
		{
			FileOutputStream fout=new FileOutputStream("Actotal.dat");
			ObjectOutputStream oout=new ObjectOutputStream(fout);
			oout.writeObject(list1);
		}catch(Exception e){}
		/*for(Create re : list2)
		{
			if(re.getName().equals(name))
			{
				r++;
				list2.remove(re);
			}
		}*/
			
      
		/**************msg display*******************************/
		
		if((flagRegis == true) && (flagActotal == true))
		{
			JOptionPane.showMessageDialog(this, "Account number has been successfully deleted.");
		}
		
		if((flagRegis == true) && (flagActotal == false))
		{
			JOptionPane.showMessageDialog(this, "Account number is not found in Actotal.dat file.", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		if((flagRegis == false) && (flagActotal == true))
		{
			JOptionPane.showMessageDialog(this, "Account number is not found in Regis.dat file.", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		if((flagRegis == false) && (flagActotal == false))
		{
			JOptionPane.showMessageDialog(this, "Account number does not exits.", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		
		flagRegis = false;
		flagActotal = false;
		
		
		/*******************************************************/
		
		/*
		
        if((r==1)&&(c==1))
        {
        	JOptionPane.showMessageDialog(this, "USER RECORD REMOVED");

        }
        else
        {
        	JOptionPane.showMessageDialog(this, "No Data Found");

        }
        
        
        */
	}

}
