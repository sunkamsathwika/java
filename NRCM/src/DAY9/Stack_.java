package DAY9;
import java.util.*;

public class Stack_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>s1=new Stack<Integer>();
		s1.push(68);
		s1.push(78);
		s1.push(89);
		s1.push(23);
		System.out.println(s1);
		System.out.println(s1.peek());
		System.out.println(s1.pop());
		
		Iterator<Integer> i1=s1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}

	}

}
