package DAY9;
import java.util.*;

public class Queue_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q1=new PriorityQueue<Integer>();
		q1.add(40);
		q1.offer(56);
		q1.offer(78);//add
		q1.offer(68);
		
		System.out.println(q1);
		q1.poll();
		System.out.println(q1);
		q1.remove();
		System.out.println(q1);
		
		
		
	}

}
