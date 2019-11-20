package callcontrol;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PhoneNumberTest {
	private PhoneNumber phoneNumber;
	
	@Test
	void testNoTreatment() {
		phoneNumber = new PhoneNumber("+41", "44", "7258912");
		assertEquals("+41 44/725 8912", phoneNumber.toString());
	}

	@Test
	void testCountryCodeWithZeros() {
		phoneNumber = new PhoneNumber("0041", "44", "7258912");
		assertEquals("+41 44/725 8912", phoneNumber.toString());
	}

	@Test
	void testCountryCodeWithoutPlus() {
		phoneNumber = new PhoneNumber("41", "44", "7258912");
		assertEquals("+41 44/725 8912", phoneNumber.toString());
	}
	
	@Test
	void testCountryAreaCodeWithZero() {
		phoneNumber = new PhoneNumber("+41", "044", "7258912");
		assertEquals("+41 44/725 8912", phoneNumber.toString());
	}
}
