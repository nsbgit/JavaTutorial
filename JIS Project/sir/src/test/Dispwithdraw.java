package test;
import javax.swing.*;
import java.awt.*;
public class Dispwithdraw extends JFrame {
	String heading[]={"First Name","Last name","Address","Nationality","Account Type","Date Of Birth","Identity","Profession","Reg Date","Reg Time","A/c no","Initial amnt"};
	public Dispwithdraw(String b[][]) {
		Container con=getContentPane();
		con.setLayout(new BorderLayout());
		JTable datatable=new JTable(b, heading);
		JScrollPane jsp=new JScrollPane(datatable);
		con.add(new JLabel("Registration Details"),BorderLayout.NORTH);
		con.add(jsp,BorderLayout.CENTER);
		setSize(650, 650);
		setLocation(600, 200);
		setVisible(true);
	}
}