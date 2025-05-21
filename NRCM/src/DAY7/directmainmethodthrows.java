package DAY7;
import java.util.*;

import java.util.Scanner;

public class directmainmethodthrows {

	void add() throws ArithmeticException,InputMismatchException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values of a,b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a/b;
		System.out.println(c);

	}
	public static void main(String[] args) {
		directmainmethodthrows d=new directmainmethodthrows();
		d.add();
		
	}

}
