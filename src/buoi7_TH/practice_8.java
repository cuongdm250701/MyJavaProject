package buoi7_TH;

import java.util.Scanner;

public class practice_8 {
/*
 * Input: Nhập vào số n bất kì;
 * Output: Tính tổng S = 1/2 + 2/3 +3/4 + .... + n-1/n
 */
	public static void main(String[] args) {
		System.out.println("Nhập vào số bất kỳ\n ");
		int soBatKy;
		Scanner sc = new Scanner(System.in);
		soBatKy = sc.nextInt();
		int sum = 0;
		for(int i =1; i<=soBatKy; i++) {
			sum += i/i+1;
		}
		System.out.printf("sum: %d", sum);
	}

}
