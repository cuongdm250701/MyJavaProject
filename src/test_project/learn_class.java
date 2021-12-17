package test_project;

public class learn_class {

	public static void main(String[] args) {
		Student firstStudent = new Student(); // khoi tao doi tuong
		firstStudent.name = "Manhcuong"; // gan value cho property
		firstStudent.maSv = "At160308";
		firstStudent.age = 20;
		firstStudent.setName("cuong");
		firstStudent.setMaSv("at160308");
		firstStudent.setAge(20);
		System.out.println("name-------:" + firstStudent.getName() );
		System.out.println("masv:" + firstStudent.maSv);
		System.out.println("age: " + firstStudent.age);
		firstStudent.StudentInfo();
		
		Cat catDoraemon = new Cat();
		catDoraemon.setName("doraemon");
		catDoraemon.setCountry("tokyo");
		catDoraemon.setAge(100);
		catDoraemon.showInfo();
	}
	

}
// khai bao doi tuong trong mot file thi can bo public, khai bao rieng mot file thi de public
// khuyen khich nen khai bao mot class rieng ra mot file
class Student{
	// tao constructor
	public Student() {
		this.name= "KMA";
		this.age = 20;
	}
	public Student(String studentName, String maSv, int birthYear) {
		this.name = studentName;
		this.maSv = maSv;
		this.age = birthYear;
	}
	public String name; // define thuoc tinh trong class
	public String maSv;
	public int age;
	public void setName(String name) { // khai bao kieu khong tra ve, dung de xu ly process
	    this.name = name; // this dung de tham chieu toi bien instance cua class hien tai
	}
	public void setMaSv(String maSv) {
		this.maSv = maSv;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() { // khai bao kieu tra ve, lay gia tri tra ve
		return this.name;
	}
	public String getMaSv() {
		return this.maSv;
	}
	public int getAge() {
		return this.age;
	}
	
	public void StudentInfo() { // hien thi cac gia tri tra ve
		System.out.println("name:" + this.name );
		System.out.println("masv:" + this.maSv);
		System.out.println("age: " + this.age);
	}
	public void StudentInfo(String className) { // overloading duoc phep goi them mot method giong ten da co nhung khac tham so truyen vao
		System.out.println("lop cua ban la:" + className);
		System.out.println("name:" + this.name );
		System.out.println("masv:" + this.maSv);
		System.out.println("age: " + this.age);
	}
	
}

class Cat {
	public String name;
	public String country;
	public int age;
	public void setName(String name) {
		this.name = name;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public String getCountry() {
		return country;
	}
	public int getAge() {
		return age;
	}
	public void showInfo() {
		System.out.println("name:" + this.name);
		System.out.println("country:" + this.country);
		System.out.println("age: " + this.age);
	}
//	Calendar.getInstance().get(Calendar.YEAR); ham lay nam hien tai
}

