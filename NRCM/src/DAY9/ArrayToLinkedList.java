package DAY9;
import java.util.*;

public class ArrayToLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer>l1=new LinkedList<Integer>();
		// TODO Auto-generated method stub
		l1.add(12);
		l1.add(34);
		l1.add(67);
		l1.add(2);
		System.out.println(l1);
		l1.addFirst(67);
		l1.add(2,45);
		l1.addLast(100);
		System.out.println(l1);
		l1.removeFirst();
		l1.removeLast();
		l1.removeFirstOccurrence(12);
		l1.remove(2);
		
}
}

	