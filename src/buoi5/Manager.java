package buoi5;

public class Manager extends Employee{
	public float salaryResponsibility;
	public void setSalaryResponsibility(float salaryResponsibility) {
		this.salaryResponsibility = salaryResponsibility;
	}
	
	
	public float calculateSalary() {
		return super.calculateSalary() + this.salaryResponsibility;
	}
	
	public void showInfomation() {
		super.showEmployee();
		System.out.println("salaryResponsibility:" + this.salaryResponsibility);
		System.out.println("calculateSalary:" + calculateSalary());
	}
}
