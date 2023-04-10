import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class IntersectionOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[]= {1,2,3,5,7,9};
		Integer b[]= {3,4,6,1,8,7};
		HashSet <Integer> set1=new HashSet<>(Arrays.asList(a));
		HashSet <Integer> set2=new HashSet<>(Arrays.asList(b));
		HashSet <Integer> s=new HashSet<>();
		set1.retainAll(set2);
		System.out.println(set1);
		System.out.println(set2);
		
		
		
	 

	}

}
