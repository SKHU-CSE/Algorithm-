package study;

import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			int count = sc.nextInt();
			double sum = 0;
			double[] doti = new double[count];
			for (int j = 0; j < count; j++) {
				doti[j] = sc.nextDouble();
				sum += doti[i];
			}
			int result = 0;
			for (int j = 0; j < count; j++) {
				System.out.println(((double) count / sum));
				if (((double) sum / count) <= doti[j]) {
					++result;
				}
			}
			System.out.println(count + " " + ((double) result / count) * 100 + " " + result);
			System.out.printf("%.3f%c\n", ((double) result / count) * 100, '%');
		}

	}
}
