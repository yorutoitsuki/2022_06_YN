import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TwoDimensionArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/********** 2차원 배열 선언하는 방법-1 ******************************************/
		System.out.println("*** 2차원 배열 선언하는 방법-1 ***");
		int[][] m = new int[2][3];// [2행][3열]

		System.out.println(Arrays.toString(m[0]));// m[0](=주소)가 참조하는 배열객체의 값을 출력
		System.out.println(Arrays.toString(m[1]));// 기본값으로 채워진 배열객체 출력 [0, 0, 0]
		System.out.println();// 구분위한 빈줄

		for (int i = 0; i < m.length; i++) {
			System.out.println(Arrays.toString(m[i]));
		}
		System.out.println();// 구분위한 빈줄

		System.out.println("** 향상된 for문 : index사용안함(index로 접근해야만 하는 상황에서는 사용못함) **");
		for (int[] arr : m) {
			System.out.println(Arrays.toString(arr));
		}
		System.out.println();// 구분위한 빈줄

		System.out.println("** for문 사용안하고 출력 **");
		System.out.print("[");
		System.out.print(m[0][0] + ", ");// 기본값 0
		System.out.print(m[0][1] + ", ");
		System.out.print(m[0][2]);
		System.out.println("]");// 커서를 아래로

		System.out.print("[");
		System.out.print(m[1][0] + ", ");
		System.out.print(m[1][1] + ", ");
		System.out.print(m[1][2]);
		System.out.println("]");// 커서를 아래로

		System.out.println("** 배열의 값 변경 후 출력 **");
		m[0][0] = 95;
		m[0][1] = 100;
		m[0][2] = 87;
		m[1][0] = 83;
		m[1][1] = 92;
		m[1][2] = 78;

		for (int[] arr : m) {
			System.out.println(Arrays.toString(arr));
		}
		System.out.println();// 구분위한 빈줄

		/**
		 * 7-1 [과제-1] 중첩된 for문을 이용하여 아래 내용 출력 
		 * [95, 100, 87] 
		 * [00][01][02] 
		 * 
		 * [83, 92, 78]
		 * [10][11][12]
		 */
		System.out.println("--[과제-1] : m이 참조하는 배열--");
		for (int i = 0; i < m.length; i++) {
			System.out.print("[" + m[i][0]);
			for (int j = 1; j < m[i].length; j++) {
					System.out.print(", " + m[i][j]);
			}
			System.out.println("]");
		}
		for (int i = 0; i < m.length; i++) {
			System.out.print("[");
			for (int j = 0; j < m[i].length; j++) {
				System.out.print((j != (m[i].length-1))?m[i][j] + ", ":m[i][j]);
			}
			System.out.println("]");
		}

		/*
		 * for(;;) { for(;;) {
		 * 
		 * } }
		 */

		/********** 2차원 배열 선언하는 방법-2 ******************************************/
		System.out.println("*** 2차원 배열 선언하는 방법-2 ***");
		int[][] a = new int[2][];
		System.out.println(Arrays.toString(a));// [null, null]

		a[0] = new int[2];// 1반 2명
		a[1] = new int[3];// 2반 3명

		
		System.out.println("2차원 배열 선언하는 방법 3");
		
		int[][] s = new int[2][];
		
		s[0] = new int[] {87, 93};
		s[1] = new int[] {97, 88, 100};
		
		for(int[] array1:s) {
			for(int array2:array1) {
				System.out.print(array2 + " ");
			}
			System.out.println();
		}
		int[][] java = {
				{95, 97},
				{98, 100, 99, 75},
				{100, 88, 92}
		};
		
		/*
		 * 7-2 과제 2 각반의 java 성적의  합과 평균 구하기
		 */
		int hap;
		double avg;
		for(int i = 0; i < java.length; i++){
			hap = 0;
			for(int j = 0; j < java[i].length; j++) {
				hap += java[i][j];
			}
			avg = ((double)hap/java[i].length);
			//System.out.println((i+1) + " 반의 총 합 : " + hap + ", 평균 : " + avg);
			System.out.printf("%d 반의 총 합 : %d\t 평균 : %.2f\n",(i+1),hap,avg);
		}
		
		
		
		

		sc.close();

	}

}
