import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		for(int i=1;i<n;i++) {
			if(temp%i==0) {
				sum+=i;
			}
		}
		if(sum==n) {
			System.out.println("Perfect Num");
		}else {
			System.out.println("Not perfect");
		}

	}

}
