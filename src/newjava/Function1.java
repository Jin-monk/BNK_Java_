package newjava;

import java.util.Arrays;
import java.util.Scanner;

public class Function1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 8 ;
		int m = 9 ;
		int k = 3 ;
		
		int sum = f1(n,m,k);
		System.out.println(sum);
		
		int[] result = f2(sum);
		System.out.println("몫: "+result[0]);
		System.out.print("나머지: "+result[1]);
		
	}
	public static int f1 (int n, int m, int k) {
		int sum = 0 ;
		int[]A = {n,m,k} ;
		for ( int i = 0; i < 3; i ++) {
			sum = sum + A[i];
		}
		
		
		return sum; 
	}

	public static int[] f2 (int i ) {
		int result1 = i / 3 ; //몫
		int result2 = i - (result1 * 3) ; //나머지
		
		int arr[] = {result1,result2};
		
		return arr; 
		
	}
}
