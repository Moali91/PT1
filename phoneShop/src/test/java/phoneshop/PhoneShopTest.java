package phoneshop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PhoneShopTest {
	
	PhoneShop shop = new PhoneShop("Jim Smith");

	@Test
	void testGetOwner() {
		assertEquals("Jim Smith", shop.getOwner());
	}
	
	@Test
	void testGetPhonesNOK() {
		String res = shop.phoneSold();
		assertEquals(res,"NOK");
	}
	
	@Test 
	void testGetPhones() {
		shop.fillStockPhones(10);
		String res = shop.phoneSold();
		assertEquals(shop.getPhoneStock(), 9);
		assertEquals(res,"OK");
	}
	
	@Test
	void testGetCasesNOK() {
		String res = shop.caseSold();
		assertEquals(res,"NOK");
	}
	
	@Test 
	void testGetCases() {
		shop.fillStockCases(10);
		String res = shop.caseSold();
		assertEquals(shop.getPhonecaseStock(), 9);
		assertEquals(res,"OK");
	}

}
