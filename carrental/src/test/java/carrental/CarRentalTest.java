package carrental;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarRentalTest {

	private Truck green = new Truck("green");
	private Truck green2 = new Truck("green", true);
	private Car red1 = new Car("red");
	private Car red2 = new Car("red", true);
	private Customer c1 = new Customer("Anna Smith", "Somestreet");
	private Customer c2 = new Customer("Bill Bob", "SomeOtherStreet");
	private CarRental cars = new CarRental();

	@Test
	void testTruck() {
		assertEquals("This vehicle is green, has Trailer: false", green.toString());
		assertEquals("This vehicle is green, has Trailer: true", green2.toString());
	}

	@Test
	void testCar() {
		assertEquals("This vehicle is red, has WinterTires: false", red1.toString());
		assertEquals("This vehicle is red, has WinterTires: true", red2.toString());
	}

	@Test
	void testGarage() {
		Garage gar = new Garage();
		gar.setVehicle(red1);
		assertEquals("Description of the parked vehicle: This vehicle is red, has WinterTires: false", gar.toString());
	}

	@Test
	void testGarageTester() {
		Garage expected = new Garage();
		Truck myTruck = new Truck("black", false);
		expected.setVehicle(myTruck);
		Garage g = GarageTester.getExample();
		assertEquals(expected.toString(), g.toString());
	}

	@Test
	void testCarRentalContract() {
		CarRentalContract con1 = new CarRentalContract(c1,green2);
		assertEquals("Anna Smith:This vehicle is green, has Trailer: true", con1.toString());
	}

	@Test
	void testCarRental() {
		CarRentalContract con1 = new CarRentalContract(c1,green2);
		CarRentalContract con2 = new CarRentalContract(c2,green2);
		cars.addContract(con1);
		cars.addContract(con2);
		assertEquals("Anna Smith:This vehicle is green, has Trailer: true", cars.displayContracts().split("\n")[0]);
		assertEquals("Bill Bob:This vehicle is green, has Trailer: true", cars.displayContracts().split("\n")[1]);
	}

}
