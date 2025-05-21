package DAY9;
import java.util.*;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(2);
		l1.add(5);
		l1.add(8);
		List<Integer> l2=new ArrayList<Integer>(l1);
		System.out.println(l1);
		l1.add(2);
		l1.add(5);
		l1.add(8);
		System.out.println(l2);
		
		

	}

}
