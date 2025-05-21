package DAY8;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			File Obj=new File("C:\\Users\\sunkam sathwika\\OneDrive\\Desktop\\sem.txt");
			Scanner R=new Scanner(Obj);
			while(R.hasNextLine()) {
				String data=R.nextLine();
				System.out.println(data);
			}
			R.close();
			
					
		}
		catch(FileNotFoundException e) {
			System.out.println("an error occured");
			e.printStackTrace();
		}
		}

}
