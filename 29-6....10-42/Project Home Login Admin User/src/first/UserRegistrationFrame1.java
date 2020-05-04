package first;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.*;




class UserRegistrationGUI1 extends JFrame implements ActionListener
{

	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,lDateValue,lTimeValue,lUserID,lLastName;
	private JTextField tName,tLastName,tUserID;
	private JPasswordField tPassword;
	private JTextArea tAddress;
	private JComboBox dCity,dDay,dMonth,dYear;
	private JCheckBox cMovie,cMusic,cComputer;
	private JRadioButton rMale,rFemale;
	private JButton bRegister,bShow, bSearch, bUpdate;
	
	private String sysDate,sysTime;
	
	//private ArrayList<RegistrationData> alist = new ArrayList<RegistrationData>();
		
	public UserRegistrationGUI1()
	{
		super("WELCOME TO THE GAME");
		
		/************PAGE CREATION*******************/
		Container c=getContentPane();
		c.setLayout(new GridLayout(13,2));
		/********************************************/
		
		
		/*************FONT STYLE CREATION**************/
		Font f=new Font("Chiller",Font.BOLD,27);
		Font f1=new Font("comic sans ms",Font.BOLD,14);
		/**********************************************/
		
		
		
		tName=new JTextField();
		tLastName = new JTextField();
		tUserID = new JTextField();
		tPassword=new JPasswordField();
		
		tAddress=new JTextArea(5,20);
		JScrollPane tapan=new JScrollPane(tAddress);
		
		String ctvalue[]={"Kolkata","Delhi","Mumbai","Chennai","Hydrabad","Pune","Bangalore"};
		dCity=new JComboBox(ctvalue);
		
		
		rMale=new JRadioButton("Male");
		//rMale.setSelected(true);
		
		rFemale=new JRadioButton("Female");
		ButtonGroup rgroup=new ButtonGroup();
		
		rgroup.add(rMale);
		rgroup.add(rFemale);
		JPanel gpanel=new JPanel();
		
		gpanel.add(rMale);
		gpanel.add(rFemale);
		
		String dvalue[]=new String[31];
		for(int i=0;i<=30;i++)
		{
			dvalue[i]=String.valueOf(i+1);
		}
		dDay=new JComboBox(dvalue);
		
		String mvalue[]=new String[12];
		for(int i=0;i<=11;i++)
		{
			mvalue[i]=String.valueOf(i+1);
		}
		dMonth=new JComboBox(mvalue);
		
		String yvalue[]=new String[31];
		int cnt=0;
		for(int i=1983;i<=2013;i++)
		{
			yvalue[cnt]=String.valueOf(i);
			cnt++;	
		}
		dYear=new JComboBox(yvalue);
		JPanel cpanel=new JPanel();
		cpanel.add(dDay);
		cpanel.add(dMonth);
		cpanel.add(dYear);
		
		cMovie=new JCheckBox("Movie");
		cMusic=new JCheckBox("Music");
		cComputer=new JCheckBox("Computer");
		JPanel ipanel=new JPanel();
		ipanel.add(cMovie);
		ipanel.add(cMusic);
		ipanel.add(cComputer);
		
		bRegister=new JButton("Register");
		bRegister.addActionListener(this);
		
		//bShow=new JButton("Show All");
		//bShow.addActionListener(this);
		
		//bSearch=new JButton("Search");
		
		
		bUpdate=new JButton("Update");
		bUpdate.addActionListener(this);
		
		
		/******LABEL CREATION (WITH DATE AND TIME)******/
		l1=new JLabel("REGISTRATION");
		l1.setFont(f);
		l1.setForeground(Color.BLUE);
		
		
		l2=new JLabel("Enter First Name");
		l2.setFont(f1);
		l2.setForeground(Color.RED);
		
		
		lLastName=new JLabel("Enter Last Name");
		lLastName.setFont(f1);
		lLastName.setForeground(Color.RED);
		
		
		lUserID=new JLabel("Enter User ID");
		lUserID.setFont(f1);
		lUserID.setForeground(Color.RED);
		
		
		l3=new JLabel("Enter Pasword");
		l3.setFont(f1);
		l3.setForeground(Color.RED);
		
		
		l4=new JLabel("Enter Address");
		l4.setFont(f1);
		l4.setForeground(Color.RED);
		
		
		l5=new JLabel("Select City");
		l5.setFont(f1);
		l5.setForeground(Color.RED);
		
		
		l6=new JLabel("Select Gender");
		l6.setFont(f1);
		l6.setForeground(Color.RED);
		
		
		l7=new JLabel("Select DOB");
		l7.setFont(f1);
		l7.setForeground(Color.RED);
		
		
		l8=new JLabel("Select Interests");
		l8.setFont(f1);
		l8.setForeground(Color.RED);
		
		
		l9=new JLabel("Current Date");
		l9.setFont(f1);
		l9.setForeground(Color.RED);
		
		
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
		
		l10=new JLabel("Current Time");
		l10.setFont(f1);
		l10.setForeground(Color.RED);
		/**********************************************/

		c.add(l1);c.add(new JLabel(""));
		c.add(l2);c.add(tName);
		c.add(lLastName);c.add(tLastName);
		c.add(lUserID);c.add(tUserID);
		c.add(l3);c.add(tPassword);
		c.add(l4);c.add(tapan);
		c.add(l5);c.add(dCity);
		c.add(l6);c.add(gpanel);
		c.add(l7);c.add(cpanel);
		c.add(l8);c.add(ipanel);
		c.add(l9);c.add(lDateValue);
		c.add(l10);c.add(lTimeValue);
		c.add(bRegister);c.add(bUpdate);
		//c.add(bSearch);c.add(bShow);
		
		setSize(500, 425);
		setLocation(600,200);
		setResizable(false);//for disabling maximize option
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		
	}

