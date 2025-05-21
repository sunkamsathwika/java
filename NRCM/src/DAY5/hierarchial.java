package DAY5;
class Chocolate{
	void eat() {
		System.out.println("tasty");
	}
}
class Dark extends Chocolate {
	void taste1() 
	{
		System.out.println("good taste");
	}
}
class Sweet extends Chocolate {
	void taste2()
	{
		System.out.println("averagetaste");
	}
}
class brownie extends Dark{
	void cost1() {
		System.out.println("20");
	}

	public void action() {
		// TODO Auto-generated method stub
		
	}

	public void genre() {
		// TODO Auto-generated method stub
		
	}

	public void name() {
		// TODO Auto-generated method stub
		
	}
	
}
class Amul extends Dark{
	void cost2() {
		System.out.println("50");
	}
	
}
class DairyMilk extends Sweet{
	void weight() {
		System.out.println("20 grms");
	}
	
}
class Kitkat extends Sweet{
	void Sweet() {
		System.out.println("10 grms");
	}
	
}


public class hierarchial{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		brownie a1=new brownie();
		Herorine m1=new Herorine();
		a1.action();
		a1.genre();
		a1.name();
		m1.look();
		

	}

}
