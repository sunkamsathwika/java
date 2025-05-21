package DAY5;
interface I5{
	abstract void add();
	void sub();
}

public class interfaceclass implements I5 {
	public void add()
	{
		System.out.println("Hellosun");
	}
	public void sub() {
		System.out.println("helloworld1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interfaceclass i1=new interfaceclass();
		i1.add();
		i1.sub();
		

	}

}
