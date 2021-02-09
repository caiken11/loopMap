package loopMapExcercise2;

import java.util.HashMap;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		HashMap<String, String> vehicles = new HashMap<String, String>();
		vehicles.put("civic", "honda");
		vehicles.put("grand Cherokee", "jeep");
		vehicles.put("cherokee", "jeep");
		vehicles.put("prius", "toyota");
		vehicles.put("altima", "nissan");
		vehicles.put("forester", "subaru");
		
		System.out.println("What model vehicle are you looking for?");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		System.out.printf("Oh, you're looking for a %s. "
				+ "The %ss are right over here!", 
				vehicles.get(input.toLowerCase()),
				vehicles.get(input.toLowerCase()));
		scanner.close();
	}
}
	
