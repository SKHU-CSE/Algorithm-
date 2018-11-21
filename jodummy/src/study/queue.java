package study;

import java.util.Arrays;

public class queue {
	private static int size;
	private static int[] arr;
	private int count = 0;

	public queue() {
		this.size = 10;
		this.arr = new int[10];
	}

	public queue(int size) {
		this.size = size;
		this.arr = new int[size];
	}

	public void put(int num) {
		if (size == count && count > 0 ) {
			System.out.println("값을 넣을 수 없다.");
		} else {
			arr[count] = num;
			count++;
		}
	}

	public void pop() {
		this.arr[0] = 0;
		int[] arrClon = new int[this.size];
		System.arraycopy(arr, 1, arrClon, 0, arr.length - 1);
		this.arr = arrClon;
		count--;

	}

	@Override
	public String toString() {
		return Arrays.toString(arr);
	}

}
