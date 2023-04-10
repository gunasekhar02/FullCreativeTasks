import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,6,7};
		int l=a.length-1;
		for(int i=0;i<=l/2;i++) {
			int temp=a[i];
			a[i]=a[l-i];
			a[l-i]=temp;
			
		}
		System.out.println(Arrays.toString(a));
	}

}
