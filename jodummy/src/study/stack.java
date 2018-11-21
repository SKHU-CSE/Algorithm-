package study;

import java.util.Arrays;

public class stack {

	private static int size;
	private static int[] arr;
	private int count = 0;

	public stack() {
		this.size = 10;
		this.arr = new int[size];
	}

	public stack(int size) {
		this.size = size;
		this.arr = new int[size];
	}

	public void put(int num) {
		if (size == count && count > 0) {
			System.out.println("값을 넣을 수 없다.");
		} else {
			arr[count] = num;
			count++;
		}
	}

	public void pop() {
		arr[count - 1] = 0;
		int[] arrClone = new int[size];
		System.arraycopy(this.arr, 0, arrClone, 0, arr.length - 1);
		this.arr = arrClone;
		count--;
	}

	@Override
	public String toString() {
		return Arrays.toString(arr);
	}

}
