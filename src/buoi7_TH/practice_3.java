package buoi7_TH;

import java.util.Scanner;

public class practice_3 {
/*
 * Input: 2 số bất kì có kiểu float và double
 * Ouput: tổng, hiệu, tích thương và phần dư của 2 số đó
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a;
		double b;
		double tong;
		double hieu;
		double tich;
		double thuong;
		double phanDu;
		System.out.println("nhap vao so thu nhat\n ");
		a = sc.nextFloat();
		System.out.println("nhap vao so thu hai\n ");
		b = sc.nextDouble();
		tong = a + b;
		hieu = a - b;
		tich = a * b;
		thuong = a / b;
		phanDu = a % b;
		System.out.printf("Tong: %f \n",tong);
		System.out.printf("Hieu: %f \n",hieu);
		System.out.printf("Tich: %f \n",tich);
		System.out.printf("Thuong: %f \n",thuong);
		System.out.printf("Phan du: %f \n",phanDu);
	}

}
