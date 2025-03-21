package newjava;

public class Value2 {

	public static void main(String[] args) {

		// int n1 = (int)Math.floor(10.9); //내림
		// System.out.println(n1);

		// int n2 = (int)Math.round(10.4); //반올림
		// System.out.println(n2);

		// int n3 = (int)Math.ceil(10.9); //올림
		// System.out.println(n3);

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int idx = arr.length;
		System.out.println("배열의 갯수: " + idx);
		int i = 0;

		// -------배열 갯수 홀수 -----------

		if (idx % 2 == 1) {
			i = idx / 2;
			int n1 = (int) Math.floor(i);

			System.out.println("배열의 중간인덱스: arr[" + n1 + "]");
			System.out.println("배열의 중간값: " + arr[n1]); // 중간값
		}

		// -------배열 갯수 짝수 ----------- 
		
		// 수정 필요 .  
		else if (idx % 2 == 0) {
			int k = idx / 2 + 1;
			System.out.println("배열의 중간값: " + arr[k]); // 중간값

		}

	}

}
