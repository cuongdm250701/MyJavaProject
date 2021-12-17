package buoi7_TH;

import java.util.Scanner;

public class practice_5 {
/*
 * Input: nhập số nguyên n
 * Output: in ra số nhị phân tương ứng
 */
	public static void main(String[] args) {
		System.out.println("Nhập vào số bất kỳ\n ");
		int soBatKy;
		Scanner sc = new Scanner(System.in);
		soBatKy = sc.nextInt();
		int phanDu;
		while(soBatKy/2 > 0) {
			phanDu = soBatKy % 2;
			System.out.printf("\t",phanDu);
			soBatKy = soBatKy/2;
		}
	}

}
