package list_practice_base;
import java.util.Scanner;

public class practice_2 {
	
	public static int caculateSum(int n) {
		int sum = 0;
		for(int i =1; i <= n; i++) {
			sum += (i)/i+1;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao n\t");
		int n;
		n = sc.nextInt();
		System.out.printf("tong: %d", caculateSum(n));

	}

}
