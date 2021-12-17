package buoi7_TH;

import java.util.Scanner;

public class practice_6 {
	/*
	 * Input: Nhập vào một số n bất kì
	 * Ouput: kết quả của giai thừa từ 1! --> n!
	 */
	public static int tinhGiaiThua(int m) {
		int giaiThua = 1;
		for(int i =1; i<= m; i++) {
			giaiThua *= i;
		}
		return giaiThua;
	}

	public static void main(String[] args) {
		System.out.println("Nhập vào số bất kỳ\n ");
		int soBatKy;
		Scanner sc = new Scanner(System.in);
		soBatKy = sc.nextInt();
		int kq = 0;
		for(int i =1; i<=soBatKy; i++ ) {
			kq += tinhGiaiThua(i);
		}
		System.out.printf("kết quả: %d",kq);
		
	}

}
