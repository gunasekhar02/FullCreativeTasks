import java.util.*;
import java.util.Vector;
public class VectorEx
{
	public static void main(String[] args) {
		Vector vec=new Vector<>();
		Vector<Integer> vec2=new Vector<>(4);
		vec.add(1);
		vec.add(2);
		vec.add(3);
		vec.add("Guna");
		vec.add(5.6);
		System.out.println(vec);
		System.out.println(vec.capacity());
		
	    vec2.add(5);
	    vec2.add(6);
	    vec2.add(7);
	    vec2.add(8);
	    System.out.println(vec2);
		System.out.println(vec2.capacity());
		vec2.add(9);
		System.out.println(vec2.capacity());
	}
}