	public void actionPerformed(ActionEvent e) 
	{
		String name,lastName,userID,pass,add,ct,gn,dob,ins;//we will store temporarily in this data types then we pack then into object
		UserRegistrationData reg;//reference creation
		
		
		
		if(e.getSource() == bRegister)
		{
			/*JOptionPane.showMessageDialog(this, "REGISTER BUTTON");
			JOptionPane.showMessageDialog(this, "Register Date " + lDateValue.getText());
			JOptionPane.showMessageDialog(this, "Register time " + lTimeValue.getText());*/
			
			name =tName.getText().trim();//getText is used for taking input from text box and trim() for avoiding space
			lastName = tLastName.getText().trim();
			userID = tUserID.getText().trim();
			pass=tPassword.getText().trim();
			add=tAddress.getText().trim();
			ct=(String)dCity.getSelectedItem();//AS we have to converting object into string
			//input from drop down list
			
			gn="";
			if(rMale.isSelected())//input for radio button
			{
				gn="Male";
			}
			else if(rFemale.isSelected())
			{
				gn="Female";
			}
			
			String d=(String)dDay.getSelectedItem();
			String m=(String)dMonth.getSelectedItem();
			String y=(String)dYear.getSelectedItem();
			dob=d + "-" + m + "-" + y;
			
			ins="";
			if(cMovie.isSelected())
			{
				ins="Movie ";
			}
			if(cMusic.isSelected())
			{
				ins = ins + "Music ";
			}
			if(cComputer.isSelected())
			{
				ins = ins + "Computer";
			}
            
			reg = new UserRegistrationData();//object creation of RegistrationData to access the data
			//then pack the variables into a object using set function
			
			reg.setName(name);
			reg.setLastName(lastName);
			reg.setUserID(userID);
			reg.setPassword(pass);
			reg.setAddress(add);
			reg.setCity(ct);
			reg.setGender(gn);
			reg.setDob(dob);
			reg.setInterests(ins);
			reg.setDate(lDateValue.getText());//input from label
			reg.setTime(lTimeValue.getText());
			
			//alist.add(reg);
		 
			int con=JOptionPane.showConfirmDialog(this, "Are You Sure to Register?");//conform dialog box
			//it will return a variable
			
			if(con==JOptionPane.YES_OPTION)
			{
				//JOptionPane.showMessageDialog(this, "yes");
				new AddInformationIntoFile(reg);//calling the constructor for add information into the array list and passing the object
				JOptionPane.showMessageDialog(this, "Registration Successfull");
			}
			
			tName.setText("");
			tLastName.setText("");
			tUserID.setText("");
			tPassword.setText("");
			tAddress.setText("");
		}
		
		
		else if(e.getSource() == bUpdate)
		{
			JOptionPane.showMessageDialog(this, "Update Button");
		}
		/*if(e.getSource() == bShow)
		{
			JOptionPane.showMessageDialog(this, "Show All BUTTON");
			//new DiaplayAll();
		}*/
	}

	
}

public class UserRegistrationFrame1 
{
	public static void main(String[] args) 
	{
        new UserRegistrationGUI1();	

	}

}