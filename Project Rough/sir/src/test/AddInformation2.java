package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AddInformation2
{
   ArrayList<Create> list4;
	
	public AddInformation2(Create rg2)
	{
		try
		{
		   FileInputStream fin=new FileInputStream("Regi2.dat");
		   ObjectInputStream oin=new ObjectInputStream(fin);
		   list4=(ArrayList<Create>)oin.readObject();
		}catch(Exception e)
		 {
			 list4=new ArrayList<Create>();
		 }
		
		 list4.add(rg2);
		 
		 try	
		 {
		       FileOutputStream fout=new FileOutputStream("Regi2.dat");
		       ObjectOutputStream oout=new ObjectOutputStream(fout);
		       oout.writeObject(list4);
		}catch(Exception e){}
	
	}
}
