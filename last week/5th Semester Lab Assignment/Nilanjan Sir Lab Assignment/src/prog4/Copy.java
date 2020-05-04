package prog4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Copy {
	public static void main(String[] args) {
		String ip;
		String op;
		String str;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of source text file :");
		ip = sc.next();
		
		System.out.println("Enter the name of destination text file :");
		op = sc.next();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(ip));
			BufferedWriter bw = new BufferedWriter(new FileWriter(op));
			
			str = br.readLine();
			
			while(str != null) {
				bw.write(str);
				bw.newLine();
				str = br.readLine();
			}
			br.close();
			bw.close();
			
			System.out.println();
			System.out.println("File has been successfully copied.");
			
		} catch (FileNotFoundException e) {
			System.out.println("!!!!!Source file not found!!!!!");
		} catch (IOException e) {
			System.out.println("!!!!!Error occured!!!!!");
		}
	}
}
