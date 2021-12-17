package test_project;

import java.util.Arrays;

public class test_code {
	public  static void main(String[] args) {
		int[] numbers = {20000,50000,300000,200000,500000};
		int number = 30000;

		String checker = Arrays.toString(numbers);
		System.out.printf("checker la: %s\n", checker);
		// The toString of int in some cases can happen without explicitly saying so
		// In this example we convert both
		if (!checker.contains(Integer.toString(number))) {
			System.out.println("false");   
		}
	}
}
