package study;

import java.util.Scanner;

public class Exam1 {
	final static double oneH = 100.0;

	public static double result(int num, double max, double[] arr) {
		double result = 0;
		for (int i = 0; i < num; i++) {
			System.out.println((arr[i] * oneH / max));
			result += (arr[i] / max) * oneH;
		}
		return result / num;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double sum = 0;
		double max = 0;
		double[] arr = new double[num];
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextDouble();
			sum += arr[i];
			max = arr[i] > max ? arr[i] : max;
		}
		System.out.println(result(num, max, arr));
	}
}
