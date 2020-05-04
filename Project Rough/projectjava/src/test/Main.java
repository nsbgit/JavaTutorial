package test;

import java.awt.Color;
import java.util.*;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener; //to sense mouse click
import java.awt.event.ActionEvent; 
import java.util.Calendar;

import javax.swing.*;
class Homepage extends JFrame implements ActionListener
{
	private JButton badmin,buser;
	public Homepage(String title)
	{
		super(title);
		Container c=getContentPane();
		c.setLayout(new GridLayout(1,2));
		badmin=new JButton("ADMIN");
		badmin.addActionListener(this);
		buser=new JButton("USER");
		buser.addActionListener(this);
		c.add(badmin);c.add(buser);
		setSize(500, 425);
		setLocation(600,200);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//to close the frame or terminate the program.
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==badmin)
		{
			new AdminFrame();
		}
		if(e.getSource()==buser)
		
		{
			new UserFrame("Welcome");
			


	}
}
}

public class Main
{

	
	public static void main(String[] args) 
	{
	new Homepage("BANK");

	}

}
