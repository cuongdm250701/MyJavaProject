package test_project;

import java.util.Scanner;

public class condition {
	public static void main(String[] args) {
		// nhap mot so tu ban phim neu la so le thi cong them 1 
		// neu la so chan thi in ra man hinh
		int number;
		System.out.println("Input a random number you want: ");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
//		System.out.printf("your number just input is: %d",number);
		sc.close();
		if(number % 2 !=0) {
			number = number+1;
			System.out.printf("your number just input is: %d",number);
		}else {
			System.out.printf("your number just input is: %d",number);
		}
		
	}
	
}
