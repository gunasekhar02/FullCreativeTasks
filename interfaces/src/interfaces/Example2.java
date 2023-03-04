package interfaces;
interface Myinterface2{
	static void getNameof(String name) {
		
	}
}

public class Example2 implements Myinterface2 {
	


	public void getNameof(String name) {
		
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example2 obj = new Example2();
		obj.getNameof("guna");
	
		

	}

}