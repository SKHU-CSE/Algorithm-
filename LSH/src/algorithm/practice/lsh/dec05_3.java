package algorithm.practice.lsh;

import java.util.Scanner;

public class dec05_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		scanner.close();

		int count = 0;
		int newNum = n;
		while (true) {
			int x1 = newNum / 10;
			int x2 = newNum % 10;

			int x3 = x1 + x2;
			count++;

			newNum = x2 * 10 + (x3 % 10);
			// System.out.println("count: " + count + ", newInt: " + newNum);

			if (newNum == n)
				break;
		}
		System.out.println(count);
	}
}
