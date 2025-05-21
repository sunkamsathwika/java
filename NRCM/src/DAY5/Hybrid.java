package DAY5;
class Movies{
	void genre() {
		System.out.println("crime and thriller");
	}
}
class Hit extends Movies {
	void action() 
	{
		System.out.println("investigation");
	}
}
class Hero extends Hit {
	void name()
	{
		System.out.println("Nani");
	}
}
class Herorine extends Hit{
	void look() {
		System.out.println("good");
	}
	
}

public class Hybrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero a1=new Hero();
		Herorine m1=new Herorine();
		a1.action();
		a1.genre();
		a1.name();
		m1.look();
		

	}

}
