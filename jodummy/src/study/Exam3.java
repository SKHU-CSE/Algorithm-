package study;

import java.util.Scanner;

public class Exam3 {
	public static void result(int i) {
		int sum = i;
		int result = 0;
		while (true) {
			int swich1 = 0;
			if (sum < 10) {
				sum = ((sum % 10) * 10) + (sum % 10);
				result++;
			} else {
				swich1 = (sum / 10) + (sum % 10);
				sum = ((sum % 10) * 10) + swich1 % 10;
				result++;
			}
			if (sum == i)
				break;
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		result(num);
	}
}
