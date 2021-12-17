package buoi5;

public class Student extends Persons {

	public String code;
	public void setCode(String code) {
		this.code = code;
	}
	public void showInfomation() {
		super.showInfomation();
		System.out.println("code:" + this.code);
	}
}
