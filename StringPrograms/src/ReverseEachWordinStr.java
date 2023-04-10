import java.util.Scanner;

public class ReverseEachWordinStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] str=s.split(" ");
		String S1="";
		for(String i: str) {
			StringBuilder sb=new StringBuilder(i);
			String a= sb.reverse().toString();
			S1+=a+" ";
		}
		System.out.println(S1);
		

	}

}
