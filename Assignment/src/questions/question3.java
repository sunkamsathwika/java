package questions;
interface ac{
	void air();
	}
class cooler{
	public void fan() {
		System.out.println("cool air");
	}
}
class tablefan extends cooler implements ac{
	public void cool() {
		System.out.println("Aircondition");
	}
	public void air() {
		System.out.println("tablefan");
	}
}

public class question3 extends tablefan {
	public void heat() {
		System.out.println("hotair");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tablefan t=new tablefan();
		question3 q=new question3();
		t.air();
		q.heat();
		t.cool();
		t.air();
		
		
		

	}

}
