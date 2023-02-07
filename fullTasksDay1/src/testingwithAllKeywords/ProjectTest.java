package testingwithAllKeywords;  //package
import static org.junit.Assert.assertEquals;

import org.junit.Test; //import key word

public class ProjectTest {
	static int a=21;  // class variable
	
		
	@Test
	public void returnEligibleToVoteOrNot(){
		Voting ob=new Voting();
		assertEquals("True",ob.CheckAge(a));
	
		

	}

}
