package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

class ThirdWindow extends JFrame implements ActionListener
{
	private JLabel l0,l1,l2,l3;
	private JTextField t1;
	private JPasswordField p1;
	private JButton login,newuser,back;
	
	public ThirdWindow()
	{
		Container c=getContentPane();
		c.setLayout(new GridLayout(4,2));
		
		Font f1=new Font("Times New Roman",Font.BOLD,28);
		l0=new JLabel("            OPERATOR");
		l0.setFont(f1);
		l0.setForeground(Color.RED);
		JPanel fpanel=new JPanel();
		fpanel.add(l0);
		fpanel.setBackground(new Color(0,0,64));
		
		Font f2=new Font("Times New Roman",Font.BOLD,20);
		l1=new JLabel("LOGIN               ");
		l1.setFont(f1);
		l1.setForeground(Color.RED);
		JPanel fxpanel=new JPanel();
		fxpanel.add(l1);
		fxpanel.setBackground(new Color(0,0,64));
		
		//Font f1=new Font("Times New Roman",Font.BOLD,);
		l2=new JLabel("USERNAME");
		l2.setFont(f2);
		l2.setForeground(Color.RED);
		
		//Font f1=new Font("Times New Roman",Font.BOLD,20);
		l3=new JLabel("PASSWORD");
		l3.setFont(f2);
		l3.setForeground(Color.RED);
		
		t1=new JTextField();
		p1=new JPasswordField();
		
		JPanel xpanel=new JPanel();
		xpanel.add(l2);
		xpanel.setBackground(new Color(0,0,64));
		
		JPanel xppanel=new JPanel();
		xppanel.add(t1);
		xppanel.setBackground(new Color(0,0,64));
		
		JPanel lpanel=new JPanel();
		lpanel.add(l3);
		lpanel.setBackground(new Color(0,0,64));
		
		JPanel xlpanel=new JPanel();
		xlpanel.add(p1);
		xlpanel.setBackground(new Color(0,0,64));
		
		
		login=new JButton("LOGIN");
		JPanel gpanel=new JPanel();
		gpanel.add(login);
		gpanel.setBackground(new Color(0,0,64));
		login.addActionListener(this);
		
		/*newuser=new JButton("NEW USER: REGISTER HERE");
		gpanel.add(newuser);
		//ganel.setBackground(new Color(0,0,64));
		newuser.addActionListener(this);*/
		
		back=new JButton("BACK");
		JPanel apanel=new JPanel();
		apanel.add(back);
		apanel.setBackground(new Color(0,0,64));
		back.addActionListener(this);
		
		c.add(fpanel);c.add(fxpanel);
		c.add(xpanel);c.add(t1);
		c.add(lpanel);c.add(p1);
		c.add(gpanel);c.add(apanel);
		
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
				if(t1.getText().equals("operator")) 
				{
					char [] pwd=p1.getPassword();
					String str=new String(pwd);
					if(str.equals("1234"))
					{

						JOptionPane.showMessageDialog(this, "HELLO OPERATOR....");
						new Userwindow() ;
						setVisible(false);		
					}
				}
				else
					JOptionPane.showMessageDialog(this, "Wrong username/password..");	
				}
		/*if(e.getSource()==login) 
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
				if(d[r][0].equals(t1.getText()))
						{
				     
					char [] pwd=p1.getPassword();
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
		}*/
	if(e.getSource()==back)
	{
		int con=JOptionPane.showConfirmDialog(this, "Are You Sure to go back?");
		
		if(con==JOptionPane.YES_OPTION)
		{
		   new FirstWindow("");
		   setVisible(false);	
		}
	}

		
	}
		

			
		}
		
		
		
	



public class UserMain1 
{
	public static void main(String[] args) 
	{
	

	}

}
