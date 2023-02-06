package fullTasksDay1;

class gun{
	int a=10;
	void add() {
		System.out.println(200);
	}
}

public class inher extends gun {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inher ob=new inher();
		System.out.println(ob.a);
		ob.add();

	}

}