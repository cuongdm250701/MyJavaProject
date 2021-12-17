package study;

public class Staff {
	public int id;
	public String firstName;
	public String lastName ;
	public int salaryDay;
	public void setId(int id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFullName() {
		return this.lastName + this.lastName;
	}
	public void setSalary(int salaryDay) {
		this.salaryDay = salaryDay;
	}
	public int getSalaryMonthly() {
		return + this.salaryDay * 25;
	}
	public int getSalaryYearly() {
		return getSalaryMonthly() * 12;
	}
	public void showInformation() {
		System.out.println("id:" + this.id);
		System.out.println("fullName:" + getFullName());
		System.out.println("SalaryYearly:" + getSalaryYearly());
		System.out.println("SalaryDay:" + this.salaryDay);
		System.out.println("SalaryMonthly:" + getSalaryMonthly());
	}
}
