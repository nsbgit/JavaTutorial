package test;

import java.awt.Color;
import java.util.*; //CALENDER CLASS
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class RegistrationFrame extends JFrame  implements ActionListener // TO RECOGNIZE MOUSE CLICK WE WRITE ACTIONLISTENER
{

	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
	private JTextField tid;
	private JPasswordField tpass;
	private JTextArea tadd; 								/* we can write multiple line*/
	private JComboBox city,day,month,year; 
	private JCheckBox cmo,cmu,cco;
	private JRadioButton rmale,rfemale;
	private JButton bsubmit,breset, bsearch, bupdate;
	
	private String sysdate,systime;
		
	public RegistrationFrame(String title)
	{
		super(title);
		
		Container c=getContentPane();
		c.setLayout(new GridLayout(12,2));
		
		tid=new JTextField(); 
		tpass=new JPasswordField();
		
		tadd=new JTextArea(5,20);
		JScrollPane tapan=new JScrollPane(tadd);
		
		String ctvalue[]={"Kolkata","Delhi","Mumbai","Chennai","Hydrabad","Pune","Bangalore"};
		city=new JComboBox(ctvalue); //dropdown box 
		
		
		rmale=new JRadioButton("Male");
		//rmale.setSelected(true);
		
		rfemale=new JRadioButton("Female");
		ButtonGroup rgroup=new ButtonGroup(); //multiple we radio button we should create ButtonGrouo , whenever one button selected other will be disabled
		
		rgroup.add(rmale);
		rgroup.add(rfemale);
		JPanel gpanel=new JPanel();
		
		gpanel.add(rmale);
		gpanel.add(rfemale);
		
		String dvalue[]=new String[31];
		for(int i=0;i<=30;i++)
		{
			dvalue[i]=String.valueOf(i+1);
		}
		day=new JComboBox(dvalue);
		
		String mvalue[]=new String[12];
		for(int i=0;i<=11;i++)
		{
			mvalue[i]=String.valueOf(i+1);
		}
		month=new JComboBox(mvalue);
		
		String yvalue[]=new String[12];
		int cnt=0;
		for(int i=2006;i<=2013;i++)
		{
			yvalue[cnt]=String.valueOf(i);
			cnt++;	
		}
		year=new JComboBox(yvalue);
		JPanel cpanel=new JPanel();
		cpanel.add(day);
		cpanel.add(month);
		cpanel.add(year);
		
		cmo=new JCheckBox("Movie");
		cmu=new JCheckBox("Music");
		cco=new JCheckBox("Computer");
		JPanel ipanel=new JPanel();
		ipanel.add(cmo);
		ipanel.add(cmu);
		ipanel.add(cco);
		
		bsubmit=new JButton("Register");
		bsubmit.addActionListener(this); // JVM CALLS ACTION LISTENER  
				
		breset=new JButton("Show All");
		breset.addActionListener(this);
				
		bsearch=new JButton("Search");
				
		bupdate=new JButton("Update");
				
		Font f=new Font("Chiller",Font.BOLD,28);
		l1=new JLabel("REGISTRATION");
		l1.setFont(f);
		l1.setForeground(Color.BLACK);
		
		Font f1=new Font("comic sans ms",Font.BOLD,16);
		l2=new JLabel("Enter Name");
		l2.setFont(f1);
		l2.setForeground(Color.GRAY);
		
		l3=new JLabel("Enter Pasword");
		l3.setFont(f1);
		l3.setForeground(Color.GRAY);
		
		l4=new JLabel("Enter Address");
		l4.setFont(f1);
		l4.setForeground(Color.GRAY);
		
		l5=new JLabel("Select City");
		l5.setFont(f1);
		l5.setForeground(Color.GRAY);
		
		l6=new JLabel("Select Gender");
		l6.setFont(f1);
		l6.setForeground(Color.GRAY);
		
		l7=new JLabel("Select DOB");
		l7.setFont(f1);
		l7.setForeground(Color.GRAY);
		
		l8=new JLabel("Select Interests");
		l8.setFont(f1);
		l8.setForeground(Color.GRAY);
		
		l9=new JLabel("Current Date");
		l9.setFont(f1);
		l9.setForeground(Color.BLACK);
		
		Calendar cal = Calendar.getInstance(); //GETINTSNCE TOOK SYSTEM DATE AND TIME AND STORES IT INTO CAL OBJECT
		
		String cday = ""+cal.get(Calendar.DATE);//EXTRACT DATE FROM OBJECT AND STORE IN CDAY
		int x =cal.get(Calendar.MONTH);
		String cmonth = ""+(x+1);
		String cyear =""+cal.get(Calendar.YEAR);
		sysdate = cday+"/"+cmonth+"/"+cyear;
		l11=new JLabel(sysdate);		
		
	    String chr = ""+cal.get(Calendar.HOUR_OF_DAY);
		String cmin = ""+cal.get(Calendar.MINUTE);
		String csec =""+cal.get(Calendar.SECOND);
		systime = chr+":"+cmin+":"+csec;
		
		l12=new JLabel(systime);		
		
		l10=new JLabel("Current Time");
		l10.setFont(f1);
		l10.setForeground(Color.BLACK);

		c.add(l1);c.add(new JLabel(""));
		c.add(l2);c.add(tid);
		c.add(l3);c.add(tpass);
		c.add(l4);c.add(tapan);
		c.add(l5);c.add(city);
		c.add(l6);c.add(gpanel);
		c.add(l7);c.add(cpanel);
		c.add(l8);c.add(ipanel);
		c.add(l9);c.add(l11);
		c.add(l10);c.add(l12);
		c.add(bsubmit);c.add(breset);
		c.add(bsearch);c.add(bupdate);
		
		setSize(500, 425);
		setLocation(200,300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		if(e.getSource()== bsubmit)
		{
				JOptionPane.showMessageDialog(this, "register");
		}
		if(e.getSource()== breset)
		{
				JOptionPane.showMessageDialog(this, "show all");
		}
	
		
	}
}

public class Registration 
{
	public static void main(String[] args) 
	{
        new RegistrationFrame("WELCOME...");	

	}

}