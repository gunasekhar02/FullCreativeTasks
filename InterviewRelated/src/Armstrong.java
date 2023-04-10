import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int actual=n;
		String s=Integer.toString(n);
		int l=s.length();
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum+=Math.pow(rem, l);
			n=n/10;
		}
		System.out.println(sum);
		if(actual==sum) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong Number");
		}

	}

}
