package algorithm.practice.lsh;

import java.util.Scanner;

public class dec05_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int c = scanner.nextInt();
		for (int i = 0; i < c; i++) {
			int n = scanner.nextInt();
			
			int[] score = new int[n];
			for (int j = 0; j < n; j++) {
				score[j] = scanner.nextInt();
			}
			
			System.out.println(String.format("%.3f%s", overAvgStudents(score) * 100, "%"));
		}
		scanner.close();

	}

	public static double getAvg(int[] a) {
		int sum = 0;
		for (int i : a)
			sum += i;

		return (double) sum / a.length;
	}

	public static double overAvgStudents(int[] a) {
		int count = 0;
		for (int i : a) {
			if (i > getAvg(a))
				count++;
		}
		return (double) count / a.length;
	}

}