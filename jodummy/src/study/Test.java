package study;

public class Test {
	// 1차 답안
	public static int nextBigNumber(int n) {
		// 이진수 변환 / 1카운팅
		return oneCounting(twoTen(n));
	}

	// 이진수 변환
	public static String twoTen(int n) {
		return Integer.toBinaryString(n);
	}

	// 1카운팅
	public static int oneCounting(String n) {
		int count = 0;
		for (int i = 0; i < n.length(); i++) {
			if (Integer.parseInt(n.substring(i, i + 1)) == 1) {
				count++;
			}
		}
		return count;
	}

	// 다음 숫자 / 정답 출력 함수
	public static int nextNumber(int n) {
		int result = 0;
		for (int i = n; i < 1000000; i++) {
			if (nextBigNumber(i) == nextBigNumber(n) && i != n) {
				result = i;
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int n = 99898;
		System.out.println(nextNumber(n));
	}
}
