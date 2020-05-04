package l2013_08_30;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BffrdRdr {
	private static String str;
	private static BufferedReader br;

	public static void main(String[] args) {
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			str = br.readLine();// Read the file line wise
			while(str != null) {
				System.out.println(str);
				str = br.readLine(); // Read up to last line
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e + "\nFile not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e + "\nCan not read");
		}
	}

}
