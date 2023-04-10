import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FrequencyUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,3,21,4,3,4,3,5};
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i:a) {
			if(map.containsKey(i)){
				map.put(i, map.get(i)+1);
				
			}
			else {
				map.put(i,1);
			}
		}
		int frequency=1;
		int ele=0;
		Set<Entry<Integer,Integer>> entrySet=  map.entrySet();
		for(Entry<Integer,Integer> ene:entrySet) {
			if(ene.getValue()>frequency) {
				frequency=ene.getValue();
				ele=ene.getKey();
			}
		}
		System.out.println(ele+" "+frequency);
		

	}

}
