package DAY6;

public class getmessageerroe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println("hi");
		try {
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
			
		}
	
		

	}

}
