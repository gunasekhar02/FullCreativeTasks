package Testing2;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GenderTest {
	@Test
	public void testTheGender() {
		Gender ob=new Gender();
		assertEquals("male",ob.genderIs("Male"));
		assertEquals("female",ob.genderIs("FeMale"));
		assertEquals("transgender",ob.genderIs("TransGender"));
		assertEquals("other",ob.genderIs("kngisfgsdg"));
	}

}
