package buoi7_TH;
import java.lang.Math;
import java.util.Scanner;

public class practice_9 {
/*
 * Input: Nhập vào số n,x,k bất kì,
 * Ouput: tính tổng n!/x^n + (-1)^n+1*k^n 
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
		int x;
		int k;
		Scanner sc = new Scanner(System.in);
		soBatKy = sc.nextInt();
		x = sc.nextInt();
		k = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= soBatKy; i++ ) {
			sum += tinhGiaiThua(i)/( Math.pow(x,i) + Math.pow(1, i+1) * Math.pow(k,i));
		}
		System.out.printf("sum: %d", sum);

	}

}
