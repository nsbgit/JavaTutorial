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
public class ShowAll extends JFrame implements ActionListener
{
private JButton bshow;
ShowAll()
{
	Container c=getContentPane();
	c.setLayout(new GridLayout(1,1));
	bshow=new JButton("SHOW ALL");
	bshow.addActionListener(this);
	c.add(bshow);
	setSize(250,250);
	setLocation(200,200);
	setResizable(false);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);

}
public void actionPerformed(ActionEvent e) 
{
if(e.getSource()==bshow)
{
	new DiaplayAll();
}
}
}
