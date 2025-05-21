package CDC2;

class sample1 {
	public void add() {
		System.out.println("hello");
	}
	
}
public class error extends sample1{

	public static void main(String[] args) {
		error a1=new error();
		a1.add();

	}
}
