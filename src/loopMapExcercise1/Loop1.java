package loopMapExcercise1;

import java.util.ArrayList;

public class Loop1 {
	
	public ArrayList<Integer> numbers;
	
	public Loop1(ArrayList<Integer> numsList) {
		this.numbers = numsList;
	}
	
	
	public void sumOfArray() {
		int sum = 0;
		for (int num: numbers) {
			sum += num;
		}
		System.out.println(sum);
	}
	public void productOfArray() {
		int product = 1;
		for (int num: numbers) {
			product *= num;
		}
		System.out.println(product);
	}

}	
	
