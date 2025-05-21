package Day4;

class copyconstr {
	int x;
	int y;
	public copyconstr(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+y);
		
	}
	public copyconstr(copyconstr c1) {
		this.x=c1.x;
		this.y=c1.y;
		System.out.println(x-y);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		copyconstr c1=new copyconstr(21,21);
		copyconstr c2=new copyconstr(c1);

	}

}
