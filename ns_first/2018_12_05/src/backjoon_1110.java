import java.util.Scanner;

public class backjoon_1110 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int next = 0;
		int front;
		int back;
		int sum;
		int count=0;
		next = n;
		while(true) {
				front = next/10;
				back = next%10;
				sum = front + back; //앞 + 뒤
				int sumback = sum%10;
				int newnum = back*10+sumback;
				if(n == newnum)
				{
					count++;
					break;
				}
				else
					next = newnum; 
				count++;
		}
		System.out.println(count);
	}
}
