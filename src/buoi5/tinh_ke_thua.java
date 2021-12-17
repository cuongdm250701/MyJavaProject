package buoi5;

public class tinh_ke_thua {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("cuong");
		employee.setCode("160308");
		employee.setBirthday(20);
		employee.setSex("nam");
		employee.showEmployee();
		System.out.println("=========================");
		Manager manager = new Manager();
		manager.showInfomation();
		System.out.println("=========================");
		Student student = new Student();
		student.showInfomation();
		System.out.println("=========================");
		Programer programer = new Programer();
		programer.showInfomation();
	}
}

class Persons{
	public String name;
	public String code;
	public int birthday;
	public String sex;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getName() {
		return this.name;
	}
	
	public String getCode() {
		return this.code;
	}
	
	public int getBirthday() {
		return this.birthday;
	}
	
	public String getSex() {
		return this.sex;
	}
	
	public void showInfomation() {
		System.out.println("name:" + getName());
		System.out.println("code:" + getCode());
		System.out.println("birthday:" + getBirthday());
		System.out.println("sex:" + getSex());
	}
}

