package buoi7_TH;

import java.util.Scanner;

public class practice_7 {
/*
 * Input: nhập vào n số nguyên bất kỳ
 * Output: tổng các số chắn nếu n chẵn, và ngược lại
 */
	public static void main(String[] args) {
		System.out.println("Nhập vào số bất kỳ\n ");
		int soBatKy;
		Scanner sc = new Scanner(System.in);
		soBatKy = sc.nextInt();
		int sum = 0;
		if(soBatKy %2 ==0) {
			for(int i = 1; i<soBatKy; i++ ) {
				if(i%2==0) {
					sum += i;
				}
			}
		}else {
			for(int i =1; i<soBatKy; i++) {
				if(i%2 !=0) {
					sum +=i;
				}
			}
		}
		System.out.printf("sum: %d", sum);

	}

}
