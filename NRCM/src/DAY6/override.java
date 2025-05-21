package DAY6;
class test1{
	void show() {
		System.out.println("hi");
	}
}
public class override extends test1 {
	void show() {
		int a=23;
		System.out.println(a);
		a=34;
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		override w=new override();
		w.show();
		

	}

}
