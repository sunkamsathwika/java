package DAY7;
class CheppanuException extends Exception{
	public CheppanuException(String message) {
		super(message);
	}
}

public class UserdefinedException {
	public static void ageCheck(int age)throws CheppanuException{
	if(age<18) {
		throw new CheppanuException("nenu cheppanu");
		
	}
	else {
		System.out.println("na age below 18");
	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ageCheck(20);
			

	}catch(CheppanuException e) {
		System.out.println(e.getMessage());
	}finally {
		System.out.println("happy cooding");
	}

}
	}
