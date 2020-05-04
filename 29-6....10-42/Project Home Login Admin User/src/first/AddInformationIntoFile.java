package first;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AddInformationIntoFile
{
   ArrayList<UserRegistrationData> alistInfoAdd;
	
	public AddInformationIntoFile(UserRegistrationData rg1)
	{
		try
		{
		   FileInputStream fin=new FileInputStream("Regi.dat");//reading mode//first time exception
		   ObjectInputStream oin=new ObjectInputStream(fin);//read in object form
		   alistInfoAdd=(ArrayList<UserRegistrationData>)oin.readObject();//read all the object  from the file and store in array list
		}catch(Exception e)
		 {
			 alistInfoAdd=new ArrayList<UserRegistrationData>();
		 }
		
		 alistInfoAdd.add(rg1);
		 
		 try	
		 {
		       FileOutputStream fout=new FileOutputStream("Regi.dat");//seaarch--> not present blank file-->if exit del prevoius data
		       ObjectOutputStream oout=new ObjectOutputStream(fout);//writingt the data in obj format
		       oout.writeObject(alistInfoAdd);
		}catch(Exception e){}
	
	}
}