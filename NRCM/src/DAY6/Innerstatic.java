package DAY6;

public class Innerstatic {
	public static void show() {
		System.out.println("hiiiiiiiiii");
		}
	static class test{
		static void print() {
			System.out.println("helllooooo");
			show();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Innerstatic.test.print();

	}

}
