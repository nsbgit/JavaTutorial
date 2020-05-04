package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.util.*;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class UserRemove extends JFrame implements ActionListener
{
	private JLabel l1,l2,l3;
	private JTextField t1;
	private JButton submit,back;
	
	public UserRemove()
	{
		Container c=getContentPane();
		c.setLayout(new GridLayout(3,2));
		
		Font f1=new Font("Times New Roman",Font.BOLD,20);
		l1=new JLabel("USER");
		l1.setFont(f1);
		l1.setForeground(Color.RED);
		JPanel fpanel=new JPanel();
		fpanel.add(l1);
		fpanel.setBackground(new Color(0,0,64));
		
		l2=new JLabel("Delete");
		l2.setFont(f1);
		l2.setForeground(Color.RED);
		JPanel apanel=new JPanel();
		apanel.add(l2);
		apanel.setBackground(new Color(0,0,64));
		
		l3=new JLabel("Give USER A/C no");
		l3.setFont(f1);
		l3.setForeground(Color.RED);
		JPanel bpanel=new JPanel();
		bpanel.add(l3);
		bpanel.setBackground(new Color(0,0,64));
		
		t1=new JTextField();
		
		submit=new JButton("Delete");
		submit.addActionListener(this);
		JPanel cpanel=new JPanel();
		cpanel.add(submit);
		cpanel.setBackground(new Color(0,0,64));
		
		back=new JButton("BACK");
		back.addActionListener(this);
		JPanel dpanel=new JPanel();
		dpanel.add(back);
		dpanel.setBackground(new Color(0,0,64));
		
		c.add(fpanel);c.add(apanel);
		c.add(bpanel);c.add(t1);
		c.add(cpanel);c.add(dpanel);
		
		setSize(550,300);
		setLocation(200,200);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == submit)
		{
			JOptionPane.showMessageDialog(this, "Delete BUTTON");
			String sname = t1.getText().trim();
			new UserRemoveDisplay(sname);
			setVisible(false);
		}
		if(e.getSource()==back) 
		{
             int con=JOptionPane.showConfirmDialog(this, "Are You Sure you want to cancel?");
			
			if(con==JOptionPane.YES_OPTION)
			{
			   new Userwindow();
			   setVisible(false);
			}
		
		
		}

		
		
		
		
	}
	

}
