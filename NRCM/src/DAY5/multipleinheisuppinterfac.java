package DAY5;
interface I4{
	void add();
}
interface I3{
	void sub();
}

public class multipleinheisuppinterfac implements I4{
	public void add()
	{
		System.out.println("Hellosunn");
	}
	public void sub() {
		System.out.println("helloworld");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multipleinheisuppinterfac i1=new multipleinheisuppinterfac();
		i1.add();
		i1.sub();
		

	}

}
