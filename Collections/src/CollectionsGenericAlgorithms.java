// It provides various algorithms that can be used to Manipulate elements stored
// in a datastructure. These methods are static,these algortims can be used in various
// collections , these are also known as Generic Algorithms..

import java.util.*;
public class CollectionsGenericAlgorithms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// lets first create any class object and use generic algorithms in that
		
		List<Integer> l =new ArrayList<>();
		
		int[] arr = {10,23,1,2,5,2,89,90,2,2,1,2,1,67,85};
		for(int i:arr) {
			l.add(i);
			
		}
		@SuppressWarnings("unchecked")
		List<Integer> l1 = new ArrayList<>();
		l1.addAll(l);
		System.out.println(l);
		
		System.out.println();
		
		// sorting 
		Collections.sort(l);
		
		System.out.println(l);
		
		System.out.println();
		
		// shuffling
		Collections.shuffle(l);
		
		System.out.println(l);
		
		System.out.println();
		
	// Data manipulation
		
		
		// reverse()
		Collections.reverse(l);
		
		System.out.println(l);
		
		System.out.println();
		//fill()
		Collections.fill(l1,10);
		
		System.out.println(l1);
		System.out.println();
		
	// extereme values
		System.out.println(Collections.min(l));
		System.out.println(Collections.max(l));
		System.out.println();
		
	// composition
		
		//frequency of element
		
		System.out.println(Collections.frequency(l,1));
		System.out.println(Collections.frequency(l,2));
		
		//disjoint()
		
		System.out.println(Collections.disjoint(l,l1));
		
		
		
		// copy()
		
		System.out.println(l);
		
		Collections.copy(l1,l);
		
		System.out.println(l1);
		
		

	}

}
