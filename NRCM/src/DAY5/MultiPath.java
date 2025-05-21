package DAY5;
class Fruits{
	void benefits() {
		System.out.println("healthy");
	}
}
class Apple extends Fruits {
	void colour() 
	{
		System.out.println("red");
	}
}
class Mango extends Fruits {
	void price()
	{
		System.out.println("100");
	}
}
class Banana extends Fruits{
	void taste() {
		System.out.println("sweet");
	}
	
}

public class MultiPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a1=new Apple();
		Mango m1=new Mango();
		Banana b1=new Banana();
		a1.benefits();
		a1.colour();
		m1.price();
		b1.taste();
		

	}

}
