package buoi4;

public class learn_overloading {
	public  static void main(String[] args) {
		Circle circle = new Circle();
		Circle circle2= new Circle(3.4,"red");
		circle.showInfo();
		circle2.showInfo();
		
		Rectangle rectangle = new Rectangle();
		rectangle.showInfo();
		Rectangle rectangle2 = new Rectangle(30,10);
		rectangle2.showInfo();
		
		Employee employee = new Employee();
		employee.showInfo();
		
	}


}

class Circle {
	public double radious;
	public String color;
	public Circle() {// tao constructor
		this.radious = 10;
		this.color = "red";
	}
	public Circle(double radious) {
		this.radious = radious;
		this.color = "red";
	}
	public Circle(double radious, String color) {
		this.radious = radious;
		this.color = color;
	}
	public void showInfo() {
		System.out.println("radious:" + this.radious);
		System.out.println("color:" + this.color);
	}
}

class Rectangle {
	public int length;
	public int width;
	public Rectangle() {
		this.length = 30;
		this.width = 10;
	}
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	public void showInfo() {
		System.out.println("length:" + this.length);
		System.out.println("width:" + this.width);
	}
}

class Employee{
	public int id;
	public String firstName;
	public String lastName;
	public double salaryMonthly ;
	public Employee() {
		this.id = 1;
		this.firstName ="Cuong";
		this.lastName = "Manh";
		this.salaryMonthly = 30000;
	}
	public Employee(int id, String firstName, String lastName, double salaryMonthly) {
		this.id = id;
		this.firstName=firstName;
		this.lastName = lastName;
		this.salaryMonthly= salaryMonthly;
	}
	public int getId() {
		return this.id;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public String getFullName() {
	   return this.firstName + this.lastName;
	}
	public double getSalaryMonthly() {
		return this.salaryMonthly;
	}
	public double getSalaryYearly() {
		return this.salaryMonthly * 12;
	}
	public void showInfo() {
		System.out.println("id:" + this.id);
		System.out.println("firstName:" + this.firstName);
		System.out.println("lastName:" + this.lastName);
		System.out.println("FullName:" + getFullName());
		System.out.println("salaryMonthly:" + this.salaryMonthly);
		System.out.println("salaryYearly:" + getSalaryYearly());
	}
}


