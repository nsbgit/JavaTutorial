/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package first;

import com.sun.servicetag.RegistrationData;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Sukanta
 */
public class AddInformationOperator
{
    ArrayList<OperatorRegistrationData> listOperator;
	
	public AddInformationOperator(OperatorRegistrationData rg1)
	{
		try
		{
		   FileInputStream fin=new FileInputStream("OperatorFile.dat");//reading mode//first time exception
		   ObjectInputStream oin=new ObjectInputStream(fin);//read in object form
		   listOperator=(ArrayList<OperatorRegistrationData>)oin.readObject();//read all the object  from the file nad store in array list
		}catch(Exception e)
		 {
			 listOperator=new ArrayList<OperatorRegistrationData>();
		 }
		
		 listOperator.add(rg1);
		 
		 try	
		 {
		       FileOutputStream fout=new FileOutputStream("OperatorFile.dat");//seaarch--> not present blank file-->if exit del prevoius data
		       ObjectOutputStream oout=new ObjectOutputStream(fout);//writingt the data in obj format
		       oout.writeObject(listOperator);
		}catch(Exception e){}
	
	}
    
}
