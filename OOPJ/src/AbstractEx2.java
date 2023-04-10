abstract class Animal{
	abstract void makeSound();
	void eat() {
		System.out.println("eats grass");
	}
	Animal(){
		System.out.println("super method called!");
	}
	Animal(String s){
		System.out.println(s);
	}
}
class Dog extends Animal{
	public Dog(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}

	void makeSound() {
		System.out.println("Bow Bow");
	}
}
class Cat extends Animal{
	Cat(){
		super();
	}
	void makeSound() {
		System.out.println("Meow Meow");
	}
	
}
public class AbstractEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal ob=new Dog("elephant");
		ob.eat();
		Animal ob1=new Cat();
		//Animal ob1=new Dog();
		

	}

}
