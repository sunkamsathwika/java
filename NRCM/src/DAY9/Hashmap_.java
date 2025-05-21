package DAY9;

import java.util.*;
public class Hashmap_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String>m1=new HashMap<Integer,String>();
		m1.put(1, "CSE");
		m1.put(2, "ECE");
		m1.put(3, null);
		m1.put(6, null);
		m1.put(5, "MECH");
		m1.put(4, "AIML");
		System.out.println(m1);
		for(Map.Entry<Integer,String>i:m1.entrySet()) {
			System.out.println(i.getValue());
			System.out.println(i.getKey());
			
		}
		
		
	}

}
