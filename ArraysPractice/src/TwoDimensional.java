import java.util.Scanner;

public class TwoDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n;
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		n=sc.nextInt();
		int arr[][]=new int[m][n];
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		//printing
		System.out.println(arr);
		System.out.println(arr.toString());
		System.out.println();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int[] k:arr) {
			for(int i: k) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
