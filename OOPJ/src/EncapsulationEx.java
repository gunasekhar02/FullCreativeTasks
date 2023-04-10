// encapsulation means binding of data into a single unit 
// we use getters and setters for accesing and manipulating the data
class Area{
	private int length=10;
	private int breadth=20;
	Area(){
		System.out.println("Area constructor Called!");
	}
	void setLandB(int l,int b){
		length=l;
		breadth=b;	
	}
	void getAreaOf() {
		System.out.println(length*breadth);
	}
	
}

public class EncapsulationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area ob=new Area();
		//System.out.println(ob.length);
		ob.getAreaOf();
		ob.setLandB(11, 22);
		ob.getAreaOf();

	}

}
