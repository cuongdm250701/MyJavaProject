package list_practice_base;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class practice_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("nhap vao so nguyen n: \t");
		n = sc.nextInt();
		int surplus;
		List<Integer> myList = new ArrayList<Integer>();
		List<Integer> binary = new ArrayList<Integer>();
		while(n>0) {
			surplus = n % 2;
			myList.add(surplus);
			n = (int) Math.ceil(n/2);
		}
		System.out.println("binary\t:");
//		System.out.println(myList.get(7)+1);
		for(int i = myList.size()-1; i >= 0; i--) {
			binary.add(myList.get(i));
		}
		System.out.println(binary);
	}

}
