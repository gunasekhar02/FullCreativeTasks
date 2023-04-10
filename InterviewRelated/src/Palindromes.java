
public class Palindromes {
	static boolean numPalindrome(int n) {
		int rev=0;
		int temp=n;
		while(n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(temp==rev) {
			return true;
		}else {
			return false;
		}
	}
	static boolean strPalindrome(String s) {
		String temp=s;
		String st="";
		for(int i=s.length()-1;i>=0;i--) {
			st+=s.charAt(i);
		}
		if(st.equalsIgnoreCase(temp)) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123454321;
		String s="Malayalam";
		System.out.println(numPalindrome(n));
		System.out.println(strPalindrome(s));
		

	}

}
