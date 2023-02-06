package fullTasksDay1;

import java.util.Scanner;

class sekhar {
	void sekhar(){
		int s=10;
		System.out.println(s);
	}
	int a=10;
	int b=20;
	public void add() { 
		int sum=a+b;
		System.out.println(sum);
}
}
class guna extends sekhar{
	int c=23;
	int d=90;
	public void add() {
		int sum=c+d;
		super.add();
		sekhar();
		System.out.println(sum);
		
		
}
}
public class MethodOverriding{
public static void main(String[] args) {
		// TODO Auto-generated method stub
		guna ob = new guna();
		ob.add();

}
}