
public class Fabinocci {
	static int fab(int n) {
		if(n<=0) {
			return 0;
		}
		if(n==1 || n==2) {
			return 1;
		}
		else {
			return fab(n-2)+fab(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		System.out.println(fab(6));

	}

}
