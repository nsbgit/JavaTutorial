package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.util.*;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

class Admin extends JFrame implements ActionListener
{
	private JLabel l1,l2;
	private JButton b1,b2,b3,b4,b5,b6;
	
	public Admin()
	{
		/*********added*******************/
		super("Welcome Administrator");
		/*********************************/
		
		Container c=getContentPane();
		c.setLayout(new GridLayout(4,2));
		
		Font f1=new Font("Times New Roman",Font.BOLD,20);
		l1=new JLabel("ADMINISTRATOR");
		l1.setFont(f1);
		l1.setForeground(Color.RED);
		JPanel bpanel=new JPanel();
		bpanel.add(l1);
		bpanel.setBackground(new Color(0,0,64));
		
		l2=new JLabel("");
		l2.setFont(f1);
		l2.setForeground(Color.RED);
		JPanel cpanel=new JPanel();
		cpanel.add(l2);
		cpanel.setBackground(new Color(0,0,64));
		
		b1=new JButton("ADD AN OPERATOR");
		b1.addActionListener(this);
		JPanel apanel=new JPanel();
		apanel.add(b1);
		apanel.setBackground(new Color(0,0,64));
		
		b2=new JButton("SEARCH AN OPERATOR");
		b2.addActionListener(this);
		JPanel dpanel=new JPanel();
		dpanel.add(b2);
		dpanel.setBackground(new Color(0,0,64));
		
		b3=new JButton("DELETE AN OPERATOR");
		b3.addActionListener(this);
		JPanel epanel=new JPanel();
		epanel.add(b3);
		epanel.setBackground(new Color(0,0,64));
		
		b4=new JButton("SHOW ALL OPERATORS");
		b4.addActionListener(this);
		JPanel fpanel=new JPanel();
		fpanel.add(b4);
		fpanel.setBackground(new Color(0,0,64));
		
		b5=new JButton("SHOW ALL USERS");
		b5.addActionListener(this);
		JPanel gpanel=new JPanel();
		gpanel.add(b5);
		gpanel.setBackground(new Color(0,0,64));
		
		b6=new JButton("SEARCH AN USER");
		b6.addActionListener(this);
		JPanel hpanel=new JPanel();
		hpanel.add(b6);
		hpanel.setBackground(new Color(0,0,64));
		
		c.add(bpanel);c.add(cpanel);
		c.add(apanel);c.add(dpanel);
		c.add(epanel);c.add(fpanel);
		c.add(gpanel);c.add(hpanel);
		
		setSize(500,425);
		setLocation(200,200);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1) 
		{
			new OperatorReg("");
			setVisible(false);	
		}
		if(e.getSource()==b2) 
		{
			new OperatorSearch();
			setVisible(false);	
			
		}
		if(e.getSource()==b3) 
		{
			new OperatorDelete();
			setVisible(false);	
			
		}
		if(e.getSource()==b4) 
		{
			new OperatorDisplay();
			//setVisible(false);
		}
		if(e.getSource()==b5) 
		{
			//JOptionPane.showMessageDialog(this, "DISPLAY ALL CURRENT RECORDS");
			new DiaplayAll() ;
			//setVisible(false);
		}
		if(e.getSource()==b6) 
		{
			new UserSearch();
			setVisible(false);	
			
		}
		
	}
	
}

public class AdminLogin
{
   public static void main(String[] args)
	  {
	
	  }

}
