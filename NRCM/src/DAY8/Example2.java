package DAY8;

class Example3  extends Thread{
	public void run() {
		System.out.println("good morning");
		
	}
}
 class Test3 implements Runnable{
	public void run() {
		System.out.println("hello");
	}
}
class Example2{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example3 t1=new Example3();
		Test3 t2=new Test3();
		t1.start();
		Thread t3=new Thread(t2);
		t3.start();
	}

}