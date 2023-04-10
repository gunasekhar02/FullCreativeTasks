package Inheritence;
class A{
	A(){
		System.out.println("A Constructor");
	}
	
	int a=10;
	int b=20;
}
class B extends A{
	int getAra() {
		return a*b;
	}
}
public class SigleLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob1=new A();
		
		B ob=new B();
		System.out.println(ob.getAra());
		

	}

}
