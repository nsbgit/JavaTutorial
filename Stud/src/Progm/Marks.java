package Progm;
import java.io.*;
public class Marks {
	private int sub1;
	private int sub2;
	private int sub3;
	private float result;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
   
    void input()throws Exception
    {System.out.println("Enter marks in Subject1");
     sub1=Integer.parseInt(br.readLine());
     System.out.println("Enter marks in Subject2");
     sub2=Integer.parseInt(br.readLine());
     System.out.println("Enter marks in 3rd subject");
     sub3=Integer.parseInt(br.readLine());
     }
        void calculation()
        {
        	result=((sub1+sub2+sub3)/3);
        }
	      void display()
	      {
	    	  System.out.println("result="+result);
	      }
        public static void main(String[] args)throws Exception
        {
        	Marks m1=new Marks();
        	m1.input();
        	m1.calculation();
        	m1.display();
        }
        
        
		
	}


