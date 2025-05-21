package DAY5;

public class polymethodoverriding {
	void show() {
		System.out.println("good mrng");
	}
	void show(int a,int b) {
		System.out.println(a+b);
	}
	void show(double d1,double d2) {
		System.out.println(d1-d2);
	}
	void show(String s1,String s2) {
		System.out.println(s1.concat(s2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		polymethodoverriding p1=new polymethodoverriding();
		p1.show();
		p1.show(2,4);
		p1.show(34,21);
		p1.show(21.2,3.4);
		p1.show("sunkam","sathwika");
		
		

	}

}
