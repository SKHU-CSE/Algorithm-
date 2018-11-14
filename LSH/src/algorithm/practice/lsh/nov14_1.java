package algorithm.practice.lsh;

public class nov14_1 {

	public static int nextBigNumber(int n) {

		StringBuilder sb = new StringBuilder(Integer.toBinaryString(n));

		int len = sb.length();
		int lastOne = sb.lastIndexOf("1");
		int count = 0;

		for (int i = lastOne; i > 0; i--) {
			if (sb.charAt(i) == '1') {
				sb.replace(i, i + 1, "0");
				count += 1;
			} else {
				sb.replace(i, i + 1, "1");
				break;
			}
		}

		for (int j = len; j > len - count + 1; j--)
			sb.replace(j - 1, j, "1");

		return Integer.parseInt(sb.toString(),2);
	}

	public static void main(String[] args) {
		System.out.println(nextBigNumber(78));
	}
}