package buoi7_TH;

import java.util.Scanner;

public class practice_2 {
/*
 * Input: số cạnh của đa giác, độ dài của từng cạnh
 * Ouput: chu vi của đa giác đó
 */
	public static void main(String[] args) {
		int soCanh;
		System.out.println("nhập vào số cạnh của đa giác:\n");
		Scanner sc = new Scanner(System.in);
		soCanh = sc.nextInt();
		int canh;
		int chuVi = 0;
		for(int i =1; i<= soCanh; i++) {
			System.out.printf("nhập vào cạnh thứ %d của đa giác:\n",i);
			canh = sc.nextInt();
			System.out.printf("cạnh thứ %d của đa giác là: %d\n",i,canh);
			chuVi += canh;
		}
		System.out.printf("chu vi của đa giác là %d",chuVi);
		
	}

}
