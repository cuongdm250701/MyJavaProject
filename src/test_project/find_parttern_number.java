package test_project;

import java.util.Random;
import java.util.Scanner;

public class find_parttern_number {
	public static void main(String[] args) {
		Random generator = new Random();
		final int numberMax = 80;
		final int numberMin = 1;
		final int distince = numberMax - numberMin;
		int numberRandom = generator.nextInt(distince) + 1;
//		System.out.printf("numberRandom: %d\n", numberRandom);
		System.out.println("nhap vao so bat ki: \n");
		int yourNumber;
		Scanner sc = new Scanner(System.in);
		yourNumber = sc.nextInt();
		while(true) {
			if(yourNumber < numberRandom) {
				System.out.println("so ban nhap nho hon so cua may, vui long thu tiep: \n");
				yourNumber = sc.nextInt();
			}else if(yourNumber > numberRandom) {
				System.out.println("so ban nhap lon hon so cua may, vui long thu tiep \n");
				yourNumber = sc.nextInt();
			}else if(yourNumber == numberRandom) {
				System.out.println("xin chuc mung ban da nhap dung \n");
				break;
			}
		}
		sc.close();
		
	}
}
