package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AddInformation3
{
   ArrayList<Create> list4;
	
	public AddInformation3(Create rg3)
	{
		try
		{
		   FileInputStream fin=new FileInputStream("Regi3.dat");
		   ObjectInputStream oin=new ObjectInputStream(fin);
		   list4=(ArrayList<Create>)oin.readObject();
		}catch(Exception e)
		 {
			 list4=new ArrayList<Create>();
		 }
		
		 list4.add(rg3);
		 
		 try	
		 {
		       FileOutputStream fout=new FileOutputStream("Regi3.dat");
		       ObjectOutputStream oout=new ObjectOutputStream(fout);
		       oout.writeObject(list4);
		}catch(Exception e){}
	
	}
}
