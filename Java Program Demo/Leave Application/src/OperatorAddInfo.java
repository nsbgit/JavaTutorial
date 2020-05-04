
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sukanta
 */
public class OperatorAddInfo {
    ArrayList<OperatorRegistrationData> alistOperatorData;
    
    public OperatorAddInfo(OperatorRegistrationData re) {
        try {
            FileInputStream fin = new FileInputStream("OperatorRegistrationDataFile.dat");
            ObjectInputStream oin = new ObjectInputStream(fin);
            alistOperatorData = (ArrayList<OperatorRegistrationData>)oin.readObject();
        } catch(Exception ex) {
            alistOperatorData = new ArrayList<OperatorRegistrationData>();
        }
        
        alistOperatorData.add(re);
        
        try {
            FileOutputStream fout = new FileOutputStream("OperatorRegistrationDataFile.dat");
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(alistOperatorData);
        } catch (Exception ex) {
            
        }
    }
}
