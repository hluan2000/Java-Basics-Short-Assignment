package exercise1;

import java.util.Scanner;

public class SumAverageRunningInt {
	public static void main(String[] args) {
		int firstnum, lastnum, sum = 0;
		double average;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so dau tien cua day: ");
		firstnum = sc.nextInt();
		System.out.println("Nhap so cuoi cung cua day: ");
		lastnum = sc.nextInt();
		for (int i = firstnum; i <= lastnum; ++i) {
			sum += i;
		}
		average = sum / lastnum;
		System.out.println("Average = " + average);
	}
}
