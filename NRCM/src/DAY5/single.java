package DAY5;

class Animal{
	void Sleep() {
		System.out.println("sleeping");
		
	}
}
class Dog extends Animal {
	void Bark() {
		System.out.println("Dog is barking");
	}
}

public class single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.Bark();
		d.Sleep();

	}

}
