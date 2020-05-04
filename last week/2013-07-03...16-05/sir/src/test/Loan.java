package test;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import javax.swing.*;

public class Loan extends JFrame implements ActionListener 
{
	private JLabel l1,l2,l3,l4;
	private JButton bsubmit,bcancel;
	private JComboBox loantype,loanterm;
	private JTextField tid1,tid2;
	private String acc,amnt,rate;
	ArrayList<LoanData> list2;
	Loan()
{
		super("LOAN APPLICATION FORM");
		Container c=getContentPane();
		c.setLayout(new GridLayout(5,2));
		
		tid1=new JTextField();
		tid2=new JTextField();
		
		String ctvalue[]={"1","3","5"};
		loanterm=new JComboBox(ctvalue);
		JPanel gpanel=new JPanel();
		gpanel.add(loanterm);
		gpanel.setBackground(new Color(0,0,64));
		
		String btvalue[]={"Education","Home","Car"};
		loantype=new JComboBox(btvalue);
		JPanel fpanel=new JPanel();
		fpanel.add(loantype);
		fpanel.setBackground(new Color(0,0,64));
		
		bsubmit=new JButton("SUBMIT");
		bsubmit.addActionListener(this);
		JPanel apanel=new JPanel();
		apanel.add(bsubmit);
		apanel.setBackground(new Color(0,0,64));
		
		bcancel=new JButton("CANCEL");
		bcancel.addActionListener(this);
		JPanel bpanel=new JPanel();
		bpanel.add(bcancel);
		bpanel.setBackground(new Color(0,0,64));
		
		Font f1=new Font("comic sans ms",Font.BOLD,14);
		l1=new JLabel("Enter A/c no");
		l1.setFont(f1);
		l1.setForeground(Color.RED);
		JPanel cpanel=new JPanel();
		cpanel.add(l1);
		cpanel.setBackground(new Color(0,0,64));
		
		l2=new JLabel("Enter Loan Type");
		l2.setFont(f1);
		l2.setForeground(Color.RED);
		JPanel dpanel=new JPanel();
		dpanel.add(l2);
		dpanel.setBackground(new Color(0,0,64));
		
		l3=new JLabel("Enter Loan Term");
		l3.setFont(f1);
		l3.setForeground(Color.RED);
		JPanel epanel=new JPanel();
		epanel.add(l3);
		epanel.setBackground(new Color(0,0,64));
		
		l4=new JLabel("Enter Amount of Loan");
		l4.setFont(f1);
		l4.setForeground(Color.RED);
		JPanel qpanel=new JPanel();
		qpanel.add(l4);
		qpanel.setBackground(new Color(0,0,64));
		
		c.add(cpanel);c.add(tid1);
		c.add(dpanel);c.add(fpanel);
		c.add(epanel);c.add(gpanel);
		c.add(qpanel);c.add(tid2);
		c.add(apanel);c.add(bpanel);

		setSize(600,400);
		setLocation(200,200);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		

}
	
	public void actionPerformed(ActionEvent e)
	{
		int r=0,p=0;
		if(e.getSource()==bsubmit)
	{
		

			try//read from file
			{
				FileInputStream fin=new FileInputStream("loan.dat");
				ObjectInputStream oin=new ObjectInputStream(fin);
				list2=(ArrayList<LoanData>)oin.readObject();
				//reading all account withdraw info
			}
			catch(Exception e1)
			{
				JOptionPane.showMessageDialog(this, "No file found in data base", "Error", JOptionPane.ERROR_MESSAGE);
			}
			
			for(LoanData re : list2)
			{
				if(re.getAcc().equals(tid1.getText()))
				{
	            p++;
				}
			}
			if(p==0)
			{
				String w=(String)loantype.getSelectedItem();
				if(w.equals("Education"))
				{
					acc=tid1.getText();
					amnt=tid2.getText();
					String terms=(String)loanterm.getSelectedItem();
					rate="13.52%";
					new LoanCreate(acc,amnt,w,terms,rate);
					new LoanDisplay();
					r++;
				}
				if(w.equals("Home"))
				{
					acc=tid1.getText();
					amnt=tid2.getText();
					String terms=(String)loanterm.getSelectedItem();
					rate="9.95%";
					new LoanCreate(acc,amnt,w,terms,rate);
					new LoanDisplay();
					r++;
				}
				if(w.equals("Car"))
				{
					acc=tid1.getText();
					amnt=tid2.getText();
					String terms=(String)loanterm.getSelectedItem();
					rate="7.65%";
					new LoanCreate(acc,amnt,w,terms,rate);
					new LoanDisplay();
					r++;
				}
				if(r>0)
				{
					JOptionPane.showMessageDialog(this, "LOAN ISSUED");
				}
				else
				{
					JOptionPane.showMessageDialog(this, "LOAN CANNOT BE ISSUED");
				}
				
			}
			else
			{
				JOptionPane.showMessageDialog(this, "LOAN ACCOUNT ALREADY EXIST");
			}

			
				
	        }
		if(e.getSource()==bcancel)
		{
			int rply = JOptionPane.showConfirmDialog(this, "Are you sure to quit?");
			if(rply == JOptionPane.YES_OPTION)
			{
				new Request();
				setVisible(false);
			}
		}
	}

}
