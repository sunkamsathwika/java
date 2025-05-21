package Day4;

class fixedamount{
	public int fixedamount=10000;
}
abstract class withdrawal{  
	abstract void withdraw(int amount);
}
public class bank extends withdrawal {
		fixedamount f1=new fixedamount();
		void withdraw(int amount) {
			f1.fixedamount -= amount;
			System.out.println("withdrawn:"+amount);
			System.out.println("available balance:"+f1.fixedamount);
		}
		
	public static void main(String[] args) {
		int amount=Integer.parseInt(args[0]);
		bank b=new bank();
		b.withdraw(amount);
		}

}
