package fullTasksDay1;

import java.util.Scanner;
import java.util.Arrays;


public class MulitidimensionalArray {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int m=sc.nextInt();
			int n=sc.nextInt();
			int[][]a=new int[m][n];
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					a[i][j]=sc.nextInt();
					
				}
			}
			for(int[] k:a) {
			System.out.println(Arrays.toString(k));

		}
			for(int[]k:a) {
				for(int i=0;i<k.length;i++) {
					System.out.print(k[i]+" ");
				}
				System.out.println();
			}

	}
	}


