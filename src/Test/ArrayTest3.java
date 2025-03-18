package Test;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		int[] arr = new int [10];
		
		for (int i = 0; i <10; i++) {
			arr[i] = i + 1; 
		}
		int[] arrB = new int [5];
		int[] arrC = new int [5];
		
		int x = 0;
		int y = 0;
		
		for (int i = 0; i < 10; i++) {
			if (arr[i]%2==0) {
				arrB[x] = arr[i];
				x++;
			} else {
				arrC[y] = arr[i];
				y++;
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(arrB[i]);
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(arrC[i]);
		}
		
	}
} 