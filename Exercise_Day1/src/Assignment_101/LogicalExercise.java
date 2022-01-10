package Assignment_101;

import java.util.Scanner;

public class LogicalExercise {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so thu nhat: ");
		num1 = sc.nextInt();
		System.out.println("Nhap so thu hai: ");
		num2 = sc.nextInt();
		if (num1 != num2) {
			System.out.println(" " + num1 + " != " + num2);
			if(num1<num2) {
				System.out.println(" " + num1 + " < " + num2);
				System.out.println(" " + num1 + " <= " + num2);
			}
			else if(num1>num2) {
				System.out.println(" " + num1 + " > " + num2);
				System.out.println(" " + num1 + " >= " + num2);
			}
		}
		else
			System.out.println(" " + num1 + " = " + num2);
	}
}
