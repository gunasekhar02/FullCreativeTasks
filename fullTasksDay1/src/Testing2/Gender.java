package Testing2;

public class Gender {
	
	public String genderIs(String gen) {
		String a=gen.toLowerCase();
		if(a.equals("male")){
			return "male";
		}
		if(a.equals("female")) {
			return "female";
		}
		if(a.equals("transgender")) {
			return "transgender";
		}
		return "other";
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
