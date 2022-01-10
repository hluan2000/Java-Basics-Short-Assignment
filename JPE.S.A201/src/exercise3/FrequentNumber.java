package exercise3;

import java.util.Scanner;

public class FrequentNumber {
	static int frequency(int a[], int n, int x)
    {
        int count = 0;
        for (int i=0; i < n; i++)
        if (a[i] == x)
            count++;
        return count;
    }
	 public static void main(String[] args) {
		 
	        int n,targetNumber;
	        Scanner scanner = new Scanner(System.in);
	        do {
	            System.out.println("Nhap so phan tu cua day: ");
	            n = scanner.nextInt();
	        } while (n < 0);
	    
	        int array[] = new int[n];

	        System.out.println("Nhap cac phan tu cua day: ");
	        for (int i = 0; i < n; i++) {
	            System.out.print("A[" + i + "] : ");
	            array[i] = scanner.nextInt();
	        }
	        System.out.print("Phan tu can xet: ");
	        targetNumber = scanner.nextInt();
	        System.out.print("Amount of frequence: ");
	        System.out.print(frequency(array, n, targetNumber));
	        System.out.println();
	        for (int i = 0; i < n; i++) {
                if (array[i] == targetNumber)
                System.out.println(i + " ");
            }
	    }
}
