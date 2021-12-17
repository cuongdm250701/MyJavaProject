package study;

public class Account {
	public int id;
	public String name;
	public int balance;
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return this.id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getBalance() {
		return this.balance;
	}
	public void credit(int amount) {
		this.balance += amount;
	}
	public void debit(int amount) {
		this.balance -= amount;
	}
	public void transferTo(Account account, int amount) {
		account.balance = account.balance + amount;
	}
	public void showInfomation() {
		System.out.println("id:" + getId());
		System.out.println("name:" + getName());
		System.out.println("balance:" + getBalance());
	}
}
