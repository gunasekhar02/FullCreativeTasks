package fullTasksDay1;
class Bank{
	void rateofinterest() {
		System.out.println(10);
	}
	public void add() {
		System.out.println(200);
	}
}
class Sbi extends Bank{
	void rateofinterest() {
		System.out.println(8);
		//super.rateofinterest();
	}
}
class icici extends Sbi{
	void rateofinterest() {
		System.out.println(12);
		super.rateofinterest();
		
	}
}



public class Multilevel {

	public static void main(String[] args) {
		icici ob=new icici();
		ob.rateofinterest();

	}

}
