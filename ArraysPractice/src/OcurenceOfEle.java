import java.util.HashMap;

public class OcurenceOfEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,4,3,2,1,5,1,1,1};
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i:a) {
			if(map.containsKey(i)) {
				map.put(i,map.get(i)+1);
			}
			else {
				map.put(i, 1);			}
		}
		System.out.println(map);

	}

}
