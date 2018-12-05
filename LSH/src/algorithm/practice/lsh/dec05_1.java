package algorithm.practice.lsh;

import java.util.Scanner;

public class dec05_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = scanner.nextInt();

		scanner.close();

		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		
		int m = getMax(a);
		double average = (double)sum/m*100/n;

		System.out.println(average);
	}

	public static int getMax(int[] a) {
		int max = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] == 100) {
				max = a[i];
				break;
			}
			max = max > a[i] ? max : a[i];
		}
		return max;
	}
}
