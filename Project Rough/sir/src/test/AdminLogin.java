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
	private JLabel l1;
	private JButton b1,b2,b3,b4,b5,b6;
	
	public Admin()
	{
		
		Container c=getContentPane();
		c.setLayout(new GridLayout(4,2));
		
		Font f1=new Font("Times New Roman",Font.BOLD,20);
		l1=new JLabel("ADMINISTRATOR");
		l1.setFont(f1);
		l1.setForeground(Color.RED);
		JPanel cpanel=new JPanel();
		cpanel.add(l1);
		cpanel.setBackground(new Color(0,0,64));
		
		l1=new JLabel("");
		l1.setFont(f1);
		l1.setForeground(Color.RED);
		JPanel copanel=new JPanel();
		copanel.add(l1);
		copanel.setBackground(new Color(0,0,64));
		
		b1=new JButton("ADD AN OPERATOR");
		b1.addActionListener(this);
		JPanel dpanel=new JPanel();
		dpanel.add(b1);
		dpanel.setBackground(new Color(0,0,64));

		
		b2=new JButton("DELETE OPERATOR");
		b2.addActionListener(this);
		JPanel epanel=new JPanel();
		epanel.add(b2);
		epanel.setBackground(new Color(0,0,64));

		
		b3=new JButton("SEARCH OPERATOR");
		b3.addActionListener(this);
		JPanel fpanel=new JPanel();
		fpanel.add(b3);
		fpanel.setBackground(new Color(0,0,64));

		
		b4=new JButton("SHOW ALL OPERATORS");
		b4.addActionListener(this);
		JPanel gpanel=new JPanel();
		gpanel.add(b4);
		gpanel.setBackground(new Color(0,0,64));

		b5=new JButton("SHOW ALL RECORDS OF USER");
		b5.addActionListener(this);
		JPanel hpanel=new JPanel();
		hpanel.add(b5);
		hpanel.setBackground(new Color(0,0,64));

		
		b6=new JButton("SEARCH A USER");
		b6.addActionListener(this);
		JPanel ipanel=new JPanel();
		ipanel.add(b6);
		ipanel.setBackground(new Color(0,0,64));

		
		c.add(cpanel);c.add(copanel);
		c.add(dpanel);c.add(epanel);
		c.add(fpanel);c.add(gpanel);
		c.add(hpanel);c.add(ipanel);
		
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
		JOptionPane.showMessageDialog(this, "DISPLAY ALL CURRENT RECORDS");
		new DiaplayAll() ;
		new displayAll2();
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