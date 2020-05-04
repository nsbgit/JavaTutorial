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
import java.util.Calendar;

import javax.swing.*;

 class Userwindow extends JFrame implements ActionListener
{
	private JLabel l1,l2;
	private JButton bcreate,bremove,bdetails,bwithdraw,btransfer,bpass,bdd,bexit;
	Userwindow(String currentOperator)
	{
		super("Welcome " + currentOperator);
		
		Container c=getContentPane();
		c.setLayout(new GridLayout(5,2));
		
		Font f1=new Font("Times New Roman",Font.BOLD,25);
		l1=new JLabel("                OPERATOR");
		l1.setFont(f1);
		l1.setForeground(Color.WHITE);
		JPanel fpanel=new JPanel();
		fpanel.add(l1);
		fpanel.setBackground(new Color(0,0,64));
		
		l2=new JLabel("FUNCTIONS              ");
		l2.setFont(f1);
		l2.setForeground(Color.WHITE);
		JPanel ppanel=new JPanel();
		ppanel.add(l2);
		ppanel.setBackground(new Color(0,0,64));
		
		bcreate=new JButton("CREATE NEW ACCOUNT");
		bcreate.addActionListener(this);
		JPanel apanel=new JPanel();
		apanel.add(bcreate);
		apanel.setBackground(new Color(0,0,64));
	
		
		bremove=new JButton("REMOVE ACCOUNT");
		bremove.addActionListener(this);
		JPanel bpanel=new JPanel();
		bpanel.add(bremove);
		bpanel.setBackground(new Color(0,0,64));
	
		
		bdetails=new JButton("VIEW DETAILS OF AN ACCOUNT");
		bdetails.addActionListener(this);
		JPanel cpanel=new JPanel();
		cpanel.add(bdetails);
		cpanel.setBackground(new Color(0,0,64));
	
		
		bwithdraw=new JButton("WITHDRAWAL/DEPOSIT");
		bwithdraw.addActionListener(this);
		JPanel dpanel=new JPanel();
		dpanel.add(bwithdraw);
		dpanel.setBackground(new Color(0,0,64));
	
		
		btransfer=new JButton("TRANSFER MONEY");
		btransfer.addActionListener(this);
		JPanel epanel=new JPanel();
		epanel.add(btransfer);
		epanel.setBackground(new Color(0,0,64));
		
		bpass=new JButton("VIEW ACCOUNT PASS BOOK");
		bpass.addActionListener(this);
		JPanel qpanel=new JPanel();
		qpanel.add(bpass);
		qpanel.setBackground(new Color(0,0,64));
		
		bdd=new JButton("REQUEST FOR DD/CHEQUE BOOK");
		bdd.addActionListener(this);
		JPanel upanel=new JPanel();
		upanel.add(bdd);
		upanel.setBackground(new Color(0,0,64));
	
		
		bexit=new JButton("LOG OUT");
		bexit.addActionListener(this);
		JPanel gpanel=new JPanel();
		gpanel.add(bexit);
		gpanel.setBackground(new Color(0,0,64));
	
		
		c.add(fpanel);c.add(ppanel);
		c.add(apanel);c.add(dpanel);
		c.add(bpanel);c.add(epanel);
		c.add(qpanel);c.add(upanel);
		c.add(cpanel);c.add(gpanel);
		
		setSize(500,500);
		setLocation(200,200);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==bcreate)
		{
			new CreateFrame();
			setVisible(false);
		}
		if(e.getSource()==bwithdraw)
		{
			new Withdraw();
			setVisible(false);
		}
		
		if(e.getSource()==bremove)
		{
		    new UserRemove();
			setVisible(false);
        }
		if(e.getSource()==btransfer)
		{
			new Transfer();
			setVisible(false);
			
        }
		if(e.getSource()==bdd)
		{
			new Request();
			//new CreateFrame();give name as u want
			setVisible(false);
		}
		if(e.getSource()==bpass)
		{
			new PassBook();//give name as u want
			setVisible(false);
		}
		if(e.getSource()==bdetails)
		{
			new UserSearch();
			setVisible(false);
        }
		if(e.getSource()==bexit)
		{
			new ThirdWindow();
			setVisible(false);
	}
}
}