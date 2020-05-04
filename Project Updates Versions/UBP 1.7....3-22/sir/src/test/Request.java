package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.util.*;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class Request extends JFrame implements ActionListener
{
	private JLabel l1;
	private JButton dd,chq,atm,loan;
	
	public Request()
	{
		Container c=getContentPane();
		c.setLayout(new GridLayout(5,1));
		
		Font f1=new Font("Times New Roman",Font.BOLD,20);
		l1=new JLabel("REQUEST");
		l1.setFont(f1);
		l1.setForeground(Color.RED);
		JPanel fpanel=new JPanel();
		fpanel.add(l1);
		fpanel.setBackground(new Color(0,0,64));
		
		dd=new JButton("MAKE DEMAND DRAFT");
		dd.addActionListener(this);
		JPanel cpanel=new JPanel();
		cpanel.add(dd);
		cpanel.setBackground(new Color(0,0,64));
		
		chq=new JButton("APPLY FOR CHEQUE BOOK");
		chq.addActionListener(this);
		JPanel dpanel=new JPanel();
		dpanel.add(chq);
		dpanel.setBackground(new Color(0,0,64));
		
		atm=new JButton("APPLY FOR ATM CARD");
		atm.addActionListener(this);
		JPanel epanel=new JPanel();
		epanel.add(atm);
		epanel.setBackground(new Color(0,0,64));
		
		loan=new JButton("APPLY FOR LOAN");
		loan.addActionListener(this);
		JPanel gpanel=new JPanel();
		gpanel.add(loan);
		gpanel.setBackground(new Color(0,0,64));
		
		c.add(fpanel);
		c.add(cpanel);
		c.add(dpanel);
		c.add(epanel);
		c.add(gpanel);
		
		setSize(500,425);
		setLocation(200,200);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==dd)
		{
			//new Request();
			new Demanddraft();
			setVisible(false);
		}
		if(e.getSource()==chq)
		{
			new ChequeBook();
			setVisible(false);
		}
		if(e.getSource()==atm)
		{
			new ATMcard();
			setVisible(false);
		}
		if(e.getSource()==loan)
		{
			//new Request();
			setVisible(false);
		}
		
	}

}
