package random_math;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		long seed = System.currentTimeMillis();
		// 시드가 같으면 같은 난수 발생
		Random random = new Random();
		Random random2 = new Random(seed);

		random.nextInt();
		int[] sn = new int[6];
		int[] wn = new int[6];

		System.out.print("선택 번호 > ");
		for (int i = 0; i < sn.length; i++) {
			sn[i] = random.nextInt(45) + 1;
		}
		System.out.println(Arrays.toString(sn));
		System.out.print("당첨 번호 > ");
		for (int i = 0; i < sn.length; i++) {
			wn[i] = random2.nextInt(45) + 1;
		}

//		
		/*
		 * 이진 탐색
		 */

		Arrays.sort(wn);// 오름차순 정렬
		System.out.println(Arrays.toString(wn));

		// binarySearch(배열, 찾을 값) : 정렬된 배열에서 16을 찾아서 index번호를 리턴해줌
		int idx = Arrays.binarySearch(wn, 16);
		System.out.println("16은(는) " + (idx + 1) + "번째로 작은 값이다.");

		/*
		 * 찾을 값이 없으면 찾을 값 보다 큰 최초의 값 위치를 리턴 위치 index * (-1)한 값을 리턴함
		 */

		int[] arr = { 5, 1, 3 };
		Arrays.sort(arr);
		idx = Arrays.binarySearch(arr, 3);
		if (idx >= 0) {
			System.out.println("3은(는) " + (idx + 1) + "번째로 작은 값이다.");
		} else {
			System.out.println("찾을 값이 없습니다");
		}

		// 찾을 값이 없는 예 1
		idx = Arrays.binarySearch(arr, 2);
		if (idx >= 0) {
			System.out.println("2은(는) " + (idx + 1) + "번째로 작은 값이다.");
		} else {
			System.out.println("찾을 값 2가 없습니다. 2의 위치 = " + idx);
		}

		// 찾을 값이 없는 예 2
		idx = Arrays.binarySearch(arr, 4);
		if (idx >= 0) {
			System.out.println("2은(는) " + (idx + 1) + "번째로 작은 값이다.");
		} else {
			System.out.println("찾을 값 4가 없습니다. 4의 위치 = " + idx);
		}
		System.out.println("-----------------------------------------------------");
		for(int i = 0; i < 10; i++) {
			System.out.println(i + " 의 위치값 = " + Arrays.binarySearch(arr, i));
		}

	}

}
