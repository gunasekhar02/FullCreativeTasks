class Main{
	int a=10;
	int b=20;
	Main(){
		System.out.println("Default Constructor called!");
		System.out.println(a+b);
		
	}
	Main(int a,int b){
		System.out.println(a+b);
		
	}
	Main(float a,float b){
		System.out.printf("%.2f",(a+b));
	}
	
}

public class ConstructorOverLoading {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main ob=new Main();
		Main ob1=new Main(1,2);
		Main ob2=new Main(2.3f,3.456f);
		

	}

}
