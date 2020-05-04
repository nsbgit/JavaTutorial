
import java.awt.BorderLayout;
import java.awt.Container;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;




/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sukanta
 */
public class OperatorDisplay extends JFrame implements Serializable {
    public OperatorDisplay() {
        super("DISPLAY ALL OPERATOR INFORMATION");
        String heading[] = {"First Name", "Last Name", "User ID", "Password", "Registration Date", "Registration Time"};
        String data[][];
        ArrayList<OperatorRegistrationData> alist;
        
        try {
        	JOptionPane.showMessageDialog(this, "1");
        	FileInputStream fin=new FileInputStream("OperatorRegistrationDataFile.dat");
        	JOptionPane.showMessageDialog(this, "2");
            ObjectInputStream oin=new ObjectInputStream(fin);
            JOptionPane.showMessageDialog(this, "3");
            alist=(ArrayList<OperatorRegistrationData>)oin.readObject();
            JOptionPane.showMessageDialog(this, "4");
            
            data = new String[alist.size()][heading.length+1];
            
            int r = 0;
            for(OperatorRegistrationData re : alist) {
                data[r][0] = re.getFirstName();
                data[r][1] = re.getLastName();
                data[r][2] = re.getUserID();
                data[r][3] = re.getPassword();
                data[r][4] = re.getDate();
                data[r][5] = re.getTime();
                
                r++;
            }
            
            Container con = getContentPane();
            con.setLayout(new BorderLayout()); // refer copy
            
            JTable dataTable = new JTable(data, heading); //datatable is the obj of the JTABLE,data is the array
            JScrollPane jsp = new JScrollPane(dataTable);
            
            con.add(new JLabel("ALL REGISTRATION DETAILS"));
            con.add(jsp, BorderLayout.CENTER);
            
            setSize(200, 200);
            
            setLocation(200, 200);
            setVisible(true);
        } catch(Exception ex) {
            ex.printStackTrace();
            System.out.println(ex.toString());
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }
}
