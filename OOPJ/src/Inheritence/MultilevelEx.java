package Inheritence;
class Person{
	Person(){
		System.out.println("Person Constructor");
	}
	String name="guna";
	public void getName() {
		System.out.println(name);
		
	}
	public void getAge() {
		System.out.println(22);
		
	}
}
class M extends Person{
	String s=name+"sekhar";
	public void getName() {
	System.out.println(s);
	}
}
class N extends M{
	String s1=s+"reddy";
	public void getName() {
		System.out.println(s1);
		}
}
public class MultilevelEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person ob1=new Person();
		ob1.getName();
		M ob=new M();
		System.out.println(ob.name);
		System.out.println(ob.s);
		ob.getName();
		N ob2=new N();
		ob2.getName();
		ob2.getAge();
		System.out.println(ob.name);
		Person ob3=new M();
		ob3.getName();

	}

}
