import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		String[] s=str.trim().split(" ");
		System.out.println("Word count "+ s.length);

	}

}
