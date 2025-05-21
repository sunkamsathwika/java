package DAY5;
class sample45{
	public sample45() {
		System.out.println("good evening");
	}
	int x=99;
	void print() {
		System.out.println("hello");
		
		
	}
}

public class keywordsuper extends sample45 {
	public keywordsuper() {
		super();
	}
	void show() {
		int y=45;
		super.print();
		System.out.println(super.x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		keywordsuper s1=new keywordsuper();
		s1.show();

	}

}
