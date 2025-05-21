package DAY8;

public class Example1 implements Runnable {
	public void run() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 e=new Example1();
		 Thread p1=new Thread(e);
		 Thread p2=new Thread(e);
				 System.out.println("hello");
				 p1.start();
				 p2.start();
		 
		
		

	}

}
