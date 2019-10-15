package patient;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PatientTest {
	
	private Patient p1 = new Patient("Jim Smith");
	private Patient p2 = new Patient("John Miller");
	
	@Test
	public void testToString() {
		p1.addCheckup(180, 80, 36.5, true);
		p2.addCheckup(170, 72, 36.2, false);
		String res = p1.toString();
		assertEquals("Name: Jim Smith,Height: 180,Weight: 80.0,Temperature: " +
				"36.5",res);
	}
	
	@Test
	public void testGetTemp() {
		Checkup checkup = new Checkup(150,50,36.4,true);
		assertEquals(checkup.getTemperature(),36.4);
	}
	
	@Test
	void testGetHeight() {
		Checkup checkup = new Checkup(150,50,36.4,true);
		assertEquals(checkup.getHeight(),150);
	}
	
	@Test
	void testGetWeight() {
		Checkup checkup = new Checkup(150,50,36.4,true);
		assertEquals(checkup.getWeight(),50);
	}
	
	@Test
	void testGetVaccs() {
		Checkup checkup = new Checkup(150,50,36.4,true);
		assertEquals(checkup.getVaccsOk(),true);
	}

}
