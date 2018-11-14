package algorithm;

public class nature {

	public int expressions(int num) {
		int answer = 0;
		int sum;
		for (int i = 1; i <= num; i++) {
			sum = i;
			for (int j = i + 1; j <= num; j++) {
				sum += j;
				if (sum >= num) {
					if (sum == num)
						answer++;
					break;
				}
			}
			if (i == num)
				answer++;
		}

		return answer;
	}

	public static void main(String args[]) {
		nature expressions = new nature();
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println(expressions.expressions(15));
	}
}
