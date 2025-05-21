package DAY7;
class Sathwika_ extends Exception{
	public Sathwika_(String message) {
		super(message);
	}
}

public class example1 {
	public static void numCheck(int num)throws Sathwika_{
	if(num%2==0) {
		throw new Sathwika_("even");
		
	}else {
		System.out.println("odd");
	}
	}
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			numCheck(20);
			

	}catch(Sathwika_ e) {
		System.out.println(e.getMessage());
	}finally {
		System.out.println("happy coding");
	}

}
	}
