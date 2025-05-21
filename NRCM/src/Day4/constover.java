package Day4;

public class constover {
	int a;
	int b;
	int c;
	public constover(int a) {
		System.out.println("welcome to my profile");
	}
	public  void constover(int a) {
		this.a=a;
		System.out.println("ssc marks:"+a);
	}
	public constover(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("ssc marks and inter marks:"+a+ ","+b);
	}
	public constover(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println("ssc marks,inter marks and btech marks:"+a+ ","+b+","+c);
	}
	public static void main(String[] args) {
		constover c = new constover(89);
		constover c1 = new constover(456);
		constover c2 = new constover(456,678);
		constover c3 = new constover(456,678,901);
		


		
		
	}

}
