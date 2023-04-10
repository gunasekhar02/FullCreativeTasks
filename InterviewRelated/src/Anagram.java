import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	static boolean angramCheck(String s1,String s2) {
	
		if(s1.length()!=s2.length()) {
			return false;
		}
		char[] str1=s1.toCharArray();
		char[] str2=s2.toCharArray();
		Arrays.sort(str1);
		Arrays.sort(str2);
		System.out.println (Arrays.equals(str1, str2));
		for(int i=0;i<s1.length();i++) {
			if(str1[i]!=str2[i]) {
				return false;
				
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		
		System.out.println (angramCheck(s1,s2));
		
		
		

	}

}
