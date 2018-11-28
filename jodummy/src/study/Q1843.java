package study;

import java.util.ArrayList;
import java.util.List;

public class Q1843 {

	public static void main(String[] args) {
		int num = 6;
		less(num);
		measure(num);
	}

	private static void decimal(int num) {

	}

	private static void measure(int num) {
		int count = 0;
		List<Integer> list = new ArrayList<>();
		for (int j = 1; j <= num; j++) {
			if (num % j == 0) {
				list.add(j);
			}
		}
		int sum = 0;
		for (int i = 0; i <= list.size() / 2; i++) {
			for (int j = 0; j < list.size(); j++) {
				if (num % (list.get(i) + list.get(j)) == 0 && i <= j)
					count++;
			}
		}
		System.out.println(count);
	}

	public static void less(int num) {
		int i = 1;
		int j = 2;
		int count = 0;
		while (i <= (num / 2)) {
			if (i + j <= num)
				count++;
			j++;
			if (i + j > num) {

				i++;
				j = i + 1;
			}
		}
		System.out.println(count);
	}

}
