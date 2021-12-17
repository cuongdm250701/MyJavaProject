package buoi7_TH;
import java.util.Scanner;

public class practice_1 {

	public static void main(String[] args) {
		System.out.println("xin chao");
		 Scanner sc = new Scanner(System.in);
		 String character;
		 System.out.println("nhap vao chuoi bat ky: ");
		 character = sc.nextLine();
		 
		 System.out.printf("xau vua nhap la: %s",character);
		 // bai 3 (buoi TH1)
		 int a;
		 int b;
		 int sum;
		 System.out.println("nhap vao so a: ");
		 
		 a = sc.nextInt();
		 System.out.println("nhap vao so b: ");
		 b = sc.nextInt();
		 sc.close();
		 sum = a + b;
		 System.out.printf("tong cua 2 so la %d",sum);
		 

	}

}
