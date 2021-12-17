package buoi_8;
import java.io.*;
import java.util.Scanner;
public class Person {
	String full_name;
	String address;
	int birtYear;
	
	public void defulautInput(String full_name, String address, int birtYear) {
		full_name = full_name;
		address = address;
		birtYear = birtYear;
	}
	
	public static String inputString() {
		String s;
		DataInputStream stream = new DataInputStream(System.in);
		try {
			s = stream.readLine();
			s = s.trim();
			s = s.toLowerCase();
		}catch(IOException e){
			s="";
		}
		return s;	
	}
	
	public void inputInfo() {
		String str;
		System.out.printf("full name: \n");
		str = inputString();
		this.full_name = str;
		System.out.printf("address: \n");
		str = inputString();
		this.address = str;
		System.out.printf("birtYear: \n");
		Scanner sc = new Scanner(System.in);
		int birtYear = sc.nextInt();
		this.birtYear = birtYear;
		sc.close();
	}
	public void outputInfo() {
		System.out.println("full name: "+ this.full_name);
		System.out.println("address: " + this.address);
		System.out.println("birth year: "+ this.birtYear);
	}
}
