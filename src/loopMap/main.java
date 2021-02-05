package loopMap;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		ArrayList<Integer> inputnums = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		
		while (inputnums.size() <= 4) {
			System.out.println("Enter an integer");
			Integer input = scanner.nextInt();
			inputnums.add(input);
		};
		scanner.close();
		Loop calculate = new Loop(inputnums);
		calculate.sumOfArray();
		
		
	}

}
