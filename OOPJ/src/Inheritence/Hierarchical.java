package Inheritence;
class City{
	String st="Kurnool";
	public void getCity() {
		System.out.println(st);
	}
	public void getHouseNo() {
		System.out.println("1/23/8-D1");
	}
}
class Street extends City{
	String stret=" Krishna Nagar";
	public void getAddress() {
		System.out.println(st+" "+stret);
	}
}
class Building extends City{
	String Build="Rajvihar";
	public void getLandMarkAndCity() {
		System.out.println(st+" "+" "+Build);
	}
}

public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Building ob=new Building();
		ob.getLandMarkAndCity();
		ob.getHouseNo();
		Street ob1=new Street();
		ob1.getAddress();
		ob1.getHouseNo();
		City ob2=new City();
		ob2.getCity();

	}

}
