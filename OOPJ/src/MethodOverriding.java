class Person{
	int getAge() {
		return 100;
	}
}
class Teacher extends Person{
	int getAge() {
		return 35;
	}
}
class Student extends Person{
	int getAge() {
		return 16;
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		Teacher t=new Teacher();
		Student s=new Student();
		System.out.println(p.getAge());
		System.out.println(t.getAge());
		System.out.println(s.getAge());


	}

}
