package DAY7;

import java.util.InputMismatchException;//unchecked exception,throws and try catch have same error
import java.util.Scanner;
import java.util.Scanner.*;

public class _throws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values of a,b");
		try {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
		}catch(ArithmeticException|InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}

}
