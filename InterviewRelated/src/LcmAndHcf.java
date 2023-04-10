import java.util.Scanner;

public class LcmAndHcf {
	static int findLcm(int n1,int n2) {
		int lcm=0;
		int bigger;
		if(n1>n2) {
			bigger=n1;
		}else {
			bigger=n2;
		}
		while(true) {
			if(bigger%n1==0 && bigger%n2==0) {
				lcm=bigger;
				break;
			}
			bigger++;
		}
		return lcm;
		
		
		
	}
	static int findHcf(int n1, int n2) {
		int smaller;
		int hcf = 0;
		if(n1<n2) {
			smaller=n1;
		}else {
			smaller=n2;
		}
		
		for(int i=1;i<smaller+1;i++) {
			if(n1%i==0 && n2%i==0) {
				hcf=i;
			}
		}
		return hcf;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("lcm is="+findLcm(num1,num2));
		System.out.println("hcf is="+findHcf(num1,num2));

	}

}
