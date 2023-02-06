package fullTasksDay1;

class Bank1{
	void rateofinterest() {
		System.out.println(10);
	}
}
class Sbi1 extends Bank1{
	void rateofinterest() {
		System.out.println(8);
		super.rateofinterest();
	}
}

public class Singlelevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank1 bn=new Sbi1();
		Bank1 b=new Bank1();
		Sbi1 c=new Sbi1();
		bn.rateofinterest();
		b.rateofinterest();
		c.rateofinterest();
		
		
		
	}

}
