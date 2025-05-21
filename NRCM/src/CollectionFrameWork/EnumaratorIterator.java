package CollectionFrameWork;
import java.util.*;

public class EnumaratorIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> l1=new Vector<Integer>();
		l1.add(2);
		l1.add(5);
		l1.add(8);
		System.out.println(l1);
		Enumeration<Integer> i1=l1.elements();
		while(i1.hasMoreElements()) {
			System.out.println(i1.nextElement());
		}


	}

}
