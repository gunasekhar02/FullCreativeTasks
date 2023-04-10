import java.util.Arrays;

public class EqualityOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,0};
		System.out.println(Arrays.equals(a, b));
		boolean equal=true;
		if(a.length==b.length) {
			for(int i=0;i<a.length;i++) {
				if(a[i]!=b[i]) {
					equal=false;
					}
			}
		}
			else {
		equal=false;
		}
		if(equal) {
			System.out.println(" Arrays are equal");
		}
		else {
			System.out.println(" Arrays are not equal");
		}
	}

}
