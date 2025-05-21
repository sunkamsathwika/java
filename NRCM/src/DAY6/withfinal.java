package DAY6;
public class withfinal {
	void show() {
		final int a=23;
		System.out.println(a);
		a=34;//final keyword we didn't use anywhere
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		withfinal w=new withfinal();
		w.show();
		

	}

}
