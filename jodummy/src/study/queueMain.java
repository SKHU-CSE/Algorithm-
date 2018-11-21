package study;

public class queueMain {
	public static void main(String[] args) {
		queue q = new queue(3);

		q.put(10);
		q.put(8);
		q.put(1);
		System.out.println(q.toString());
		q.pop();
		System.out.println(q.toString());
		q.pop();
		System.out.println(q.toString());
		q.put(10);
		q.put(8);
		System.out.println(q.toString());
	
				
	}

}
