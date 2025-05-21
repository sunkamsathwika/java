package DAY5;
 class mainmethodoverloading {
	public static void main() {
		System.out.println("good mrng");
	}
	public static void main(int a,int b) {
		System.out.println(a+b);
	}
	public static void main(double d1,double d2) {
		System.out.println(d1-d2);
	}
	public static void main(String s1,String s2) {
		System.out.println(s1.concat(s2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		polymethodoverriding p1=new polymethodoverriding();
		main();
		main(2,4);
		main(34,21);
		main(21.2,3.4);
		main("sunkam","sathwika");
		
		

	}

}
