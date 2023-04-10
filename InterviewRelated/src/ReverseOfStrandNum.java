
public class ReverseOfStrandNum {
	static String reverseOfStr(String s) {
		String st="";
		for(int i=s.length()-1;i>=0;i--) {
			st+=s.charAt(i);
		}
		return st;
	}
	static int reverseOfNum(int n) {
		int rev=0;
		while(n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="gunasekhar";
		int n=123456789;
		System.out.println(reverseOfStr(s));
		System.out.println(reverseOfNum(n));

	}

}
