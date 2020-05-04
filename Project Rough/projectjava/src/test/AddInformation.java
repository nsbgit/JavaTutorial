package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AddInformation 
{
   ArrayList<RegistrationData> list4;
	
	public AddInformation(RegistrationData rg1)//rg1 comes from reg in Registration.
	{
		try
		{//next three lines responsible for reading object from file and store in the array list.
		   FileInputStream fin=new FileInputStream("Regi.dat");//open file in the read mode
		   ObjectInputStream oin=new ObjectInputStream(fin);//read the data in object format.
		   list4=(ArrayList<RegistrationData>)oin.readObject();//read all the object from the file and store it in the array list.
		}catch(Exception e)
		 {
			 list4=new ArrayList<RegistrationData>();//for the first time there is no existance of regi.dat,so an exception will be created and come to catch
		 }//contd...we create a new array list otherwise prg will terminate as the 3rd line will not execute and we cant store the obj in the array list.
		
		 list4.add(rg1);//new object is written into the array list.
		 
		 try	
		 {//next three lines are responsible for writing the object of the array list back into the file 
		       FileOutputStream fout=new FileOutputStream("Regi.dat");//writing the data into regi.dat by fileoutputstream
		       ObjectOutputStream oout=new ObjectOutputStream(fout);//writing the data in obj format into the file.
		       oout.writeObject(list4);//writing the array list data into the file
		}catch(Exception e){}
	
	}
}