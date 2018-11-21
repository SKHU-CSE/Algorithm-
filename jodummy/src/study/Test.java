package study;

public class Test {
	// 1�� ���
	public static int nextBigNumber(int n) {
		// ������ ��ȯ / 1ī����
		return oneCounting(twoTen(n));
	}

	// ������ ��ȯ
	public static String twoTen(int n) {
		return Integer.toBinaryString(n);
	}

	// 1ī����
	public static int oneCounting(String n) {
		int count = 0;
		for (int i = 0; i < n.length(); i++) {
			if (Integer.parseInt(n.substring(i, i + 1)) == 1) {
				count++;
			}
		}
		return count;
	}

	// ���� ���� / ���� ��� �Լ�
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
