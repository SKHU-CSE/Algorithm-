package algorithm.practice.lsh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class dec_26_1 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt(); // 테스트 케이스

		for (int i = 0; i < T; i++) {

			int N = scanner.nextInt(); // 외계 우주선 총 수 (1~10)
			int M = scanner.nextInt(); // 미사일 종류 (1~10)
			int B = scanner.nextInt(); // 외계 우주선 방어력 (1~1000)

			List<Integer> list = new ArrayList<>();
			for (int j = 0; j < M; j++) {
				int power = scanner.nextInt();
				int count = scanner.nextInt();

				for (int k = 0; k < count; k++) 
					list.add(power);
			}
			
			int front=0;
			int sum = 0;
			int count = 0;
			for (int k = 0; k < N; k++) {
				//N개의 미사일을 발사 
				sum += list.get(k);
				count ++;
			}

			if (sum < N * B) {	//N개로는 모자라면 
				for (int k = N; k < list.size(); k++) { // 있는대로 다 쏴본다.
					if (sum > N * B){
						sum-=list.get(front++);
						if(sum<N*B)
							sum+=list.get(front-1);
					}
					else if(count<2*N) {		// 2N개 까지는 다 쏠 수 있음.
						sum += list.get(k);
						count++;
					}
					else {		//2N개 넘어도 안되면 앞에꺼 빼가면서 더하
						sum -=list.get(front++);
						sum+= list.get(k);
					}
					
				}
			}
			if (sum >= N * B){
				System.out.printf("#%d %d\n", i+1, sum);
			}
			else {
				System.out.printf("#%d %d\n", i+1, -1);
			}

		}
		scanner.close();
	}

	// O+O=B가 되는 것을 구하라? (0도 가능)
	// (가장 큰 값 + 가장 작은값) 먼저 구해보기
	// 그게 방어력 이하면 (가장큰값 + 그다음 작은값) 순서로 구해보기!

	// 전체 발사 미사일 수는 N보다 크고 2*N보다 작음
	// 전체 발사 미사일 위력의 합은 M*B보다 크다.

}
