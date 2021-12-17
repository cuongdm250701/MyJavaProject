package buoi5;

public class Programer extends Student {
	public int experience;
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public void showInfomation() {
		super.showInfomation();
		System.out.println("experience:" + this.experience);
	}
}
