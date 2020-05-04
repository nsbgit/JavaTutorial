/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Sukanta
 */
class AddInformation {
    ArrayList<RegistrationData> alist;

    public AddInformation(RegistrationData re) {
        try {
            FileInputStream fin = new FileInputStream("RegistrationDataFile.dat");
            ObjectInputStream oin = new ObjectInputStream(fin);
            alist = (ArrayList<RegistrationData>)oin.readObject();
        } catch(Exception ex) {
            alist = new ArrayList<RegistrationData>();
        }
        
        alist.add(re);
        
        try {
            FileOutputStream fout = new FileOutputStream("RegistrationDataFile.dat");
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(alist);
        } catch(Exception ex) {
            
        }
    }
    
}
