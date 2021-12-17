package test_project;

import java.util.Scanner;

public class loop {
  public static void main(String[] args) {
	  int number;
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Input random number is");
	  number = sc.nextInt();
	  
	  System.out.println(number);
	  while (number >= 10) {
		  System.out.println("Input a number less than 10: ");
		  number = sc.nextInt();
	  }
	  System.out.println("Successfully");
	  sc.close();
	  
  } 
}
