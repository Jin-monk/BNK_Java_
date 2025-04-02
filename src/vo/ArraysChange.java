package vo;

import java.util.Arrays;

public class ArraysChange {

	private int[] arr;
	private int[] temp;
	private int idx;

	public ArraysChange() {
		this.arr = new int[5];
	}

	public void addInt(int idx, int n) { // idx: 인덱스 번호 , n: 요소값

		if (arr[arr.length - 1] != 0) {
			int[] temp = new int[idx + 1];

			for (int i = 0; i < arr.length ; i++) {
				temp[i] = arr[i];
			}
			temp[idx] = n ; 
			arr = temp;

		}
		arr[idx] = n;


	}

	public void removeInt(int idx) { // idx: 인덱스 번호

		for (int i = idx; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = 0;

	}
	public void insertInt() {
		
	}
	
	
	@Override
	public String toString() {
		return "arr 배열 요소: " + Arrays.toString(arr);
	}

}
