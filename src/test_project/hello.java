package test_project;
import java.util.Scanner;
public class hello {
	public static void main(String[] args) {
		 int chieuDai;
		 int chieuRong;
		 System.out.println("hay nhap chieu dai cua hinh chu nhat: ");
		 Scanner sc = new Scanner(System.in);
		 chieuDai = sc.nextInt();
		 System.out.println("hay nhap chieu rong cua hinh chu nhat: ");
		 chieuRong = sc.nextInt();
		 sc.close();
		 System.out.printf("Chieu dai va chieu rong hinh chu nhat ban vua nhap la: %d va %d", chieuDai,chieuRong);
	}
}
