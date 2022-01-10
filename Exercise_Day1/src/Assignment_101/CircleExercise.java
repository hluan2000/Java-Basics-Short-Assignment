package Assignment_101;

import java.util.Scanner;

public class CircleExercise {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Radius;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ban kinh hinh tron: ");
		Radius = sc.nextDouble();
		System.out.println(Radius * 2 * Math.PI);
		System.out.println(Radius * Radius * Math.PI);
	}
}
