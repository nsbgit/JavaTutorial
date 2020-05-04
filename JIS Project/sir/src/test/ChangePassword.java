package test;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
public class ChangePassword extends JFrame implements ActionListener {
	private JLabel lHeading,lFirstName,lCurrentPassword,lNewPassword;
	private JTextField tFirstName;
	private JPasswordField pCurrentPassword,pNewPassword;
	private JButton bBack,bChange;
	ArrayList<OperatorRegData> list;
	private boolean flagFirstName = false;
	private boolean flagNewPassword = false;
	private boolean flagCurrentPassword = false;
	private boolean flagFirstNameMatch = false;
	private boolean flagCurrentPasswordMatch = false;
	private JLabel lHeading2;
	public ChangePassword() {
		super("Change Password");
		Container c=getContentPane();
		c.setLayout(new GridLayout(5,2));
		Font f1=new Font("Chiller",Font.BOLD,22);
		Font f2=new Font("Times New Roman",Font.BOLD,20);
		lHeading=new JLabel("CHANGE PASSWORD");
		lHeading.setFont(f1);
		lHeading.setForeground(Color.RED);
		JPanel apanel=new JPanel();
		apanel.add(lHeading);
		apanel.setBackground(new Color(0,0,64));
		lHeading2=new JLabel("");
		lHeading2.setFont(f1);
		lHeading2.setForeground(Color.RED);
		JPanel abpanel=new JPanel();
		abpanel.add(lHeading2);
		abpanel.setBackground(new Color(0,0,64));
		lFirstName=new JLabel("Enter First Name");
		lFirstName.setFont(f2);
		lFirstName.setForeground(Color.GRAY);
		JPanel bpanel=new JPanel();
		bpanel.add(lFirstName);
		bpanel.setBackground(new Color(0,0,64));
		lCurrentPassword=new JLabel("Enter Current Password");
		lCurrentPassword.setFont(f2);
		lCurrentPassword.setForeground(Color.GRAY);
		JPanel cpanel=new JPanel();
		cpanel.add(lCurrentPassword);
		cpanel.setBackground(new Color(0,0,64));
		lNewPassword=new JLabel("Enter New Password");
		lNewPassword.setFont(f2);
		lNewPassword.setForeground(Color.GRAY);
		JPanel dpanel=new JPanel();
		dpanel.add(lNewPassword);
		dpanel.setBackground(new Color(0,0,64));
		tFirstName=new JTextField();
		pCurrentPassword=new JPasswordField();
		pNewPassword=new JPasswordField();
		bChange=new JButton("Change");
		bChange.addActionListener(this);
		JPanel epanel=new JPanel();
		epanel.add(bChange);
		epanel.setBackground(new Color(0,0,64));
		bBack=new JButton("Back");
		bBack.addActionListener(this);
		JPanel fpanel=new JPanel();
		fpanel.add(bBack);
		fpanel.setBackground(new Color(0,0,64));
		c.add(apanel);c.add(abpanel);
		c.add(bpanel);c.add(tFirstName);
		c.add(cpanel);c.add(pCurrentPassword);
		c.add(dpanel);c.add(pNewPassword);
		c.add(epanel);c.add(fpanel);
		setSize(500,500);
		setLocation(100,100);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bChange) {
			String vFirstName = tFirstName.getText();
			String vCurrentPassword = pCurrentPassword.getText();
			String vNewPassword = pNewPassword.getText();
			String firstNamepattern = "^[a-zA-Z]" ; 
			Scanner   scan1  =  new Scanner( vFirstName ) ;
			String   matched1  =  scan1.findInLine( firstNamepattern ) ;
			if ( matched1 == null ) {
				JOptionPane.showMessageDialog(this, "INVALID FIRST NAME\nIt should contain only alphabets.", "Error", JOptionPane.ERROR_MESSAGE);
				tFirstName.setText("");
			}
			else
				flagFirstName   = true;
			String currentPasswordpattern = "^[0-9]{4}"; 
			Scanner   scan2  =  new Scanner( vCurrentPassword );
			String   matched2  =  scan2.findInLine( currentPasswordpattern );
			if ( matched2 == null ) {
				JOptionPane.showMessageDialog(this, "INVALID ACCOUNT NUMBER\nIt should contain only digits with minimum length of 4 digit.", "Error", JOptionPane.ERROR_MESSAGE);
				pCurrentPassword.setText("");
			}
			else
				flagCurrentPassword  = true;
			String newPasswordpattern = "^[0-9]{4]" ; 
			Scanner   scan3  =  new Scanner( vNewPassword) ;
			String   matched3  =  scan3.findInLine( currentPasswordpattern ) ;
			if ( matched3 == null ) {
				JOptionPane.showMessageDialog(this, "INVALID NEW PASSWORD\nIt should contain only digits with minimum length of 4 digit.", "Error", JOptionPane.ERROR_MESSAGE);
				pNewPassword.setText("");
			}
			else
				flagNewPassword   = true;
			if(flagFirstName == true) {
				if(flagCurrentPassword == true) {
					if(flagNewPassword == true) {
						try {
						   FileInputStream fin=new FileInputStream("Reg.dat");
						   ObjectInputStream oin=new ObjectInputStream(fin);
						   list=(ArrayList<OperatorRegData>)oin.readObject();
						}catch(Exception e1) {
							JOptionPane.showMessageDialog(this, "No file found in database", "Error", JOptionPane.ERROR_MESSAGE);
							list=new ArrayList<OperatorRegData>();
						}
						for(int i=0;i<list.size();i++) {
							if(list.get(i).getName().equals(tFirstName.getText())) {
								flagFirstNameMatch = true;
								if(list.get(i).getPassword().equals(pCurrentPassword.getText())) {
									flagCurrentPasswordMatch = true;
									list.get(i).setPassword(pNewPassword.getText());
								}
							}
						}
						try {
						   FileOutputStream fout=new FileOutputStream("Reg.dat");
						   ObjectOutputStream oout=new ObjectOutputStream(fout);
						   oout.writeObject(list);
						}catch(Exception e1){}
						if((flagFirstNameMatch == true) && (flagCurrentPasswordMatch == true)) {
							JOptionPane.showMessageDialog(this, "Password has been successfully changed");
							tFirstName.setText("");
							pCurrentPassword.setText("");
							pNewPassword.setText("");
						}
						if((flagFirstNameMatch == true) && (flagCurrentPasswordMatch == false)) {
							JOptionPane.showMessageDialog(this, "Password incorrect", "Error", JOptionPane.ERROR_MESSAGE);
							pCurrentPassword.setText("");
						}
						if((flagFirstNameMatch == false) && (flagCurrentPasswordMatch == false)) {
							JOptionPane.showMessageDialog(this, "Operator does not exist.", "Error", JOptionPane.ERROR_MESSAGE);
							tFirstName.setText("");
							pCurrentPassword.setText("");
							pNewPassword.setText("");
						}						
					}
				}
			}
			flagFirstName = false;
			flagCurrentPassword = false;
			flagNewPassword = false;
			flagFirstNameMatch = false;
			flagCurrentPasswordMatch = false;
		}
		if(e.getSource()==bBack) {
			int rply = JOptionPane.showConfirmDialog(this, "Are you sure to quit?");
			if(rply == JOptionPane.YES_OPTION) {
				new Userwindow("");
				setVisible(false);
			}
		}
	}
}