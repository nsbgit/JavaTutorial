package test;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
public class OperatorDisplay extends JFrame {
	public OperatorDisplay() {
		super("DISPLAY All OPERATORS INFORMATION");
		String heading[]={"First Name","Last name","Password","Address","City","Gender","Date Of Birth","Reg Date","Reg Time"};
		String data[][];
		ArrayList<OperatorRegData> list;
		try {
			FileInputStream fin=new FileInputStream("Reg.dat");
			ObjectInputStream oin=new ObjectInputStream(fin);
			list=(ArrayList<OperatorRegData>)oin.readObject();
			data = new String[list.size()][heading.length+1];
			int r=0;
			for(OperatorRegData re : list) {
				data[r][0]=re.getName();
				data[r][1]=re.getName1();
				data[r][2]=re.getPassword();
				data[r][3]=re.getAddress();
				data[r][4]=re.getCity();
				data[r][5]=re.getGender();
				data[r][6]=re.getDob();
				data[r][7]=re.getDate();
				data[r][8]=re.getTime();
				r++;
			}
			Container con=getContentPane();
			con.setLayout(new BorderLayout());
			JTable datatable=new JTable(data, heading);
			JScrollPane jsp=new JScrollPane(datatable);
			con.add(new JLabel("All Registration Details"),BorderLayout.NORTH);
			con.add(jsp,BorderLayout.CENTER);
			setSize(650, 300);
			setLocation(200, 200);
			setVisible(true);
		}catch(Exception e) {
			JOptionPane.showMessageDialog(this, "No file found in data base", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
}