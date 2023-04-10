import java.util.*;
public class FrequencyOfanEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,3,4,5,6,6,6,54,67,43,4,3,3,2};
		ArrayList<Integer> arr= new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
		arr.add(a[i]);
		}
		int fre=Collections.frequency(arr, 6);
		System.out.println(fre);
		System.out.println(arr);

	}

}
