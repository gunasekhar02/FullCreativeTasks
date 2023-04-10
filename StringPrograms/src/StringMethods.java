
public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="guna Sekhar reddy";
		String s2="Guna Sekhar Reddy";
		System.out.println(s1.length());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.endsWith("reddy"));
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s2.substring(3,6));
		
		
	}

}
