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

import javax.swing.*;

public class Withdraw extends JFrame implements ActionListener
{
	private JLabel l1,l2,l3;
	private JTextField t1;
	private JButton submit,cancel;
	ArrayList<Create> list1;
	
	public Withdraw()
	{
		Container c=getContentPane();
		c.setLayout(new GridLayout(3,2));
		
		Font f1=new Font("Times New Roman",Font.BOLD,20);
		l1=new JLabel("WITHDRAWAL");
		l1.setFont(f1);
		l1.setForeground(Color.GRAY);
		JPanel fpanel=new JPanel();
		fpanel.add(l1);
		fpanel.setBackground(new Color(0,0,64));
		
		l1=new JLabel("SLIP");
		l1.setFont(f1);
		l1.setForeground(Color.GRAY);
		JPanel apanel=new JPanel();
		apanel.add(l1);
		apanel.setBackground(new Color(0,0,64));
		
		l1=new JLabel("Enter ACCOUNT NO:");
		l1.setFont(f1);
		l1.setForeground(Color.GRAY);
		JPanel bpanel=new JPanel();
		bpanel.add(l1);
		bpanel.setBackground(new Color(0,0,64));
		
		t1=new JTextField();
		
		submit=new JButton("SUBMIT");
		submit.addActionListener(this);
		JPanel dpanel=new JPanel();
		dpanel.add(submit);
		dpanel.setBackground(new Color(0,0,64));
		
		cancel=new JButton("CANCEL");
		cancel.addActionListener(this);
		JPanel epanel=new JPanel();
		epanel.add(cancel);
		epanel.setBackground(new Color(0,0,64));
		
		c.add(fpanel);c.add(apanel);
		c.add(bpanel);c.add(t1);
		c.add(dpanel);c.add(epanel);
		
		setSize(500,500);
		setLocation(100,100);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}



	public void actionPerformed(ActionEvent e) 
	{
		Create rg1=new Create();

		String data[][];
		String heading[]={"First Name","Last name","Address","Nationality","Account Type","Date Of Birth","Identity","Profession","Reg Date","Reg Time","A/c no","Initial amnt"};
		
		String search=t1.getText();
		int x;
		if(e.getSource()==submit)
		{
			try
		
		{
			  FileInputStream fin=new FileInputStream("Regis.dat");
			  ObjectInputStream oin=new ObjectInputStream(fin);
			  list1=(ArrayList<Create>)oin.readObject();
			}
			catch(Exception e1)
			{
				JOptionPane.showMessageDialog(this, "No match found");
			}
			x = list1.size();
			data=new String[x][12];
			int r=0;
			for(Create re : list1)
			{
				if(re.getAc().equals(search))
				{
					data[r][0]=re.getName();
					data[r][1]=re.getName1();
					data[r][2]=re.getAddress();
					data[r][3]=re.getNationality();
					data[r][4]=re.getAcctype();
					data[r][5]=re.getDob();
					data[r][6]=re.getIdentity();
					data[r][7]=re.getProfession();
					data[r][8]=re.getDate();
					data[r][9]=re.getTime();
					data[r][10]=re.getAc();
					data[r][11]=re.getInitialamnt();
				  r++;
				}
			}
			if (r>0)
			{
				int k=Integer.parseInt(data[0][11]);
				if(k>1000)
				{
					new Dispwithdraw(data);
				
					 /*Container con=getContentPane();
					  con.setLayout(new BorderLayout());
					
					  JTable datatable=new JTable(data, heading);
					  JScrollPane jsp=new JScrollPane(datatable);
					
					  con.add(new JLabel("Registration Details"),BorderLayout.NORTH);
					  con.add(jsp,BorderLayout.CENTER);
					
					  setSize(650, 650);
					  setLocation(600, 200);
					  setVisible(true);
					//new Dispwithdraw(data);

			
		}*/
			}
				else
				{
					JOptionPane.showMessageDialog(this, "No Data Found");

				}
		if(e.getSource()==cancel)
		{
			new Userwindow();
			setVisible(false);
		}
		
			
		}
		}
	
	}
}

	
	


