import java.util.Scanner;

public class Queue {  //원형큐
	final static int LENGTH = 5;
	static int [] queue = new int[LENGTH];
	static int index =0;
	static int first=0;
	static int count =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		while(true) {
			System.out.println("종료:0  push:1  pop:2  show:3을 입력해주세요");
			int n = scan.nextInt();
			if(n==0) {
				System.out.println("exit!!!!");
				break;
			}
			switch(n) {
			case 1 :
				System.out.println("큐에 넣을값: ");
				int num = scan.nextInt();
				push(new Node1(num));
				break;

			case 2:
				System.out.print("out: ");
				int popnum =pop();  //pop값저장
				System.out.println();
				break;
			case 3:
				show();
				break;
			default:
				System.out.println("잘못입력하셧습니다 ");
			}
			System.out.println("frist: "+first+" index: "+index );
		}
	}
	static void push(Node1 node) {
		count++;
		if(count>LENGTH) {
			System.out.println("꽉차있습니다.");
			return;
		}

		System.out.println(node.data+"를 큐에넣었습니다.");

		if(index== LENGTH-1) {
			queue[index]=node.data;
			index=0;
		}
		else {
			queue[index++]=node.data;
		}
	}

	static int pop() {
		count--;
		System.out.println(queue[first]+"pop!!");
		int temp = queue[first] ;
		queue[first] = 0;

		if(first== LENGTH-1)
			first=0;
		else
			first++;
		return queue[temp];
	}

	static void show() {
		if( first<index) {
			for(int i = first; i<index; i++) {
				System.out.print(queue[i]+"  ");
			}
			System.out.println();
		}else {  // if(index <first)
			if(count==0)
				System.out.println("");
			else {

				for(int i = first; i<LENGTH; i++) {
					System.out.print(queue[i]+"  ");
				}
				for(int i = 0; i<index; i++) {
					System.out.print(queue[i]+"  ");
				}
				System.out.println();
			}
		}
	}
}

class Node1{
	int data;
	public Node1(int data) {
		this.data = data;
	}

}
