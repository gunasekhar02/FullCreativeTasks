class Polygon{
	void Render() {
		System.out.println(" Rendering polygon");
	}
}
class Square extends Polygon{
	void Render() {
		System.out.println(" Rendering Square");
	}
}
class Circle extends  Square{
	void Render() {
		System.out.println(" Rendering circle");
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polygon ob= new Polygon();
		ob.Render();
		Square ob1= new Square();
		ob1.Render();
		Circle ob2=new Circle();
		ob2.Render();
		

	}

}
