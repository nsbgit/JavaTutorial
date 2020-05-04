package test;
import java.awt.Color;
import java.util.*;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener; //to sense mouse click
import java.awt.event.ActionEvent; 
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Calendar;

import javax.swing.*;
public class Transfer extends JFrame implements ActionListener
{
	private JLabel l1,l2,l3;
	private JTextField tid1,tid2,tid3;
	private JButton bsubmit,cancel;
	private int x,r=0,c=0,sourceamnt,destamnt,tran,t,acc,d=0,w=0;
	ArrayList<Create> list1;
	public Transfer()
	{
		tid1=new JTextField();
		tid2=new JTextField();
		tid3=new JTextField();
		
		Container c=getContentPane();
		c.setLayout(new GridLayout(4,2));
		
		bsubmit=new JButton("Submit");
		bsubmit.addActionListener(this);
		JPanel bpanel=new JPanel();
		bpanel.add(bsubmit);
		bpanel.setBackground(new Color(0,0,64));
		
		cancel=new JButton("CANCEL");
		cancel.addActionListener(this); 
		JPanel apanel=new JPanel();
		apanel.add(cancel);
		apanel.setBackground(new Color(0,0,64));
		
		Font f1=new Font("comic sans ms",Font.BOLD,14);
		l1=new JLabel("Enter Source A/C no");
		l1.setFont(f1);
		l1.setForeground(Color.RED);
		JPanel cpanel=new JPanel();
		cpanel.add(l1);
		cpanel.setBackground(new Color(0,0,64));
		
		l2=new JLabel("Enter Destination A/C no");
		l2.setFont(f1);
		l2.setForeground(Color.RED);
		JPanel dpanel=new JPanel();
		dpanel.add(l2);
		dpanel.setBackground(new Color(0,0,64));
		
		l3=new JLabel("Enter Amount to be Transferred");
		l3.setFont(f1);
		l3.setForeground(Color.RED);
		JPanel epanel=new JPanel();
		epanel.add(l3);
		epanel.setBackground(new Color(0,0,64));
		
		c.add(cpanel);c.add(tid1);
		c.add(dpanel);c.add(tid2);
		c.add(epanel);c.add(tid3);
		c.add(bpanel);c.add(apanel);
		
		setSize(500,387);
		setLocation(600,200);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
	String source,dest;
	source=tid1.getText();
	dest=tid2.getText();
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
				x = list1.size();
				for(Create re : list1)
				{
					if(re.getAc().equals(source))
					{
						for(Create re2 : list1)
						{
							if(re2.getAc().equals(dest))
							{
								sourceamnt=Integer.parseInt(re.getInitialamnt());	
								destamnt=Integer.parseInt(re2.getInitialamnt());
								if(sourceamnt>500)
								{
									tran=Integer.parseInt(tid3.getText());
									t=sourceamnt-tran;
									if(t>0)
									{
									acc=Integer.parseInt(tid1.getText());
									new TotalUpdate(acc,t);
									new Actotalcreate(acc,tran,d,t);
									t=destamnt+tran;
									acc=Integer.parseInt(tid2.getText());
									new TotalUpdate(acc,t);
									new Actotalcreate(acc,w,tran,t);
									r++;
									
									}

								}
								
							}
							
						}

					}
					
									}
				if(r==1)
				{
					JOptionPane.showMessageDialog(this, "MONEY TRANSFERRED");
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
				else
				{
					JOptionPane.showMessageDialog(this, "MONEY TRANSFER FAILED");
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				}
				
				/*try
				
				{
					  FileInputStream fin=new FileInputStream("Regis.dat");
					  ObjectInputStream oin=new ObjectInputStream(fin);
					  list1=(ArrayList<Create>)oin.readObject();
					}
					catch(Exception e1)
					{
						 
					}
					x = list1.size();
					for(Create re : list1)
					{
						if(re.getAc().equals(source))
						{
							
							tran=Integer.parseInt(tid3.getText());
							t=sourceamnt-tran;
							acc=Integer.parseInt(tid1.getText());
							new TotalUpdate(acc,t);
							r++;
						}
					}
						if(r>0)
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
								x = list1.size();
								for(Create re1 : list1)
								{
									if(re1.getAc().equals(dest))
									{
										
										tran=Integer.parseInt(tid3.getText());
										t=destamnt+tran;
										acc=Integer.parseInt(tid2.getText());
										new TotalUpdate(acc,t);
										c++;
									}	
						}
			}
	if(c>0)
	{
		JOptionPane.showMessageDialog(this, "MONEY TRANSFERRED");

	}
	else
	{
		JOptionPane.showMessageDialog(this, "MONEY TRANSFERRED FAILED");

	}
	

}*/

}
	}
}