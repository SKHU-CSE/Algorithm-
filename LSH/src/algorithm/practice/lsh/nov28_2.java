package algorithm.practice.lsh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class nov28_2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		long start = System.currentTimeMillis();
		
		List<Integer> prime = conditionC(num);

		int m_count = 0;
		int p_count = 0;

		for (int i = 0; i <= num; i++) {
			for (int j = i; j <= num; j++) {

				int res = i + j;
				if (i != 0 && num % res == 0 && num % i == 0 && num % j == 0)
					m_count++;

				if (i < prime.size() && j < prime.size() && prime.contains(prime.get(i) + prime.get(j)))
					p_count++;
			}
		}

		System.out.println(conditionA(num));
		System.out.println(m_count);
		System.out.println(p_count);
		scanner.close();

		long end = System.currentTimeMillis();
		System.out.println("실행 시간 : " + (double) (end - start) / 1000 + "(s)");
	}

	// 조건 A
	public static int conditionA(int num) {
		int count = 0;
		for (int i = 3; i <= num; i++) {
			if (i % 2 == 0)
				count += i / 2 - 1;
			else
				count += i / 2;
		}
		return count;
	}

	// 조건 C
	public static List<Integer> conditionC(int num) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		for (int i = 3; i <= num; i++) {
			boolean isPrime = true;
			for (int j = 0; j < list.size(); j++)
				if (i % list.get(j) == 0) {
					isPrime = false;
					break;
				}
			if (isPrime)
				list.add(i);
		}
		return list;
	}

}
