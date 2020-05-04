package test;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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
	private JButton bdisplay,cancel;
	String heading[]={"Accno","Withdraw","Deposit","Total","Date","Time"};
	String data[][]=new String[1000][6];
	private boolean flagAccNum = false;
	public PassBook()
	{
		super("Indivisual Passbook Display");
		Container c=getContentPane();
		c.setLayout(new GridLayout(2,2));
		
		tid=new JTextField();
		
		bdisplay=new JButton("SUBMIT");
		bdisplay.addActionListener(this);
		JPanel apanel=new JPanel();
		apanel.add(bdisplay);
		apanel.setBackground(new Color(0,0,64));
		
		cancel=new JButton("CANCEL");
		cancel.addActionListener(this);
		JPanel bpanel=new JPanel();
		bpanel.add(cancel);
		bpanel.setBackground(new Color(0,0,64));
		
		Font f1=new Font("comic sans ms",Font.BOLD,14);
	    l1=new JLabel("Enter A/C no");
		l1.setFont(f1);
		l1.setForeground(Color.RED);
		JPanel cpanel=new JPanel();
		cpanel.add(l1);
		cpanel.setBackground(new Color(0,0,64));
		
		c.add(cpanel);c.add(tid);
		c.add(apanel);c.add(bpanel);
		
		setSize(400,175);
		setLocation(600,200);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==bdisplay)
		{
			
			/*********************validation check************************/
			
			String vAccNum = tid.getText();
			
			
			/*for account number check
		      * */
			String accNumpattern = "^[0-9]{4}" ; 
			Scanner   scan1  =  new Scanner( vAccNum ) ;
			String   matched1  =  scan1.findInLine( accNumpattern ) ;
			if ( matched1 == null )
			{
				//JOptionPane.showMessageDialog(this, "INVALID PASSWORD\nIt should contain only digits with minimum password length of 4 digit.");
				JOptionPane.showMessageDialog(this, "INVALID ACCOUNT NUMBER\nIt should contain only digits with minimum length of 4 digit.", "Error", JOptionPane.ERROR_MESSAGE);
				tid.setText("");
			}
			else
			{
				flagAccNum     = true;
			}
			
			
			/********************************************************************************/
			
			
			/************************IF VALIDATION SUCCESSFUL*****************************************/
			
			if(flagAccNum == true)
			{
				new Individualpassbook(tid.getText());
				tid.setText("");
			}
			flagAccNum = false;

		}
		
		
		if(e.getSource()==cancel) 
		{
             int con=JOptionPane.showConfirmDialog(this, "Are you sure to cancel?");
			
			if(con==JOptionPane.YES_OPTION)
			{
			   //new FirstWindow("");
				new Userwindow("");
			   setVisible(false);
			}
		
		
		}
		
	}

}