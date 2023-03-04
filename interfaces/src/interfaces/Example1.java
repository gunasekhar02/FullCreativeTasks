package interfaces;
interface Myinterface{
	static void getName(String name) {
		
	}
}

public class Example1 implements Myinterface {
	
	private String name;

	public void getName(String name) {
		
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example1 obj = new Example1();
		obj.name="guna";
		obj.getName(obj.name);
		

	}

}
