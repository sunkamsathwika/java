package DAY9;

import java.util.*;

public class IfArrayIsGiven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> l1=new ArrayList<Object>();
		l1.add(12);
		l1.add("hi");
		l1.add(67);
		l1.add(2,"hello");
		System.out.println(l1);
		List<Object> extra=Arrays.asList(9,"hello",7);
		l1.addAll(1,extra);
		//System.out.println(l1);
		//------------------------------------------------------------------------------------
		System.out.println(l1.get(6));
		System.out.println(l1.indexOf(90));
		Object[] arr=l1.toArray();
		for(Object a1:arr) {
			System.out.println(a1);
		}
		

	}

}
