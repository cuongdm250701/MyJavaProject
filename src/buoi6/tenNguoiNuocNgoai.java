package buoi6;

public class tenNguoiNuocNgoai extends tenNguoiViet {
	public tenNguoiNuocNgoai(String firstName, String lastName) {
		super(firstName,lastName);
	}
	public void showFullName() {
		super.showFullName();
		System.out.println("fullName:" + this.firstName + this.lastName);
	}
}
