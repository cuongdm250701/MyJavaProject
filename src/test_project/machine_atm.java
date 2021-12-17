package test_project;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class machine_atm {
	public  static void main(String[] args) {
		int soTien;
		int[] danhSachMenhGia = {20000,50000,100000,200000,500000};
		String chuyenDoiArrIntToString = Arrays.toString(danhSachMenhGia);
		System.out.println("nhap vao so tien quy khach muon thuc hien");
		Scanner sc = new Scanner(System.in);
		soTien = sc.nextInt();
		// create stack
		Stack <Integer> s = new Stack<Integer>();
		System.out.println("quy khach vui long chon so loai menh gia mong muon\n");
		int soLoaiMenhGia;
		soLoaiMenhGia = sc.nextInt();
		for(int i = 1; i<= soLoaiMenhGia; i++) {
			System.out.printf("chon menh gia lan %d\t",i);
			int menhGia;
			menhGia = sc.nextInt();
			while(true) {
				if(!chuyenDoiArrIntToString.contains(Integer.toString(menhGia)) || menhGia <=10000) {
					System.out.println("khong co loai tien nay, vui long chon lai\t");
					menhGia = sc.nextInt();
				}else {
					s.push(menhGia);
					break;
				}
//				menhGia = sc.nextInt();
//				s.push(menhGia)
			}
		}
		
	}

}
