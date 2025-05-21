package DAY5;
class test34{
	void add() {
		System.out.println("hiiiiii");
	}
	
}

public class methodoverriding extends test34 {
	void add() {
	System.out.println("helloooooooooo");
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodoverriding m=new methodoverriding();
		m.add();
		

	}

	}
