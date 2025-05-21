package DAY6;

public class nestedclass {
	void show() {
		System.out.println("hi");
	}
	class test {
		void print() {
		System.out.println("hello");
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nestedclass n=new nestedclass();
		n.show();
		nestedclass.test t=new nestedclass().new test();
		t.print();
		
		

	}

}
