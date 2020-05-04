package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.*;

import javax.swing.*;

public class Demanddraft extends JFrame implements ActionListener
{
	private JLabel l1,l2;
	private JTextField t1,t2;
	private JButton bsubmit,back;
	ArrayList<Create> list1;
	int amnt,w,account,d,t,r;
	
	public Demanddraft()
	{
		super("DD SLIP");
		
		Container c=getContentPane();
		c.setLayout(new GridLayout(3,2));
		
		t1=new JTextField();
		t2=new JTextField();
		
		bsubmit=new JButton("SUBMIT");
		bsubmit.addActionListener(this);
		JPanel bpanel=new JPanel();
		bpanel.add(bsubmit);
		bpanel.setBackground(new Color(0,0,64));
		
		back=new JButton("BACK");
		back.addActionListener(this);
		JPanel epanel=new JPanel();
		epanel.add(back);
		epanel.setBackground(new Color(0,0,64));
		
		Font f1=new Font("Times New Roman",Font.BOLD,20);
		l1=new JLabel("Enter A/C no");
		l1.setFont(f1);
		l1.setForeground(Color.RED);
		JPanel cpanel=new JPanel();
		cpanel.add(l1);
		cpanel.setBackground(new Color(0,0,64));
		
		l2=new JLabel("Enter Amount for making DD");
		l2.setFont(f1);
		l2.setForeground(Color.RED);
		JPanel dpanel=new JPanel();
		dpanel.add(l2);
		dpanel.setBackground(new Color(0,0,64));
		
		c.add(cpanel);c.add(t1);
		c.add(dpanel);c.add(t2);
		c.add(bpanel);c.add(epanel);
		
		setSize(500,400);
		setLocation(100,100);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	public void actionPerformed(ActionEvent e)
	{
		String search=t1.getText();
		r=0;
		if(e.getSource()==bsubmit)
		{
			try
		
		{
			  FileInputStream fin=new FileInputStream("Regis.dat");
			  ObjectInputStream oin=new ObjectInputStream(fin);
			  list1=(ArrayList<Create>)oin.readObject();	
	
	

}
			catch(Exception e1)
			{
				 
			}
			for(Create re : list1)
			{
				if(re.getAc().equals(search))
				{
					amnt=Integer.parseInt(re.getInitialamnt());
					w=Integer.parseInt(t2.getText());
					t=(amnt-w-50);
					account=Integer.parseInt(t1.getText());
					d=0;
					r++;
					
		}
	}
			if(r>0)
			{
				new Actotalcreate(account,w,d,t);
				new TotalUpdate(account,t);
				JOptionPane.showMessageDialog(this, "DD has been issued");
			}
			else
			{
				
				JOptionPane.showMessageDialog(this, "DD cannot be made");
				}
			}
		if(e.getSource()==back) 
		{
             int con=JOptionPane.showConfirmDialog(this, "Are You Sure you want to cancel?");
			
			if(con==JOptionPane.YES_OPTION)
			{
			   new Request();
			   setVisible(false);
			}
		
		
		}
}
	}
