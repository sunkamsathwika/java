package DAY6;

import java.util.EventObject;

public class keywordthis extends EventObject{
	public keywordthis(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int a=90;
void add() {
	System.out.println(a);
}
void sub() {
	System.out.println(this.a);
	this.add();
}



}
