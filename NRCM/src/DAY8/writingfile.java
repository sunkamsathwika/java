package DAY8;
import java.io.*;

public class writingfile{
	public static void main(String args[]) throws IOException {
		FileWriter f1=new FileWriter("C:\\Users\\sunkam sathwika\\OneDrive\\Desktop\\sem1.txt");
		f1.write("hi good morning");
		f1.close();
		System.out.println("success");
				}
				
		
	}

