package test;
import java.awt.event.*;
import java.awt.Color;
import java.io.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
public class Withdraw extends JFrame implements ActionListener {
	private JLabel l1,l2,l3,l4;
	private JTextField t1,t2;
	private JButton withdraw,cancel,deposit;
	private int x,amnt,t,w,account,d,r=0;
	ArrayList<Create> list1;
	private boolean flagWithdraw = false;
	private boolean flagAccNum = false;
	private boolean flagYes = false;
	private boolean flagAccMatch = false;
	private boolean flagNo = false;
	public Withdraw() {
		super("DEPOSIT/WITHDRAWAL SLIP");
		Container c=getContentPane();
		c.setLayout(new GridLayout(4,2));
		Font f1=new Font("Times New Roman",Font.BOLD,20);
		l1=new JLabel("Enter ACCOUNT NO:");
		l1.setFont(f1);
		l1.setForeground(Color.GRAY);
		JPanel bpanel=new JPanel();
		bpanel.add(l1);
		bpanel.setBackground(new Color(0,0,64));
		l2=new JLabel("ENTER AMOUNT:");
		l2.setFont(f1);
		l2.setForeground(Color.GRAY);
		JPanel b1panel=new JPanel();
		b1panel.add(l2);
		b1panel.setBackground(new Color(0,0,64));
		l3=new JLabel("DEPOSIT:");
		l3.setFont(f1);
		l3.setForeground(Color.GRAY);
		JPanel b2panel=new JPanel();
		b2panel.add(l3);
		b2panel.setBackground(new Color(0,0,64));
		t1=new JTextField();
		t2=new JTextField();
		withdraw=new JButton("WITHDRAW");
		withdraw.addActionListener(this);
		JPanel dpanel=new JPanel();
		dpanel.add(withdraw);
		dpanel.setBackground(new Color(0,0,64));
		deposit=new JButton("DEPOSIT");
		deposit.addActionListener(this);
		JPanel d1panel=new JPanel();
		d1panel.add(deposit);
		d1panel.setBackground(new Color(0,0,64));
		cancel=new JButton("CANCEL");
		cancel.addActionListener(this);
		JPanel epanel=new JPanel();
		epanel.add(cancel);
		epanel.setBackground(new Color(0,0,64));
		l4=new JLabel("");
		l4.setFont(f1);
		l4.setForeground(Color.GRAY);
		JPanel b3panel=new JPanel();
		b3panel.add(l4);
		b3panel.setBackground(new Color(0,0,64));
		c.add(bpanel);c.add(t1);
		c.add(b1panel);c.add(t2);
		c.add(dpanel);c.add(d1panel);
		c.add(epanel);c.add(b3panel);
		setSize(500,500);
		setLocation(100,100);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		String search=t1.getText();//search  ------->account number
		if(e.getSource()==withdraw) {
			String vaccNum = t1.getText();
			String vwithdrw = t2.getText();
			String accNumpattern = "^[0-9]{4}" ; 
			Scanner   scan1  =  new Scanner( vaccNum ) ;
			String   matched1  =  scan1.findInLine( accNumpattern ) ;
			if ( matched1 == null ) {
				JOptionPane.showMessageDialog(this, "INVALID ACCOUNT NUMBER\nIt should contain only digits with minimum length of 4 digit.", "Error", JOptionPane.ERROR_MESSAGE);
				t1.setText("");
			}
			else
				flagAccNum   = true;
			String withdrawpattern = "^[0-9]{3}" ; 
			Scanner   scan  =  new Scanner( vwithdrw ) ;
			String   matched  =  scan.findInLine( withdrawpattern ) ;
			if ( matched == null ) {
				JOptionPane.showMessageDialog(this, "INVALID WITHDRAW AMOUNT\nIt should contain only digits with minimum withdraw amount of INR 100.", "Error", JOptionPane.ERROR_MESSAGE);
				t2.setText("");
			}
			else
				flagWithdraw    = true;
			if(flagAccNum == true) {
				if(flagWithdraw == true) {
					try {
						FileInputStream fin=new FileInputStream("Regis.dat");
						ObjectInputStream oin=new ObjectInputStream(fin);
						list1=(ArrayList<Create>)oin.readObject();
						for(Create re : list1) {
							if(re.getAc().equals(search)) {
								flagAccMatch  = true;
								w=Integer.parseInt(t2.getText());
								amnt=Integer.parseInt(re.getInitialamnt());
								if(amnt>=500) {
									flagNo  = true;
									t = amnt - w;
									if(t >= 500) {
										account=Integer.parseInt(t1.getText());
										d=0;
										flagYes = true;
									}
								}
							}
						}
						if((flagAccMatch == true) && (flagNo == true) && (flagYes == true)) {
							new Actotalcreate(account,w,d,t);
							new TotalUpdate(account,t);
							JOptionPane.showMessageDialog(this, "Withdraw done successfully");
							new Passdisp(t1.getText());
							t1.setText("");
							t2.setText("");
						}
						if((flagAccMatch == true) && (flagNo == true) && (flagYes == false)) {
							JOptionPane.showMessageDialog(this, "Insufficient balance.\nAccount balance must be 500 after withdraw.", "Error", JOptionPane.ERROR_MESSAGE);
							t1.setText("");
							t2.setText("");
						}
						if((flagAccMatch == true) && (flagNo == false) && (flagYes == false)) {
							JOptionPane.showMessageDialog(this, "Account number has not the minimum balance of INR 500.", "Error", JOptionPane.ERROR_MESSAGE);
							t1.setText("");
							t2.setText("");
						}
						if((flagAccMatch == false) && (flagNo == false) && (flagYes == false)) {
							JOptionPane.showMessageDialog(this, "Account number does not exists", "Error", JOptionPane.ERROR_MESSAGE);
							t1.setText("");
							t2.setText("");
						}
						flagYes = false;
						flagAccMatch = false;
						flagNo = false;
					}
					catch(Exception e1) {
						JOptionPane.showMessageDialog(this, "No file found in data base", "Error", JOptionPane.ERROR_MESSAGE);
						t1.setText("");
						t2.setText("");
					}
				}
			}
			flagAccNum =false;
			flagWithdraw = false;
		}
		if(e.getSource()==cancel) {
			int rply = JOptionPane.showConfirmDialog(this, "Are you sure to quit?");
			if(rply == JOptionPane.YES_OPTION) {
				new Userwindow("");
				setVisible(false);
			}
		}
		if(e.getSource()==deposit) {
			String vaccNum = t1.getText();
			String vwithdrw = t2.getText();
			String accNumpattern = "^[0-9]{4}" ; 
			Scanner   scan1  =  new Scanner( vaccNum ) ;
			String   matched1  =  scan1.findInLine( accNumpattern ) ;
			if ( matched1 == null ) {
				JOptionPane.showMessageDialog(this, "INVALID ACCOUNT NUMBER\nIt should contain only digits with minimum length of 4 digit.", "Error", JOptionPane.ERROR_MESSAGE);
				t1.setText("");
			}
			else
				flagAccNum   = true;
			String withdrawpattern = "^[0-9]{3}" ; 
			Scanner   scan  =  new Scanner( vwithdrw ) ;
			String   matched  =  scan.findInLine( withdrawpattern ) ;
			if ( matched == null ) {
				JOptionPane.showMessageDialog(this, "INVALID WITHDRAW AMOUNT\nIt should contain only digits with minimum withdraw amount of INR 100.", "Error", JOptionPane.ERROR_MESSAGE);
				t2.setText("");
			}
			else
				flagWithdraw    = true;
			if(flagAccNum == true) {
				if(flagWithdraw == true) {
					try {
						FileInputStream fin=new FileInputStream("Regis.dat");
						ObjectInputStream oin=new ObjectInputStream(fin);
						list1=(ArrayList<Create>)oin.readObject();
						for(Create re : list1) {
							if(re.getAc().equals(search)) {
								flagAccMatch = true;
								amnt=Integer.parseInt(re.getInitialamnt());
								w=Integer.parseInt(t2.getText());
								t=(amnt+w);
								account=Integer.parseInt(t1.getText());
								d=0;
								r++;					
							}
						}
						if((flagAccNum == true) && (flagWithdraw== true) && (flagAccMatch == true)) {
								new Actotalcreate(account,d,w,t);
								new TotalUpdate(account,t);
								JOptionPane.showMessageDialog(this, "Deposite done successfully");
								new Passdisp(t1.getText());
								t1.setText("");
								t2.setText("");
						}
						if(flagAccMatch == false) {
							JOptionPane.showMessageDialog(this, "Account number does not exists");
							t1.setText("");
							t2.setText("");
						}
						flagAccMatch = false;
					}catch(Exception e1) {
						JOptionPane.showMessageDialog(this, "No file found in data base", "Error", JOptionPane.ERROR_MESSAGE);
						t1.setText("");
						t2.setText("");
					}
				}
			}
			flagAccNum =false;
			flagWithdraw = false;
		}
	}
}