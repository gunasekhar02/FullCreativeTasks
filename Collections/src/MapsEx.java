import java.util.*;
import java.util.Map.Entry;
public class MapsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m= new HashMap<>();
		Map<Integer,String> map2= new Hashtable<>();
		
		m.put(101, "python");
		m.put(102, "java");
		m.put(103, "Ruby");
		m.put(104, "kotlin");
		
		// printing of the map
		System.out.println(m);
		
		// Addint all the entries to the map2 from m
		
		map2.putAll(m);
		
		System.out.println("map2:"+map2);
		
		//getting keys from the map
		
		Set<Integer> keys=m.keySet();
		
		for(int i: keys) {
			System.out.println(i);
		}
		
		System.out.println();
		
		//getting valuess from the map
		
				Collection<String> values=m.values();
				
				for(String i: values) {
					System.out.println(i);
				}
				
		// to print keys along with the values method1 by using keyset
				
				System.out.println();
				
			for(int key:keys) {
				System.out.println(key+"--->"+m.get(key));
			}
			
			
			
			System.out.println();
		
	  // to print keys along with the values method2 by using entrySet
			
			Set<Entry<Integer,String>> entries=m.entrySet();
			for(Entry<Integer,String> e: entries) {
				int k=e.getKey();
				String v=e.getValue();
				System.out.println(k+">>>>"+v);
				
			}
			System.out.println();
			
		// verifying wether keys and values in the map
			
			System.out.println(m.containsKey(103));
			System.out.println(m.containsValue("c sharp"));
			
			System.out.println(m.containsKey(103));
			
		// updating, inserting the values in the map
			
			m.put(105,"c sharp");
			m.putIfAbsent(101, "C language");
			
			System.out.println(m);
			
			System.out.println();
			
		// removing of the entries
			
			m.remove(103);
			m.remove(102,"unknown");
			
			System.out.println(m);
			
			m.remove(102,"java");
			
			System.out.println(m);
			
			
			System.out.println();
			
			// replacing the values for the keys
			
			m.replace(101,"ptyhon 3.6");
			
			System.out.println(m);
			
			
			
		
		
		

	}

}
