package study;

public class SetDate {
	public int day;
	public int month;
	public int year;
	public int getDay() {
		return this.day;
	}
	public int getMonth() {
		return this.month;
	}
	public int getYear() {
		return this.year;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void showDate() {
		System.out.println("year:" + getYear());
		System.out.println("month:" + getMonth());
		System.out.println("day:" + getDay());
		System.out.println("day-month-year:" + getYear() + getMonth() + getDay());
	}
}
