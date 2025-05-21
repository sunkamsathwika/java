package DAY5;
class Bike{
	void speed() {
		System.out.println("250 km per hour");
	}
}
class Bmw extends Bike{
	void rev() {
		System.out.println("100cc");
	}
}
class Model extends Bmw{
	void price() {
		System.out.println("just 30 lakhs");
	}
}

public class multilevel_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model m1=new Model();
		m1.rev();
		m1.price();

	}

}
