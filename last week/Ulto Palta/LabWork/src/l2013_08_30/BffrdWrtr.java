package l2013_08_30;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BffrdWrtr {
	public static void main(String[] args) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
			bw.write("Sukanta");
			bw.newLine();
			bw.write("cse");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e + "\nError");
		}
	}

}
