import java.util.ArrayList;
import java.util.Scanner;

public class Stack {

	static ArrayList<Node> stack = new ArrayList<Node>();

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
				System.out.println("스텍에 넣을값: ");
				int num = scan.nextInt();
				push(new Node(num));
				break;

			case 2:
				System.out.println("out ");
				pop();
				break;
			case 3:
				show();
				break;
			default:
				System.out.println("잘못입력하셧습니다 ");
			}

		}
	}

	public static void push(Node node) {
		stack.add(node);
		System.out.println(node.num+"이 쏘옥");
	}
	public static void pop() {
		if(!stack.isEmpty())
			stack.remove(stack.size()-1);
		else
			System.out.println("스텍이비어있습니다.");
	}
	public static void show() {
		for(int i=0; i<stack.size(); i++) {
			System.out.print(stack.get(i).num+" ");
		}
	}

}

class Node{
	int num;

	public Node(int num) {
		this.num = num;
	}

}
