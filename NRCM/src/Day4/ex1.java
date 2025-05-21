package Day4;

public class ex1 {
	int a;
	int b;
	public ex1(int x,int y) {
		a=x;
		b=y;
		System.out.println(x+y);
	}
	public void add() {
		System.out.println(this.a-this.b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex1 e=new ex1(34,12);
		e.add();

	}

}
