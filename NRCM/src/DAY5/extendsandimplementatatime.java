package DAY5;
interface I1{
	void add();
}
interface I2{
	void sub();
}
public class extendsandimplementatatime   implements I1,I2 {
	public void add()
	{
		System.out.println("Hellosunn");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		extendsandimplementatatime i1=new extendsandimplementatatime();
		i1.add();
		i1.sub();
		

	}
	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}

}
