package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.util.*;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

class SecondWindow extends JFrame implements ActionListener
{
	private JLabel l0,l1,l2,l3;
	private JTextField t1;
	private JPasswordField p1;
	private JButton login,cancel;
	
	public SecondWindow()
	{
		Container c=getContentPane();
		c.setLayout(new GridLayout(4,2));
		
		Font f1=new Font("Times New Roman",Font.BOLD,20);
		l1=new JLabel("                ADMINISTRATOR");
		l1.setFont(f1);
		l1.setForeground(Color.RED);
		JPanel fpanel=new JPanel();
		fpanel.add(l1);
		fpanel.setBackground(new Color(0,0,64));
		
		l0=new JLabel("LOGIN                            ");
		l0.setFont(f1);
		l0.setForeground(Color.RED);
		JPanel epanel=new JPanel();
		epanel.add(l0);
		epanel.setBackground(new Color(0,0,64));
		
		//Font f1=new Font("Times New Roman",Font.BOLD,20);
		l2=new JLabel("USERNAME");
		l2.setFont(f1);
		l2.setForeground(Color.RED);
		JPanel apanel=new JPanel();
		apanel.add(l2);
		apanel.setBackground(new Color(0,0,64));
		
		
		//Font f1=new Font("Times New Roman",Font.BOLD,20);
		l3=new JLabel("PASSWORD");
		l3.setFont(f1);
		l3.setForeground(Color.RED);
		JPanel bpanel=new JPanel();
		bpanel.add(l3);
		bpanel.setBackground(new Color(0,0,64));
		
		
		t1=new JTextField();
		p1=new JPasswordField();
		
		login=new JButton("LOGIN");
		login.addActionListener(this);
		JPanel cpanel=new JPanel();
		cpanel.add(login);
		cpanel.setBackground(new Color(0,0,64));
		
		
		cancel=new JButton("CANCEL");
		cancel.addActionListener(this);
		JPanel dpanel=new JPanel();
		dpanel.add(cancel);
		dpanel.setBackground(new Color(0,0,64));
		
		
		c.add(fpanel);c.add(epanel);
		c.add(apanel);c.add(t1);
		c.add(bpanel);c.add(p1);
		c.add(cpanel);c.add(dpanel);
		
		setSize(500,425);
		setLocation(200,200);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==login) 
		{
			if(t1.getText().equals("admin")) 
			{
				char [] pwd=p1.getPassword();
				String str=new String(pwd);
				if(str.equals("1234"))
				{

					JOptionPane.showMessageDialog(this, "HELLO....");
					new Admin() ;
					setVisible(false);
					
				}
			}
			else
				JOptionPane.showMessageDialog(this, "Wrong username/password..");	
			}
		if(e.getSource()==cancel) 
		{
             int con=JOptionPane.showConfirmDialog(this, "Are You Sure you want to cancel?");
			
			if(con==JOptionPane.YES_OPTION)
			{
			   new FirstWindow("");
			   setVisible(false);
			}
		
		
		}
	}
	
}

public class Main1
{

	public static void main(String[] args) 
	{
	

	}

}
