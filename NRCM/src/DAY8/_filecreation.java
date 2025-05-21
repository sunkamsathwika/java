package DAY8;
import java.io.*;

public class _filecreation {
	public static void main(String args[]) throws IOException {
		File f1=new File("C:\\Users\\sunkam sathwika\\OneDrive\\Desktop\\sem.txt");
				if(f1.createNewFile()) {
					System.out.println("file is created");
				}
				else {
					System.out.println("not created");
				}
				
		
	}
}
