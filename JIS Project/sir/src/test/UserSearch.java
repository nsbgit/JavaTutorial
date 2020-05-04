package test;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
public class UserSearch extends JFrame implements ActionListener {
	private JLabel l1,l2,l3;
	private JTextField t1;
	private JButton submit,back;
	private boolean flag = false;
	public UserSearch() {
		super("User Search");
		Container c=getContentPane();
		c.setLayout(new GridLayout(3,2));
		Font f1=new Font("Times New Roman",Font.BOLD,20);
		l1=new JLabel("CUSTOMER");
		l1.setFont(f1);
		l1.setForeground(Color.RED);
		JPanel fpanel=new JPanel();
		fpanel.add(l1);
		fpanel.setBackground(new Color(0,0,64));
		l2=new JLabel("SEARCH");
		l2.setFont(f1);
		l2.setForeground(Color.RED);
		JPanel apanel=new JPanel();
		apanel.add(l2);
		apanel.setBackground(new Color(0,0,64));
		l3=new JLabel("Give User A/C no");
		l3.setFont(f1);
		l3.setForeground(Color.RED);
		JPanel bpanel=new JPanel();
		bpanel.add(l3);
		bpanel.setBackground(new Color(0,0,64));
		t1=new JTextField();
		submit=new JButton("SUBMIT");
		submit.addActionListener(this);
		JPanel cpanel=new JPanel();
		cpanel.add(submit);
		cpanel.setBackground(new Color(0,0,64));
		back=new JButton("BACK");
		back.addActionListener(this);
		JPanel dpanel=new JPanel();
		dpanel.add(back);
		dpanel.setBackground(new Color(0,0,64));
		c.add(fpanel);c.add(apanel);
		c.add(bpanel);c.add(t1);
		c.add(cpanel);c.add(dpanel);
		setSize(550,300);
		setLocation(200,200);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == submit) {
			String n = t1.getText().trim();
			String namepattern = "^[0-9]{4}";
			Scanner   scan  =  new Scanner( n ) ;
			String   matched  =  scan.findInLine( namepattern ) ;
			if ( matched == null ) {
				JOptionPane.showMessageDialog(this, "INVALID USER ACCOUNT NUMBER\nIt should contain only digit with minimum of 4 digit.", "Error", JOptionPane.ERROR_MESSAGE);
				t1.setText("");
			}
			else
				flag  = true;
			if(flag == true) {
				String sname = t1.getText().trim();
				new UserSearchDisplay(sname);
				t1.setText("");
			}
			flag = false;
		}
		if(e.getSource()==back) {
			int con=JOptionPane.showConfirmDialog(this, "Are you sure to cancel?");
			if(con==JOptionPane.YES_OPTION) {
				new Admin();
				setVisible(false);
			}
		}
	}
}