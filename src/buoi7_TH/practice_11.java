package buoi7_TH;

import java.util.Scanner;

public class practice_11 {

	public static void main(String[] args) {
		System.out.println("Nhập vào số bất kỳ\n ");
		int soBatKy;
		Scanner sc = new Scanner(System.in);
		soBatKy = sc.nextInt();
		for(int i = 2; i < soBatKy; i++) {
			for(int j = 2; j <i; j++) {
				if(i%j !=0) {
					System.out.printf("%d\t", i);
				}
			}
		}

	}

}
