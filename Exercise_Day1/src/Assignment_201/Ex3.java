package Assignment_201;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, num4,num5,S=0;
		System.out.println("Nhap so thu nhat:");
		num1 = sc.nextInt();
		System.out.println("Nhap so thu hai:");
		num2 = sc.nextInt();
		System.out.println("Nhap so thu ba:");
		num3 = sc.nextInt();
		System.out.println("Nhap so thu tu:");
		num4 = sc.nextInt();
		System.out.println("Nhap so thu nam:");
		num5 = sc.nextInt();
		S=num1+num2+num3+num4+num5;
		System.out.println("S = "+S);
	}
}
