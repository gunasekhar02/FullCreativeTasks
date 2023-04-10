import java.util.Arrays;
import java.util.HashMap;

public class WordCountinASentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="I am Guna Sekhar reddy friend of I sekhar reddy ";
		String[] l=str.split(" ");
		//System.out.println(Arrays.toString(l));
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		for(String i: l) {
			if(map.containsKey(i)) {
				map.put(i,map.get(i)+1);
			}
			else {
				map.put(i, 1);
			}
			
		}
		System.out.println(map);

	}

}
