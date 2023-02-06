package fullTasksDay1;

import java.util.*;
import java.util.Scanner;

public class MethodOverloading {
	public int add(int a,int b) { 
		int sum=a+b;
		return sum;
}
	public  float add(float a,float b) {
		float sum=a+b;
		return sum;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		MethodOverloading ob = new MethodOverloading();
		System.out.println(ob.add(1, 5));
		System.out.println(ob.add(1.23f, 5.56f));

}
}
