import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PrimesInRange {
	static ArrayList<Integer> primes(int a, int b) {
		ArrayList<Integer> arr=new ArrayList<>();
		for(int i=a;i<b+1;i++) {
			int c=0;
			for(int j=1;j<(i/2)+1;j++) {
				if(i%j==0) {
					c+=1;
				}
			}
			if(c<2) {
				arr.add(i);
			}
		}
		return arr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter thr range");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(primes(a,b));

	}

}
