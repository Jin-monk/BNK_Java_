package newjava;

import java.util.Arrays;

public class AscendingArr {

	public static void main(String[] args) {
		int[] arr = { 5, 6, 2, 1, 4, 3 };

		int space = 0;

		

		for (int j = 1; j < 6; j++) {
			for (int i = 0; i < 6; i++) {
				if (arr[i] > arr[j]) {
					space = arr[i];
					arr[i] = arr[j];
					arr[j] = space;
					space = 0;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

		/*
		 * for (int i = 2; i < 6; i++) { if (arr[1] > arr[i]) { space = arr[1]; arr[1] =
		 * arr[i]; arr[i] = space; space = 0; }
		 * 
		 * } System.out.println(Arrays.toString(arr));
		 * 
		 * for (int i = 3; i < 6; i++) { if (arr[2] > arr[i]) { space = arr[2]; arr[2] =
		 * arr[i]; arr[i] = space; space = 0; }
		 * 
		 * } System.out.println(Arrays.toString(arr));
		 * 
		 * for (int i = 4; i < 6; i++) { if (arr[3] > arr[i]) { space = arr[3]; arr[3] =
		 * arr[i]; arr[i] = space; space = 0; }
		 * 
		 * } System.out.println(Arrays.toString(arr));
		 * 
		 * for (int i = 5; i < 6; i++) { if (arr[4] > arr[i]) { space = arr[4]; arr[4] =
		 * arr[i]; arr[i] = space; space = 0; }
		 * 
		 * } System.out.println(Arrays.toString(arr));
		 */
	}

}
