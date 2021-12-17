package buoi7_TH;

import java.util.Scanner;

public class practice_4 {
/*
 * Input: nhập số bất kì
 * Output: In ra giá trị tăng/giảm của số đó từ mốc 0
 */
	public static void main(String[] args) {
		System.out.println("Nhập vào số bất kỳ\n ");
		int soBatKy;
		Scanner sc = new Scanner(System.in);
		soBatKy = sc.nextInt();
		for(int i = 0; i <= soBatKy; i ++) {
			System.out.printf("%d\t", i);
		}
		System.out.println("\n");
		for(int i =soBatKy; i >=0; i-- ) {
			System.out.printf("%d\t", i);
		}
	}

}
