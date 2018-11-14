package study;

public class Test01 {

	public static int expressions(int num) {
		int count = 1;
		int sum = 0;
		int i = 1;
		int j = i;
		while (true) {
			sum += i;
			if (sum == num) {
				j++;
				count++;
				sum = 0;
				i = j;
				j = i;
			} else if (i == num) {
				j++;
				sum = 0;
				i = j;
				j = i;
			}
			i++;
			if (j * 2 > num) {
				break;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(expressions(10));
	}

}
