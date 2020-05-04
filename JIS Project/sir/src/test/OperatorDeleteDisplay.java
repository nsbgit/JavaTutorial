package test;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;
public class OperatorDeleteDisplay extends JFrame {
	ArrayList<OperatorRegData> list1;
	public OperatorDeleteDisplay(String name) {
		try {
			FileInputStream fin=new FileInputStream("Reg.dat");
			ObjectInputStream oin=new ObjectInputStream(fin);
			list1=(ArrayList<OperatorRegData>)oin.readObject();
			int r=0;
			for(int i=0;i<list1.size();) {
				if(list1.get(i).getName().equals(name)) {
					list1.remove(i);
					r++;
				}
				else
					i++;
			}
			if(r==0)
				JOptionPane.showMessageDialog(this, "Match not Found");
			else {
				try	 {
					FileOutputStream fout=new FileOutputStream("Reg.dat");
					ObjectOutputStream oout=new ObjectOutputStream(fout);
					oout.writeObject(list1);
				}catch(Exception e){}
				JOptionPane.showMessageDialog(this, "Successfully deleted");
			}
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(this, "No file found in data base", "Error", JOptionPane.ERROR_MESSAGE);
		}	
	}
}

