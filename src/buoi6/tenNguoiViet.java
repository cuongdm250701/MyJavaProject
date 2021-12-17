package buoi6;

public class tenNguoiViet {
	public String firstName;
	public String lastName;
	public tenNguoiViet(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	public void showFullName() {
		System.out.println("fullName:" + this.firstName + this.lastName);
	}
}
