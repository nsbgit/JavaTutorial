package test;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.*;


public class CreateFrame extends JFrame implements ActionListener
{
	private JLabel l0,l01,l1,l2,l3,l4,l40,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21;
	private JTextField tid1,tid2,tid3,tid4,tid5,tid6,tid7,tid8,tid9,tid10;
	private JComboBox city,day,month,year,annualincome,identity,profession,acctype,acno;
	private JRadioButton rmale,rfemale,rsav,rothers,married,unmarried;
	private JButton bsubmit,back;
	private String sysdate,systime;
	//private ArrayList<Create> alist = new ArrayList<Create>();

	CreateFrame()
	{
		Container c=getContentPane();
		c.setLayout(new GridLayout(22,2));
		
		tid1=new JTextField();
		tid2=new JTextField();
		tid3=new JTextField();
		tid4=new JTextField();
		tid5=new JTextField();
		tid6=new JTextField();
		tid7=new JTextField();
		tid8=new JTextField();
		tid9=new JTextField();
		tid10=new JTextField();
		
		String cvalue[]={"<50000","50000-100000","100000-600000",">600000"};
		annualincome=new JComboBox(cvalue);
		
		String d1value[]={"Government Service","Business","Private Sector","Student","Others"};
		profession=new JComboBox(d1value);
		
		String evalue[]={"Pan Card","Voter Card","Ration Card","Driving License"};
		identity=new JComboBox(evalue);
		
		String fvalue[]=new String[100];
		int cnt1=0;
		for(int i=1000;i<=1099;i++)
		{
			fvalue[cnt1]=String.valueOf(i+1);
			cnt1++;
		}
		acno=new JComboBox(fvalue);
		
		rsav=new JRadioButton("Savings");
		rothers=new JRadioButton("Others");
		
		ButtonGroup r1group=new ButtonGroup();
		r1group.add(rsav);
		r1group.add(rothers);
		
		JPanel kpanel=new JPanel();

		rmale=new JRadioButton("Male");
		rfemale=new JRadioButton("Female");
		ButtonGroup rgroup=new ButtonGroup();
		rgroup.add(rmale);
		rgroup.add(rfemale);
		JPanel gpanel=new JPanel();
		
		married=new JRadioButton("Married");
		unmarried=new JRadioButton("Single");
		ButtonGroup r2group=new ButtonGroup();
		r2group.add(rmale);
		r2group.add(rfemale);
		JPanel gopanel=new JPanel();
		
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
		
		String yvalue[]=new String[25];
		int cnt=0;
		for(int i=1989;i<=2013;i++)
		{
			yvalue[cnt]=String.valueOf(i);
			cnt++;	
		}
		year=new JComboBox(yvalue);
		JPanel cpanel=new JPanel();
		cpanel.add(day);
		cpanel.add(month);
		cpanel.add(year);
		bsubmit=new JButton("Register");
		bsubmit.addActionListener(this);
		
		Font f1=new Font("Times New Roman",Font.BOLD,14);
		l01=new JLabel("                                     ACCOUNT OPENING");
		l01.setFont(f1);
		l01.setForeground(Color.RED);
		JPanel fpanel=new JPanel();
		fpanel.add(l01);
		fpanel.setBackground(new Color(0,0,64));
		
		l0=new JLabel("FORM                                                 ");
		l0.setFont(f1); 
		l0.setForeground(Color.RED);
		JPanel apanel=new JPanel();
		apanel.add(l0);
		apanel.setBackground(new Color(0,0,64));

		
		//Font f1=new Font("Times New Roman",Font.BOLD,14);
		l1=new JLabel("Enter First Name");
		l1.setFont(f1);
		l1.setForeground(Color.RED);
		JPanel bpanel=new JPanel();
		bpanel.add(l1);
		bpanel.setBackground(new Color(0,0,64));
		
		l2=new JLabel("Enter Last Name");
		l2.setFont(f1);
		l2.setForeground(Color.RED);
		JPanel copanel=new JPanel();
		copanel.add(l2);
		copanel.setBackground(new Color(0,0,64));
		
		l3=new JLabel("Enter Address");
		l3.setFont(f1);
		l3.setForeground(Color.RED);
		JPanel dpanel=new JPanel();
		dpanel.add(l3);
		dpanel.setBackground(new Color(0,0,64));
		
		l4=new JLabel("Enter Phone Number(Landline)");
		l4.setFont(f1);
		l4.setForeground(Color.RED);
		JPanel epanel=new JPanel();
		epanel.add(l4);
		epanel.setBackground(new Color(0,0,64));
		
		l40=new JLabel("Enter Phone Number(Mobile)");
		l40.setFont(f1);
		l40.setForeground(Color.RED);
		JPanel vpanel=new JPanel();
		vpanel.add(l40);
		vpanel.setBackground(new Color(0,0,64));

		
		l5=new JLabel("Select Sex");
		l5.setFont(f1);
		l5.setForeground(Color.RED);
		JPanel qpanel=new JPanel();
		qpanel.add(l5);
		qpanel.setBackground(new Color(0,0,64));

		
		l6=new JLabel("Natinality");
		l6.setFont(f1);
		l6.setForeground(Color.RED);
		JPanel wpanel=new JPanel();
		wpanel.add(l6);
		wpanel.setBackground(new Color(0,0,64));

		
		l7=new JLabel("Select Age");
		l7.setFont(f1);
		l7.setForeground(Color.RED);
		JPanel opanel=new JPanel();
		opanel.add(l7);
		opanel.setBackground(new Color(0,0,64));

		
		l8=new JLabel("Select A/C Type");
		l8.setFont(f1);
		l8.setForeground(Color.RED);
		JPanel zpanel=new JPanel();
		zpanel.add(l8);
		zpanel.setBackground(new Color(0,0,64));

		
		l9=new JLabel("Current DOB");
		l9.setFont(f1);
		l9.setForeground(Color.RED);
		JPanel xpanel=new JPanel();
		xpanel.add(l9);
		xpanel.setBackground(new Color(0,0,64));

		l10=new JLabel("Enter Annual Income");
		l10.setFont(f1);
		l10.setForeground(Color.RED);
		JPanel vxpanel=new JPanel();
		vxpanel.add(l10);
		vxpanel.setBackground(new Color(0,0,64));

		l11=new JLabel("Enter Profession");
		l11.setFont(f1);
		l11.setForeground(Color.RED);
		JPanel vppanel=new JPanel();
		vppanel.add(l11);
		vppanel.setBackground(new Color(0,0,64));
		
        l12=new JLabel("Enter Marital Status");
        l12.setFont(f1);
		l12.setForeground(Color.RED);
		JPanel npanel=new JPanel();
		npanel.add(l12);
		npanel.setBackground(new Color(0,0,64));

		l13=new JLabel("Enter Identity Proof");
        l13.setFont(f1);
		l13.setForeground(Color.RED);
		JPanel mpanel=new JPanel();
		mpanel.add(l13);
		mpanel.setBackground(new Color(0,0,64));

		l14=new JLabel("Enter Designation");
        l14.setFont(f1);
		l14.setForeground(Color.RED);
		JPanel jpanel=new JPanel();
		jpanel.add(l14);
		jpanel.setBackground(new Color(0,0,64));

		l15=new JLabel("Enter Initial Amount");
        l15.setFont(f1);
		l15.setForeground(Color.RED);
		JPanel bcpanel=new JPanel();
		bcpanel.add(l15);
		bcpanel.setBackground(new Color(0,0,64));

        Calendar cal = Calendar.getInstance();
		
		String cday = ""+cal.get(Calendar.DATE);
		int x =cal.get(Calendar.MONTH);
		String cmonth = ""+(x+1);
		String cyear =""+cal.get(Calendar.YEAR);
		sysdate = cday+"/"+cmonth+"/"+cyear;
		l16=new JLabel(sysdate);		
		
	    String chr = ""+cal.get(Calendar.HOUR_OF_DAY);
		String cmin = ""+cal.get(Calendar.MINUTE);
		String csec =""+cal.get(Calendar.SECOND);
		systime = chr+":"+cmin+":"+csec;
		
		l17=new JLabel(systime);		
		
		l18=new JLabel("Current Time");
		l18.setFont(f1);
		l18.setForeground(Color.RED);
		JPanel vopanel=new JPanel();
		vopanel.add(l18);
		vopanel.setBackground(new Color(0,0,64));
		
		l19=new JLabel("Current Date");
		l19.setFont(f1);
		l19.setForeground(Color.RED);
		JPanel vipanel=new JPanel();
		vipanel.add(l19);
		vipanel.setBackground(new Color(0,0,64));
		
		l20=new JLabel("Give Account number");
		l20.setFont(f1);
		l20.setForeground(Color.RED);
		JPanel poppanel=new JPanel();
		poppanel.add(l20);
		poppanel.setBackground(new Color(0,0,64));
		l20=new JLabel("Initial Amount");
		l20.setFont(f1);
		l20.setForeground(Color.RED);
		JPanel kop=new JPanel();
		kop.add(l20);
		kop.setBackground(new Color(0,0,64));
		
		
		bsubmit=new JButton("SUBMIT");
		bsubmit.addActionListener(this);
		JPanel dopanel=new JPanel();
		dopanel.add(bsubmit);
		dopanel.setBackground(new Color(0,0,64));
		
		back=new JButton("BACK");
		back.addActionListener(this);
		JPanel dipanel=new JPanel();
		dipanel.add(back);
		dipanel.setBackground(new Color(0,0,64));
		
		
        c.add(fpanel);c.add(apanel);
		c.add(bpanel);c.add(tid1);
		c.add(copanel);c.add(tid2);
		c.add(dpanel);c.add(tid3);
		c.add(epanel);c.add(tid4);
		c.add(vpanel);c.add(tid5);
		c.add(qpanel);c.add(gpanel);
		c.add(wpanel);c.add(tid6);
		c.add(opanel);c.add(tid7);
		c.add(zpanel);c.add(kpanel);
		c.add(xpanel);c.add(cpanel);
		c.add(vxpanel);c.add(annualincome);
		c.add(vppanel);c.add(profession);
		c.add(npanel);c.add(gopanel);
		c.add(mpanel);c.add(identity);
		c.add(jpanel);c.add(tid8);
		c.add(bcpanel);c.add(tid9);
		c.add(poppanel);c.add(acno);
		c.add(kop);c.add(tid10);
		c.add(vipanel);c.add(l16);
		c.add(vopanel);c.add(l17);
		c.add(dopanel);c.add(dipanel);
		
		
		setSize(600,625);
		setLocation(200,200);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		

	}

	
	public void actionPerformed(ActionEvent e)
	{
		 String name;
		 String name1;
		 String address;
		 String nationality;
		 String acc;
		 String gn;
		 String dob;
		 String date;
	     String time;
		 String Iden;
		 String prof;
		 String inti;
		 String withdraw="0", deposite="0";
		 String balance="0";
		Create reg,reg2,reg3;
		if(e.getSource()==bsubmit)
		{
			inti=tid10.getText();
			name=tid1.getText();
			name1=tid2.getText();
			address=tid3.getText();
			nationality=tid5.getText();
			Iden=(String)identity.getSelectedItem();
			prof=(String)profession.getSelectedItem();
			acc="";
			if(rsav.isSelected())
			{
				acc="Savings";
			}
			else if(rothers.isSelected())
			{
				acc="Others";
			}
			gn="";
			if(rmale.isSelected())
			{
				gn="Male";
			}
			else if(rfemale.isSelected())
			{
				gn="Female";
			}
			
			String d=(String)day.getSelectedItem();
			String m=(String)month.getSelectedItem();
			String y=(String)year.getSelectedItem();
			dob=d + "-" + m + "-" + y;
			String ac1=(String)acno.getSelectedItem();
			
			reg=new Create();
			reg.setName(name);
			reg.setName1(name1);
			reg.setAddress(address);
			reg.setNationality(nationality);
			reg.setAcctype(acc);
			reg.setGender(gn);
			reg.setDob(dob);
			reg.setIdentity(Iden);
			reg.setProfession(prof);
			reg.setAc(ac1);
			reg.setInitialamnt(inti);
			reg.setDate(l16.getText());
			reg.setTime(l17.getText());
			
			
			
			int bal = Integer.parseInt(balance)
					+ Integer.parseInt(deposite)
					-Integer.parseInt(withdraw);
			balance =""+bal;
			
			reg2=new Create();
			
			reg2.setAc(ac1);
			reg2.setBalance(balance);
			
			
			reg3 = new Create();
			
			reg3.setAc(ac1);
			reg3.setDeposite(inti);
			/*if(inti.equals("0"))
			{
				
			}*/
			reg3.setWithdraw(withdraw);
			reg3.setBalance(balance);
			
			
        int con=JOptionPane.showConfirmDialog(this, "Are You Sure to Register?");
			
			if(con==JOptionPane.YES_OPTION)
			{
			   new AddInformation1(reg);
			   new AddInformation2(reg2);
			   new AddInformation3(reg3);
			   setVisible(false);
			
		}
	
	
	
	}
		if(e.getSource()==back)
		{
			new Userwindow();
			setVisible(false);
		}


}
}
