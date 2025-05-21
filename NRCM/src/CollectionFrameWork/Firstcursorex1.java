package CollectionFrameWork;
import java.util.*;


public class Firstcursorex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(2);
		l1.add(5);
		l1.add(8);
		System.out.println(l1);
		Iterator i1=l1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}

	}

}
