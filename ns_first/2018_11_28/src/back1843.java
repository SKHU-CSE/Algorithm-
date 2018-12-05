import java.util.ArrayList;
import java.util.Scanner;

public class back1843 {
	static ArrayList<Integer> al = new ArrayList<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 1;
		int y = 2;
		int count[] = new int[3];

		Scanner scan = new Scanner(System.in);

		System.out.print("해의개수제약조건: ");
		int n = scan.nextInt();

		for (int i = 1;;) {

			System.out.println("a결과: " + i + ", " + y++);
			if (y == 6) {
				i++;
				y = i + 1;
			}
			count[0]++;
			if (count[0] == 6)
				break;
		}

		System.out.println("제약조건 A: " + count[0]);

		int z = 1;
		for (int i = 1; i < n;) {

			// i+z
			if (n % i == 0) {
				if (n % z == 0) {
					if (n % (i + z) == 0) {
						count[1]++;
						System.out.println("B: " + i + "," + z);
					}
				}
			}
			z++;
			if (z == n) {
				i++;
				z = i;
			}
		}

		System.out.println("제약조건 B: " + count[1]);

		sosu(n);

		int j = 0;
		for (int i = 0;;) {

			if (al.indexOf((al.get(i) + al.get(j))) != -1) {
				count[2]++;
				System.out.println("제약조건 C:" + al.get(i) + ", " + al.get(j));
				i++;
			}
			j++;
			if (j == al.size()) {
				i++;
				j = i + 1;
			}
			if(i == al.size()-1)
				break;
		}
		
		System.out.println("c: "+count[2]);
		
		
	}

	static void sosu(int a) {
		boolean check = false;

		for (int i = 2; i <= a; i++) {
			check = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					check = false; // 소수아님
					break;
				}
			}
			if (check) {
				al.add(i);
				System.out.println("소수" + i);
			}
		}

	}

}
