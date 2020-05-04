/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;
import java.awt.Container;
import java.io.*;
import java.util.*;

/**
 *
 * @author Sukanta
 */
class ShowAll extends JFrame {

    public ShowAll() {
        this.setTitle("Show all results");
        String heading[] = {"Name", "Password", "Address", "City", "Gender","Date Of Birth","Interests","Reg Date","Reg Time"};
        String data[][];
        ArrayList<RegistrationData> alist = new ArrayList<RegistrationData>();
        
        try {
            FileInputStream fin=new FileInputStream("RegistrationDataFile.dat");
            ObjectInputStream oin=new ObjectInputStream(fin);
            alist=(ArrayList<RegistrationData>)oin.readObject();
            
            data = new String[alist.size()][heading.length+1];
            
            int r = 0;
            
            for(RegistrationData re : alist)//re -> registration data class
            {
                /*
                 * 1. first extract the object from array list and stores in re
                 * 
                 * */
            	data[r][0]=re.getName();
            	data[r][1]=re.getPassword();
            	data[r][2]=re.getAddress();
            	data[r][3]=re.getCity();
            	data[r][4]=re.getGender();
            	data[r][5]=re.getDob();
            	data[r][6]=re.getInterests();
            	data[r][7]=re.getCurrentDateValue();
            	data[r][8]=re.getCurrentTimeValue();
            	r++;
            }
            
            Container con=getContentPane();
            con.setLayout(new BorderLayout());//boarder layout
			
            JTable datatable=new JTable(data, heading);//table by this argument
            JScrollPane jsp=new JScrollPane(datatable);//for scroll
			
            con.add(new JLabel("All Registration Details"),BorderLayout.NORTH);//upper position
            con.add(jsp,BorderLayout.CENTER);
	
            setSize(650, 300);
            setLocation(200, 200);
            //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
            
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(this, "List is empty");
            //e.printStackTrace();
        }
        
    }
    
    
}
