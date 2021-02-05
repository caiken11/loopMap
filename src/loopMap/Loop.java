package loopMap;

import java.util.ArrayList;
import java.util.Scanner;

public class Loop {
	
	public ArrayList<Integer> numbers;
	
	public Loop(ArrayList<Integer> numsList) {
		numbers = numsList;
	}
	
	
	public void sumOfArray() {
		Integer sum = 0;
		for (int i = 0; this.numbers.size() < i; i++) {
			sum = sum + this.numbers.get(i);
			System.out.println(sum);
		}
	}
	public void productOfArray() {
		Integer product = 0;
		for (int i = 0; numbers.size() < i; i++) {
			product = product * numbers.get(i);
			System.out.println(product);
		}
	}
}	
	
