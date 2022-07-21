package random_math;

import java.util.Arrays;

public class MathExample {

	public static void main(String[] args) {
		int v1 = Math.abs(-5);
		System.out.println("v1 = " + v1);
		
		double v2 = Math.abs(-3.14);
		System.out.println("|-3.14| = " + v2);
		
		//ceil() : 보다 큰 정수를 double 형으로 반환
		System.out.println(Math.ceil(5.3));
		System.out.println(Math.ceil(-5.3));
		
		//floor() : 보다 작은 정수를 double 형으로 변환
		System.out.println(Math.floor(5.3));
		System.out.println(Math.floor(-5.3));
		
		//rint() : 가까운 정수를 double 형으로 변환
		System.out.println(Math.rint(5.3));
		System.out.println(Math.rint(-5.3));
		
		//max(값1, 값2) : 두 수 중 큰값을 반환
		System.out.println(Math.max(5, 3));
		
		//min(값1, 값2) : 두 수 중 큰값을 반환
		System.out.println(Math.min(5, 3));
		
		//pow(a, b) : a의 b 승
		System.out.println(Math.pow(5, 3));
		
		//sqrt(수) : 루트
		System.out.println(Math.sqrt(25));
		
		//random() : 난수 발생
		System.out.println(Math.random());
		
		//1~6 난수 생성((int)(Math.random()*(끝 - 시작 + 1))) + 시작
		/*
		 * 0.0 <= Math.random() <= 1.0 실수값
		 * 0.0 <= Math.random()*6 < 6.0 실수값
		 * 0 <= (int)(Math.random()*6) < 6
		 * 0 + 1 <= (int)(Math.random()*6) + 1 < 6 + 1
		 * 
		 * 시작~ 끝 사이의 난수 발생
		 * (int)(Math.random()*(끝 - 시작 + 1개)) + 시작
		 */
		System.out.println((int)(Math.random()*(6-1+1))+1);
		
		System.out.println((int)(Math.random()*(110-88+1)+88));
		
		//알파벳을 랜덤하게 발생시키고 싶다면(대문자 A = 65, Z까지는 26개, 소문자a(=97)~z까지 26개)
		System.out.println((char)((Math.random()*(90-65+1))+65));
		System.out.println((char)((Math.random()*(122-97+1))+97));
		
		char[] arr1 = new char[10];
		char[] arr2 = new char[10];
		
		for(int i = 0; i<arr1.length; i++) {
			arr1[i] = (char)(Math.random()*(90-65+1)+65);
			arr2[i] = (char)(Math.random()*(122-97+1)+97);
			System.out.println(i + " " + (int)arr1[i] + " " + (int)arr2[i]);
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		
		

	}

}
