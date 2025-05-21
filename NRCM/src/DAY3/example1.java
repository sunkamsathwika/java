package DAY3;

public class example1 {
	public static void main(String[] args) {
		String str="helloworld";
		int n=0;
		for (int i=0;i<=str.length()-1;i++) {
			char ch=str.charAt(i);
			if(ch=='l') {
				n++;
			}
		}
		System.out.println(n);
		
		
				
		
	}

}
