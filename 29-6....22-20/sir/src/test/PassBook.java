package test;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Container;
import java.io.*;
import java.util.*;

import javax.swing.*;

public class PassBook extends JFrame implements ActionListener

{
	private JLabel l1;
	private JTextField tid;
	private JButton bdisplay;
	String heading[]={"Accno","Withdraw","Deposit","Total","Date","Time"};
	String data[][]=new String[1000][6];
	public PassBook()
	{
		Container c=getContentPane();
		c.setLayout(new GridLayout(2,2));
		tid=new JTextField();
		bdisplay=new JButton("SUBMIT");
		bdisplay.addActionListener(this);
		Font f1=new Font("comic sans ms",Font.BOLD,14);
		l1=new JLabel("Enter A/C no");
		l1.setFont(f1);
		l1.setForeground(Color.RED);
		c.add(l1);c.add(tid);
		c.add(bdisplay);
		setSize(500, 425);
		setLocation(600,200);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==bdisplay)
		{
			new Individualpassbook(tid.getText());

		}
		
	}

}