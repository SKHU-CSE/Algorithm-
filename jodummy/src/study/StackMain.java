package study;

public class StackMain {

	public static void main(String[] args) {
		stack s = new stack(5);
		s.put(1);
		s.put(3);
		s.put(4);
		s.put(2);
		System.out.println(s.toString());
		s.pop();
		System.out.println(s.toString());
		s.put(5);
		System.out.println(s.toString());
		s.pop();
		System.out.println(s.toString());
		s.pop();
		System.out.println(s.toString());
		s.put(1);
		s.put(3);
		s.put(4);
		System.out.println(s.toString());
		s.put(3);

	}
}
