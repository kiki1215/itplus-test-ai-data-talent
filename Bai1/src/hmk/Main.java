package hmk;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so tai khoan: ");
		int n = Integer.parseInt(sc.nextLine());
        QLTaiKhoan ql = new QLTaiKhoan();
        ql.nhapTaiKhoan(sc,n);
        System.out.print("\nNhap tu khoa tim kiem: ");
        String keyword = sc.nextLine();
        ql.showTop3(keyword);
        sc.close();
	}
}
