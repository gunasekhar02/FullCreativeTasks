import java.util.Scanner;

public class DowhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// need to exit from the loop when i enter 10
		int val;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.print("Enter the value: ");
			val=sc.nextInt();
			
		}while(val!=10);
		System.out.println("Got 10! so exited form the while loop");

	}

}
