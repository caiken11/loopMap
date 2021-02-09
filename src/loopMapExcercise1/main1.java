package loopMapExcercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main1 {

	public static void main(String[] args) {
		ArrayList<Integer> inputnums = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		
		while (inputnums.size() <= 4) {
			System.out.println("Enter an integer");
			Integer input = scanner.nextInt();
			inputnums.add(input);
		}
		scanner.close();
		Loop1 calculate = new Loop1(inputnums);
		System.out.println(calculate.numbers);
		calculate.sumOfArray();
		calculate.productOfArray();
		System.out.println(Collections.min(calculate.numbers));
		System.out.println(Collections.max(calculate.numbers));
		
		
	}

}
