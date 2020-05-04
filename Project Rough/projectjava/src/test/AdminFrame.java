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
public class AdminFrame extends JFrame implements ActionListener
{
	private JLabel l1,l2;
	private JPasswordField tpass;
	private JButton blogin;
	private JTextField tid;


AdminFrame()
{
	Container c=getContentPane();
	c.setLayout(new GridLayout(3,2));
	tpass=new JPasswordField();
	tid=new JTextField();
	blogin=new JButton("LOGIN");
	blogin.addActionListener(this);
	Font f1=new Font("comic sans ms",Font.BOLD,14);
	l1=new JLabel("USER ID");
	l1.setFont(f1);
	l1.setForeground(Color.BLUE);
	l2=new JLabel("PASSWORD");
	l2.setFont(f1);
	l2.setForeground(Color.BLUE);
	c.add(l1);c.add(tid);
	c.add(l2);c.add(tpass);
	c.add(blogin);

setSize(250,250);
setLocation(200,200);
setResizable(false);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);

}

public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==blogin) 
	{
		if(tid.getText().equals("Username"))
		{
			char [] pwd=tpass.getPassword();
			String str=new String(pwd);
			if(str.equals("password"))
			{
				new ShowAll();
			}
		}
	}
			}

		}

	
	

