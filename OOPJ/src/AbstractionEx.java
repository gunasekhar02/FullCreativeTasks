abstract class Guna{
	String gender="male";
	public void getName() {
		System.out.println("Guna");
		}
	protected abstract void getGender();
}
class A extends Guna{
	public void getGender() {
		System.out.println(gender);
	}
}
public class AbstractionEx {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guna ob=new A();
		ob.getName();
		ob.getGender();
		

	}

}
