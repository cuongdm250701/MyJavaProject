package list_practice_base;
import java.util.Scanner;
import java.time.YearMonth;

public class practice_4 {

	public static void main(String[] args) {
		int day;
		int month;
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao ngay");
		day = sc.nextInt();
		System.out.println("nhap vao thang");
		month = sc.nextInt();
		System.out.println("nhap vao nam");
		year = sc.nextInt();
		int amountDays = 0;
		int daysInMonth;
		if(month == 1) {
			amountDays += day;
		}else {
			for(int i = 1; i <= month - 1; i++) {
				YearMonth yearMonthObject = YearMonth.of(year, i);
				 daysInMonth = yearMonthObject.lengthOfMonth();
				amountDays += daysInMonth;
			}
			amountDays += day;
		}
		
		System.out.printf("ngay thu %d trong nam",amountDays);
		
	}

}
