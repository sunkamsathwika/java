package questions;
interface movie1{
	void payment(); 
}
interface movie2{
	void refundpayment();
}
interface movie3 extends movie1,movie2{
	void cancel();
}
class question1 implements movie3{
	void cancel1() {
		System.out.println("payment cancel");
     }
	public void payment() {
		System.out.println("payment successfull");
}
	public void refundpayment() {
		System.out.println("refundpayment");
	}
	public void cancel() {
		System.out.println("payment in progress");
	}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	question1 q1=new question1();
	q1.payment();
	q1.refundpayment();
	q1.cancel();
	q1.cancel1();
}
}