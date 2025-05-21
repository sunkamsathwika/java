package DAY8;

public class _multithread extends Thread {
	public void run() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		_multithread m=new _multithread();
		System.out.println("hello");
		m.start();
		
		
		
	}

}
