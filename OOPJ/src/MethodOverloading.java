
public class MethodOverloading {
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void add (float a, float b) {
		System.out.printf("%.2f",a+b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading ob=new MethodOverloading();
		ob.add(2, 3);
		ob.add(9.1f, 8.12f);
		

	}

}
