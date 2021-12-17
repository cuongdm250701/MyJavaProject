package buoi7_TH;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;  


public class practice_10 {
/*
 * Input: nhập vào số thập phân
 * Output: In ra số nhị phân tương ứng
 */
	public static void main(String[] args) {
		System.out.println("Nhập vào số bất kỳ\n ");
		int soBatKy;
		Scanner sc = new Scanner(System.in);
		soBatKy = sc.nextInt();
		Integer arr[] = {};
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arr));
		int soDu = 0;
		while(soBatKy>0) {
			System.out.printf("soBatKy: %d \n", soBatKy);
			soDu = soBatKy % 2;
			arrayList.add(soDu);  
			arr = arrayList.toArray(arr);
			soBatKy /= 2;
		}
		 
		System.out.println("Array after adding element: "+Arrays.toString(arr));
	}

}
