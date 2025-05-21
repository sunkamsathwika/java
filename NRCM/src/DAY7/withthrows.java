package DAY7;
import java.io.*;
import java.util.Scanner;
import java.util.Scanner.*;//checked exception

public class withthrows {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File obj=new File("\"C:\\Users\\sunkam sathwika\\OneDrive\\Desktop\\dll.py\"");
		Scanner Reader = new Scanner(obj);
		while(Reader.hasNextLine()) {
			String data=Reader.nextLine();
			System.out.println(data);
			throw new FileNotFoundException("file not found");
			 
		}
		Reader.close();
		

	}

}
