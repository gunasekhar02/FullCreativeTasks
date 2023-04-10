interface Polygon1{
	String s="Square";
	void getArea();
	void getName();
	
}
class A1 implements Polygon1{
	public void getArea() {
		System.out.println("S*S");
	}
	public void getName() {
		System.out.println("circle");
	}
}
class B implements Polygon1{
	public void getArea() {
		System.out.println("S*S*S");
	}
	public void getName() {
		System.out.println(s);
		
	}
}
public class InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polygon1 ob=new B();
		ob.getName();
		A1 ob1=new A1();
		ob1.getArea();
		ob1.getName();

	}

}
