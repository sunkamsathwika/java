package questions;
interface rectangle1{
	void perimeter();
	}
interface rectangle2 extends rectangle1{
	void area();
}
class sample implements rectangle2{
	public void side1() {
		System.out.println("side1");
	}

	public void perimeter() {
		System.out.println("Perimeter1");
	}
	public void area() {
		System.out.println("Area1");
	}
}
	class sample2 implements rectangle2{
		public void side2() {
			System.out.println("side2");
		}
		public void perimeter() {
			System.out.println("Perimeter2");
		}
		public void area() {
			System.out.println("Area2");
		}
	}
 public class question2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample s1=new sample();
		sample2 s2=new sample2();
		s1.side1();
		s2.side2();
		s1.perimeter();
		s1.area();
		s2.perimeter();
		s2.area();
		}
 }


