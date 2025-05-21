package DAY8;

public class runnableinterface_ implements Runnable{
	public void run() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		runnableinterface_ r=new runnableinterface_();
		Thread t=new Thread();
		System.out.println("hello");
		t.start();
		
		// TODO Auto-generated method stub

	}

}
