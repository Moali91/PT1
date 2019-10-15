package greetings;

import java.util.Scanner;

public class Greetings {
	
	public static String getGreeting(String city) {
		// TODO: Your code goes here
		String welcome;

		switch (city.toLowerCase()){
			case "berlin":
				welcome ="Guten Tag!";
				break;
			case "bern":
				welcome ="Guten Tag!";
				break;
			case "london":
				welcome ="Hello!";
				break;
			case "boston":
				welcome ="Hello!";
				break;
			case "paris":
				welcome ="Bonjour!";
				break;
			case "milano":
				welcome ="Ciao!";
				break;
			case "madrid":
				welcome = "Hola!";
				break;
			default:
				welcome = "City not found!";
				break;
		}

		return welcome;
	}
	
  public static void main(String[] args) {
	  
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("Enter a city: ");
	  String city = scanner.nextLine();
	  System.out.println(getGreeting(city));
	  scanner.close();
	  

  }
}

