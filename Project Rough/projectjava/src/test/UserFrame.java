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
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class UserFrame extends JFrame implements ActionListener
{
	private JLabel l1,l2;
	private JPasswordField tpass;
	private JButton blogin;
	private JButton bnewuser;
	private JTextField tid;
	UserFrame(String title)
	{
		super(title);
		Container c=getContentPane();
		c.setLayout(new GridLayout(3,2));
		tpass=new JPasswordField();
		tid=new JTextField();
		blogin=new JButton("LOGIN");
		blogin.addActionListener(this);
		bnewuser=new JButton("NEW USER");
		bnewuser.addActionListener(this);
		Font f1=new Font("comic sans ms",Font.BOLD,14);
		l1=new JLabel("USER ID");
		l1.setFont(f1);
		l1.setForeground(Color.BLUE);
		l2=new JLabel("PASSWORD");
		l2.setFont(f1);
		l2.setForeground(Color.BLUE);
		c.add(l1);c.add(tid);
		c.add(l2);c.add(tpass);
		c.add(blogin);c.add(bnewuser);

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
			String d[][]=new String[20][5];
			String p[][]=new String[20][5];
			
			ArrayList<RegistrationData> list1=new ArrayList<RegistrationData>();
			try
			{
			FileInputStream fin=new FileInputStream("Regi.dat");
			ObjectInputStream oin=new ObjectInputStream(fin);
			list1=(ArrayList<RegistrationData>)oin.readObject();
			int r=0,k=0;
			for(RegistrationData re1 :list1)
			{
				d[r][0]=re1.getName();
				p[k][0]=re1.getPassword();
				if(d[r][0].equals(tid.getText()))
						{
				     
					char [] pwd=tpass.getPassword();
					String str=new String(pwd);
					if(p[k][0].equals(str))
					{
						new Userwindow();
					}
					
				     					     	}
						
			}
			k++;
			r++;
			}
			catch(Exception e1)
			{
				System.out.println(e.toString());
			}
		}
		if(e.getSource()==bnewuser)
		{
			new RegistrationFrame("WELCOME");
		}
	}


}
