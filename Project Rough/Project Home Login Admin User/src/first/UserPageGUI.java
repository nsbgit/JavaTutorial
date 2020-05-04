package first;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class UserPageGUI extends JFrame implements ActionListener
{
	private JLabel lDate,lDateValue,lTime,lTimeValue,lUser;
	private JButton bLogOut,bUpdate,bCreateNewAccount,bWithdrawDeposit,
					bRemoveAccount,bShowAll;
	
	private String sysDate,sysTime;
	
	
	
	public UserPageGUI()
	{
		super("Welcome to User");
		
		
		/************PAGE CREATION*******************/
		Container c=getContentPane();
		c.setLayout(new GridLayout(8,2));
		/********************************************/
		
		
		/*************FONT STYLE CREATION**************/
		Font f=new Font("Chiller",Font.BOLD,27);
		Font f1=new Font("comic sans ms",Font.BOLD,14);
		/**********************************************/
		
		
		/******LABEL CREATION (WITH DATE AND TIME)******/
		lUser=new JLabel("USER");
		lUser.setFont(f);
		lUser.setForeground(Color.BLUE);
		
		
		lDate=new JLabel("Current Date");
		lDate.setFont(f1);
		lDate.setForeground(Color.RED);
		
		
		lTime=new JLabel("Current Time");
		lTime.setFont(f1);
		lTime.setForeground(Color.RED);
		
		
		
		Calendar cal = Calendar.getInstance();
		
		String cday = ""+cal.get(Calendar.DATE);
		int x =cal.get(Calendar.MONTH);
		String cmonth = ""+(x+1);
		String cyear =""+cal.get(Calendar.YEAR);
		sysDate = cday+"/"+cmonth+"/"+cyear;
		
		lDateValue=new JLabel(sysDate);		
		
		
	    String chr = ""+cal.get(Calendar.HOUR_OF_DAY);
		String cmin = ""+cal.get(Calendar.MINUTE);
		String csec =""+cal.get(Calendar.SECOND);
		sysTime = chr+":"+cmin+":"+csec;
		
		lTimeValue=new JLabel(sysTime);
		
		
		JPanel datePanel = new JPanel();
		datePanel.add(lDate);
		datePanel.add(lDateValue);
		
		JPanel timePanel = new JPanel();
		timePanel.add(lTime);
		timePanel.add(lTimeValue);
		/************************************************/
		
		
		/********BUTTON CREATION (WITH ACTION LISTENER)*********/
		bLogOut = new JButton("LOG OUT");
		bLogOut.addActionListener(this);
		
		bUpdate = new JButton("UPDATE INFO");
		bUpdate.addActionListener(this);
		/********************************************************/
		
		
		/**************DISPLAY COMPONENT*************************/
		c.add(lUser);			c.add(new JLabel(""));
		c.add(lDate);			c.add(lDateValue);
		c.add(lTime);			c.add(lTimeValue);
		c.add(new JLabel(""));	c.add(new JLabel(""));
		
		c.add(bLogOut);			c.add(bUpdate);
		/********************************************************/
		
		
		/***************FRAME SET********************************/
		setSize(400, 300);
		setLocation(600,200);
		setResizable(false);//for disabling maximize option
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		/********************************************************/
	}
	

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == bLogOut)
		{
			int rply = JOptionPane.showConfirmDialog(this, "Are you sure to log out?");
			if(rply == JOptionPane.YES_OPTION)
			{
				JOptionPane.showMessageDialog(this, "You are successfully logged out.");
				new UserLoginGUI1();
				setVisible(false);
			}
		}
		
		if(e.getSource() == bUpdate)
		{
			JOptionPane.showMessageDialog(this, "Updating");
		}
		
	}

}
