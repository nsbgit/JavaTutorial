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

public class Userwindow extends JFrame implements ActionListener
{
	private JLabel l1;
	Userwindow()
	{
		Container c=getContentPane();
		c.setLayout(new GridLayout(1,1));
		Font f1=new Font("comic sans ms",Font.BOLD,14);
		l1=new JLabel("WELCOME USER");
		l1.setFont(f1);
		l1.setForeground(Color.BLUE);
		c.add(l1);
		setSize(250,250);
		setLocation(200,200);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		
	}
}
