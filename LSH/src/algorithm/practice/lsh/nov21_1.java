package algorithm.practice.lsh;

import java.util.ArrayList;
import java.util.Scanner;

public class nov21_1 {

	public static void main(String[] args) {
		MyArrayStack myStack = new MyArrayStack();
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.print("값을 입력하세요:");
			myStack.push(scanner.nextLine());
			System.out.println(myStack.toString());
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("POP:");
			myStack.pop();
			//System.out.println(myStack.size);
			System.out.println(myStack.toString());
		}
	}
}

class MyStack extends ArrayList<Object> {

	public MyStack() {
	}

	public boolean push(Object obj) {
		try {
			this.add(obj);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean pop() {
		if (this.isEmpty()) {
			System.out.println("비어있는 스택");
			return false;
		}

		this.remove(this.size() - 1);
		return true;
	}

	@Override
	public String toString() {
		String s = "size:" + this.size() + "{";
		for (Object obj : this) {
			if (obj.equals(get(this.size() - 1))) {
				s += obj.toString();
			} else
				s += obj.toString() + ",";
		}
		s += "}";
		return s;
	}
}

class MyArrayStack {

	Object[] stack;
	int size;

	public MyArrayStack() {
		stack = new Object[30];
		size = 0;
	}

	public MyArrayStack(int size) {
		stack = new Object[size];
		size = 0;
	}

	public boolean push(Object obj) {
		if (stack.length <= size) {
			System.out.println("Full Stack!!");
			return false;
		}
		stack[size] = obj;
		size += 1;
		return true;
	}

	public boolean pop() {
		if (size <= 0) {
			System.out.println("Empty Stack!!");
			return false;
		}
		stack[size - 1] = null;
		size -= 1;
		return true;
	}

	@Override
	public String toString() {
		String s = "{";
		for (int i = 0; i < size - 1; i++) {
			s += stack[i] + ",";
		}
		if(size>0) s += stack[size - 1];
		s += "}";
		return s;
	}
}