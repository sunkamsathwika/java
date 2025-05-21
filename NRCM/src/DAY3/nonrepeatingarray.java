package DAY3;

public class nonrepeatingarray {
	public static void main(String[] args) {
		int[] arr= {4,7,1,9,2};
		int[] arr1=new int[arr.length];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for (int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==1) {
				arr1[index++]=arr[i];
			}
		}
		System.out.print("No repeated ");
		for(int i=0;i<index;i++) {
			System.out.print(arr1[i] + " ");
		}
		
	}

}
