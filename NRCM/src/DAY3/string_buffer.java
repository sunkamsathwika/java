package DAY3;

public class string_buffer {
	public static void main(String[] args) {
		String str1="listen";
		String str2="silent";
		StringBuffer sb1=new StringBuffer(str1);
		StringBuffer sb2=new StringBuffer(str2);
		System.out.println(sb1.append(sb2));
		
	}
	

}
