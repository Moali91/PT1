/*
 * Project and Training 1 - HS19/20 (Java), Computer Science, Berner Fachhochschule
 */

package carrental;

public class GarageTester {
	
	public static Garage getExample() {
		// Your code
		Garage garage1 = new Garage();
		Truck truck1 = new Truck("black",false);
		garage1.setVehicle(truck1);

		return garage1;
	}
	
	public static void main(String[] args) {
		Garage g = getExample(); 
	}

}
