package algorithm.practice.lsh;

import java.util.Scanner;

public class nov21_2 {

	public static void main(String[] args) {

		MyQueue myQue = new MyQueue(5);
		System.out.println(myQue);
		while (true) {
			System.out.print("push:1, pop:2, end:3 입력하세요 >>> ");
			Scanner scanner = new Scanner(System.in);
			switch (scanner.nextInt()) {
			case 1:
				System.out.print("push 할 값 >>> ");
				String obj = scanner.next();
				myQue.push(obj);
				System.out.println(myQue);
				System.out.println(myQue.getCount());
				break;
			case 2:
				System.out.print("pop >>> ");
				myQue.pop();
				System.out.println(myQue);
				System.out.println(myQue.getCount());
				break;
			case 3:
				System.out.println("종료합니다.");
				return;
			}
			System.out.println("start = "+myQue.getStart() +", last = "+ myQue.getLast());
		}
	}

}

class MyQueue {
	private Object[] queue;
	private int lastIndex;
	private int startIndex;
	private int count;

	// 길이 미지정
	public MyQueue() {
		queue = new Object[100];
		lastIndex = 0;
		startIndex = 0;
		count = 0;
	}

	// 길이 지정
	public MyQueue(int size) {
		queue = new Object[size];
		lastIndex = 0;
		startIndex = 0;
		count = 0;
	}

	// 시작 인덱스 구하기 (pop위치)
	public int getStart() {
		return startIndex;
	}

	// 마지막 인덱스 구하기 (push위치)
	public int getLast() {
		return lastIndex;
	}

	// 갯수 구하기
	public int getCount() {
		return count;
	}

//	// 길이 구하기
//	public int getLength() {
//		if (startIndex <= lastIndex)
//			return lastIndex - startIndex + 1;
//		return (queue.length - startIndex) + lastIndex + 1;
//	}

	// push
	public boolean push(Object obj) {
		if (queue.length == this.getCount()) {
			System.out.println("Full Queue!!");
			return false;
		}
		queue[lastIndex] = obj;
		if (lastIndex == queue.length - 1)
			lastIndex = 0;
		else
			lastIndex++;
		count++;
		return true;
	}

	public Object pop() {
		if (this.getCount() > 0) {
			Object obj = queue[startIndex];
			queue[startIndex] = null;
			if (startIndex == queue.length - 1)
				startIndex = 0;
			else
				startIndex++;
			count--;
			return obj;
		}
		System.out.println("Empty Queue!!");
		return null;
	}

	@Override
	public String toString() {
		String s = "{";
		if(this.getCount()==0) return "{}";
		s+=queue[startIndex];
		if (startIndex < lastIndex) {
			for (int i = startIndex+1; i < lastIndex; i++) 
				s += ","+queue[i];
		}
		else {
			for(int i = startIndex+1; i <queue.length;i++)
				s += ","+queue[i];
			for(int j = 0; j<lastIndex ; j++)
				s+=","+queue[j];
		}
		s+="}";
		
		return s;
	}
}
