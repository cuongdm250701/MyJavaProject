package buoi5;

public class Employee extends Persons {

	public float salary;
	public int coefficient;
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public void setCoefficient(int coefficient) {
		this.coefficient = coefficient;
	}
	
	public float calculateSalary() {
		return this.salary * this.coefficient;
	}
	
	public void showEmployee() {
		super.showInfomation();
		System.out.println("salary:" + this.salary);
		System.out.println("coefficient:" + this.coefficient);
		System.out.println("calculateSalary:" + calculateSalary());
	}
	
}
