import java.util.*;
public class FindTheEvencountdigits {
	static int EvenCount(int[] arr) {
		int c=0;
		if(arr.length==0) {
			return -1;
		}
		for(int i=0;i<arr.length;i++)
		{
			String a=Integer.toString(arr[i]);
			if(a.length()%2==0) {
				c+=1;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,34,56,789,8970,123456};
		System.out.println(EvenCount(a));

	}

}
