package Assignment_101;

import java.util.Scanner;

public class ArithmeticExercise2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		int tong = 0, hieu = 0, tich = 0, du = 0;
		double thuong = 0;
		System.out.println("Nhap x:");
		x = sc.nextInt();
		System.out.println("Nhap y:");
		y = sc.nextInt();
		tong = x + y;
		System.out.println(" " + x + " + " + y + "= " + tong);
		hieu = x - y;
		System.out.println(" " + x + " - " + y + "= " + hieu);
		tich = x * y;
		System.out.println(" " + x + " * " + y + "= " + tich);
		if (x == 0) {
			System.out.println(" " + x + " / " + y + "= "+ thuong);
		} else {
			thuong = x / y;
			System.out.println(" " + x + " / " + y + "= " + thuong);
		}
		du = x % y;
		System.out.println(" " + x + " % " + y + "= " + du);
	}
}
