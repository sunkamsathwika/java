package DAY6;

public class MethodlocalInnerclass {
	void show() {
		System.out.println("good afternoon");
		class test{
			void print() {
				System.out.println("good morning");
			}
		}
		test t=new test();
		t.print();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodlocalInnerclass m=new MethodlocalInnerclass ();
		m.show();
		

	}

}
