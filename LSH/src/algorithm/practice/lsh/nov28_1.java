package algorithm.practice.lsh;

import java.util.ArrayList;
import java.util.Scanner;

public class nov28_1 {

	public static void main(String[] args) {
//		long start = System.currentTimeMillis();
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		System.out.println(conditionA(num));
		System.out.println(conditionB(num));
		System.out.println(conditionC(num));

		scanner.close();
		
//        long end = System.currentTimeMillis();
//        System.out.println("실행 시간 : " + (double)(end-start)/1000 + "(s)");
	}

	// 조건 A
	public static int conditionA(int num) {
		int count = 0;
		for (int i = 3; i <= num; i++) {
			if (i % 2 == 0) count += i / 2 - 1;
			else count += i / 2;
		}
		return count;
	}
	
	// 조건 B
	public static int conditionB(int num) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				list.add(i);
		}
		
		//System.out.println("약수는 "+list.toString());
		
		int count = 0;
		for (int j = 0; j < list.size(); j++) 
			for (int k = j; k < list.size(); k++)
				if (list.contains(list.get(j) + list.get(k)))
					count++;
		return count;
	}

	// 조건 C
	public static int conditionC(int num) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		for (int i = 3; i <= num; i++) {
			boolean isPrime = true;
			for (int j = 0; j < list.size(); j++)
				if (i % list.get(j) == 0) {
					isPrime = false;
					break;
				}
			if (isPrime) list.add(i);
		}
		
		//System.out.println("소수는 "+list.toString());
		
		int count = 0;
		for (int j = 0; j < list.size(); j++) 
			for (int k = j; k < list.size(); k++)
				if (list.contains(list.get(j) + list.get(k)))
					count++;
		return count;
	}
}
