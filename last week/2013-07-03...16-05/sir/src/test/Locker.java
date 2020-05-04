package test;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Color;
import java.util.*;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener; //to sense mouse click
import java.awt.event.ActionEvent; 
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Calendar;

import javax.swing.*;


public class Locker extends JFrame implements ActionListener
{
	private JLabel l1,l2,l3;
	private JTextField tid,tid1;
	private JComboBox terms;
	private JButton bsubmit,bcancel;
	ArrayList<Create> list1;
	ArrayList<LockerData> list2;
	private int amnt;
	public Locker()
	{
		super("LOCKER OPENING FORM");
		
		Container c=getContentPane();
		c.setLayout(new GridLayout(4,2));
		
		tid=new JTextField();
		tid1=new JTextField();
		
		String ctvalue[]={"1","3","5"};
		terms=new JComboBox(ctvalue);
		JPanel qpanel=new JPanel();
		qpanel.add(terms);
		qpanel.setBackground(new Color(0,0,64));
		
		bsubmit=new JButton("SUBMIT");
		bsubmit.addActionListener(this);
		JPanel apanel=new JPanel();
		apanel.add(bsubmit);
		apanel.setBackground(new Color(0,0,64));
		
		bcancel=new JButton("CANCEL");
		bcancel.addActionListener(this);
		JPanel bpanel=new JPanel();
		bpanel.add(bcancel);
		bpanel.setBackground(new Color(0,0,64));
		
		Font f1=new Font("comic sans ms",Font.BOLD,14);
		l1=new JLabel("Enter A/c no");
		l1.setFont(f1);
		l1.setForeground(Color.RED);
		JPanel cpanel=new JPanel();
		cpanel.add(l1);
		cpanel.setBackground(new Color(0,0,64));
		
		l2=new JLabel("Enter Terms");
		l2.setFont(f1);
		l2.setForeground(Color.RED);
		JPanel dpanel=new JPanel();
		dpanel.add(l2);
		dpanel.setBackground(new Color(0,0,64));
		
		l3=new JLabel("Enter LOCKER no");
		l3.setFont(f1);
		l3.setForeground(Color.RED);
		JPanel epanel=new JPanel();
		epanel.add(l3);
		epanel.setBackground(new Color(0,0,64));
		
		c.add(cpanel);c.add(tid);
		c.add(dpanel);c.add(qpanel);
		c.add(epanel);c.add(tid1);
		c.add(apanel);c.add(bpanel);
		
		setSize(600,400);
		setLocation(200,200);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		

	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		int r=0,p=0;
		String search=tid.getText();
		String lock1=tid1.getText();
		if(e.getSource()==bsubmit)
		{

			
			try//read from file
			{
				FileInputStream fin=new FileInputStream("locker.dat");
				ObjectInputStream oin=new ObjectInputStream(fin);
				list2=(ArrayList<LockerData>)oin.readObject();
				//reading all account withdraw info
			}
			catch(Exception e1)
			{
				JOptionPane.showMessageDialog(this, "No file found in data base", "Error", JOptionPane.ERROR_MESSAGE);
			}
			
			for(LockerData re : list2)
			{
				if(re.getLockno().equals(lock1))
				{
	            p++;
				}
			}
				if(p==0)
				{
					try//read from file
					{
						FileInputStream fin=new FileInputStream("Regis.dat");
						ObjectInputStream oin=new ObjectInputStream(fin);
						list1=(ArrayList<Create>)oin.readObject();
						//reading all account withdraw info
					}
					catch(Exception e1)
					{
						JOptionPane.showMessageDialog(this, "No file found in data base", "Error", JOptionPane.ERROR_MESSAGE);
					}
					
					for(Create re : list1)
					{
						if(re.getAc().equals(search))
						{
				        String acc=re.getAc();
				        int acc1=Integer.parseInt(acc);
						amnt=Integer.parseInt(re.getInitialamnt());
				        String lockno=tid1.getText();
				        String term=(String)terms.getSelectedItem();
				        if(amnt>500)
				        {
				        	int t=amnt-1000;
				        	String t1=String.valueOf(t);
				        	if(t>=500)
				        	{
				        		new LockerCreate(acc,lockno,t1,term);
				        		new TotalUpdate(acc1,t);
				        		new Actotalcreate(acc1,1000,0,t);
				        		new SavingsUpdate(acc1,t);
				        		new LockerDisplay();
				        		r++;
				        	}
				        }
						}
			}
		if(r>0)
		{
			JOptionPane.showMessageDialog(this, "LOCKER ISSUED");
		}
		else
		{
			JOptionPane.showMessageDialog(this, "LOCKER CANNOT BE ISSUED");
		}
		}
				else
				{
					JOptionPane.showMessageDialog(this, "LOCKER ALREADY EXISTS");
				}

				}

		if(e.getSource()==bcancel)
		{
			int rply = JOptionPane.showConfirmDialog(this, "Are you sure to quit?");
			if(rply == JOptionPane.YES_OPTION)
			{
				new Userwindow("");
				setVisible(false);
			}
		}	
			}
}
