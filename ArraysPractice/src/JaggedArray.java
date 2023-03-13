import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m;
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		
		int arr[][]=new int[m][];
		
		for(int i=0;i<m;i++) {
			System.out.print("Enter the column size:");
			arr[i]=new int[sc.nextInt()];
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		//printing
		System.out.println(arr);
		System.out.println(arr.toString());
		System.out.println();
		for(int i=0;i<m;i++) {
			for(int j=0;j<arr[i].length;j++) {
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
