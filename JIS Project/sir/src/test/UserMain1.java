package test;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
class ThirdWindow extends JFrame implements ActionListener {
	private JLabel l0,l1,l2,l3;
	private JTextField t1;
	private JPasswordField p1;
	private JButton login,back;
	private boolean flagID = false;
	private boolean flagPass = false;
	private ArrayList<OperatorRegData> alistTemp;
	private boolean flag = false;
	public ThirdWindow() {
		super("Log in as operator");
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
		l2=new JLabel("USERNAME");
		l2.setFont(f2);
		l2.setForeground(Color.RED);
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
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==login) {
			String n = t1.getText().trim();
			String ps = p1.getText().trim();
			String namepattern = "^[A-Za-z]";
			Scanner   scan  =  new Scanner( n ) ;
			String   matched  =  scan.findInLine( namepattern ) ;
			if ( matched == null ) {
				JOptionPane.showMessageDialog(this, "INVALID USER NAME\nIt should contain only alphabet.", "Error", JOptionPane.ERROR_MESSAGE);
				t1.setText("");
			}
			else
				flagID = true;
			String passwordpattern = "^[0-9]{4}" ; 
			Scanner   scan2  =  new Scanner( ps ) ;
			String   matched2  =  scan2.findInLine( passwordpattern ) ;
			if ( matched2 == null ) {
				JOptionPane.showMessageDialog(this, "INVALID PASSWORD\nIt should contain only digits with minimum password length of 4 digit.", "Error", JOptionPane.ERROR_MESSAGE);
				p1.setText("");
			}
			else
				flagPass = true;
			if(flagID == true ) {
				if(flagPass == true) {
					String enteredID = t1.getText().trim();
					String enteredPassword = p1.getText().trim();
					try {
						FileInputStream fin = new FileInputStream("Reg.dat");
						ObjectInputStream oin = new ObjectInputStream(fin);
						alistTemp = (ArrayList<OperatorRegData>)oin.readObject();
					}catch(Exception ex) {
						JOptionPane.showMessageDialog(this, "No file found in database.", "Error", JOptionPane.ERROR_MESSAGE);
					}
					for(OperatorRegData element : alistTemp) {
						if(element.getName().equals(enteredID)) {
							if(element.getPassword().equals(enteredPassword))
								flag  = true;
						}
					}
					if(flag == true) {
						JOptionPane.showMessageDialog(this, "Successfully logged in");
						new Userwindow(t1.getText());
						setVisible(false);
					}
					else {
						JOptionPane.showMessageDialog(this, "Incorrect UserID or Password\nTry again.", "Error", JOptionPane.ERROR_MESSAGE);
						t1.setText("");
						p1.setText("");
					}
				}
			}
			flagID = false;
			flagPass = false;
		}
		if(e.getSource()==back) {
			int con=JOptionPane.showConfirmDialog(this, "Are You Sure to go back?");
			if(con==JOptionPane.YES_OPTION) {
				new FirstWindow("");
				setVisible(false);	
			}
		}
	}	
}
public class UserMain1 {
	public static void main(String[] args) {}
}