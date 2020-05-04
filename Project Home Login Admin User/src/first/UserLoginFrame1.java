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
import javax.swing.JPasswordField;
import javax.swing.JTextField;


class UserLoginGUI1 extends JFrame implements ActionListener
{
	private JLabel lSignIn,lDate,lDateValue,lTime,lTimeValue,lUserID,lPassword;
	private JTextField tUserID;
	private JPasswordField tPassword;
	private JButton bBack,bSignIn;
	
	private String sysDate,sysTime;
	
	
	
	public UserLoginGUI1()
	{
		super("Login in as an user");
		
		
		/************PAGE CREATION*******************/
		Container c=getContentPane();
		c.setLayout(new GridLayout(7,2));
		/********************************************/
		
		
		/*************FONT STYLE CREATION**************/
		Font f=new Font("Chiller",Font.BOLD,27);
		Font f1=new Font("comic sans ms",Font.BOLD,14);
		/**********************************************/
		
		
		
		/******LABEL CREATION (WITH DATE AND TIME)******/
		lSignIn=new JLabel("SIGN IN");
		lSignIn.setFont(f);
		lSignIn.setForeground(Color.BLUE);
		
		
		lUserID=new JLabel("User ID");
		lUserID.setFont(f1);
		lUserID.setForeground(Color.RED);
		
		lPassword=new JLabel("Pasword");
		lPassword.setFont(f1);
		lPassword.setForeground(Color.RED);
		
		lDate=new JLabel("Current Date");
		lDate.setFont(f1);
		lDate.setForeground(Color.RED);
		
		lTime=new JLabel("Current Password");
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
		
		
		/**************TEXT AND PASSWORD FIELD CREATION*********/
		tUserID = new JTextField();
		
		tPassword = new JPasswordField();
		/*******************************************************/
		
		
		/********BUTTON CREATION (WITH ACTION LISTENER)*********/
		bBack = new JButton("BACK");
		bBack.addActionListener(this);
		
		bSignIn = new JButton("SIGN IN");
		bSignIn.addActionListener(this);
		/********************************************************/
		
		
		/**************DISPLAY COMPONENT*************************/
		c.add(lSignIn);			c.add(datePanel);
		c.add(new JLabel(""));	c.add(timePanel);
		c.add(new JLabel(""));	c.add(new JLabel(""));
		c.add(lUserID);			c.add(tUserID);
		c.add(lPassword);		c.add(tPassword);
		c.add(new JLabel(""));	c.add(new JLabel(""));
		c.add(bBack);			c.add(bSignIn);
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
	public void actionPerformed(ActionEvent arg0)
	{
		if(arg0.getSource() == bBack)
		{
			JOptionPane.showMessageDialog(this, "Back button");
		}
		else if(arg0.getSource() == bSignIn)
		{
			String enteredUserID = tUserID.getText().trim();
			String enteredPassword = tPassword.getText().trim();
			try
			{
				if(enteredUserID.equals(""));
				
			}catch(Exception ex)
			{
				JOptionPane.showMessageDialog(this, "Empty Entry");
			}
			JOptionPane.showMessageDialog(this, "Sign in button");
		}
		
	}
}

public class UserLoginFrame1
{
	public static void main(String[] args)
	{
		new UserLoginGUI1();

	}

}
