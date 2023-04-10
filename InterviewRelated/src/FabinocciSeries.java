import java.util.Scanner;

public class FabinocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int c=0;
		if(n<=0) {
			System.out.println("Enter valid number");
		}
		if(n==1) {
			System.out.println(n);
			
		}
		else {
			System.out.print("0 "+"1 ");
			while(c+2<=n) {
				int temp=a+b;
				System.out.print(temp+" ");
				a=b;
				b=temp;
				c+=1;
				
				
			}
		}
		

	}

}
