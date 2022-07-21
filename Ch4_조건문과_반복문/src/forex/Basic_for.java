package forex;

import java.util.Scanner;

public class Basic_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//if does not use looping
		System.out.println("do best in this moment");
		System.out.println("do best in this moment");
		System.out.println("do best in this moment");
		System.out.println("do best in this moment");
		System.out.println("do best in this moment");
		
		System.out.println();
		/*
		 * '같은 실행문' 이거나 '일정한 규칙성'이 있어야 반복문을 사용할 수 있다.
		 */
		
		/*
		 * 2.반복문을 사용하면 : 카운터 변수
		 * 
		 * for(1.변수선언 및 초기화(한번만);2. 조건문;4.변수증가/감소=>2){
		 * 	3.
		 * }
		 */
		int i;
		for(i = 0; i < 3; i++) {//조건문 생략시 true로 취급
			System.out.println("do best in this moment");
		}
		System.out.println("i = " + i);
		
		while(i <= 5) {//조건문 참일동안 반복, 조건문 생략 불가
			System.out.println("do best in this moment");
			i+=2;
		}
		System.out.println("i = " + i);
		do{//무조건 1번은 꼭 실행하고 참거짓 확인
			System.out.println("do best in this moment");
			i+=2;
		}while(i <= 5);
		
		
		int j = 0;
		for(i = 1; i <=5; i+=2) {
			System.out.println((i - j) + " ");
			j++;
		}
		System.out.println();
		
		for(i = -10; i < -5; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println();
		
		int hap = 0;
		for(i = 1; i < 11; i++) {
			hap += i;
		}
		System.out.println(hap);
		hap = 0;
		
		for(i = 0; i<= 10; i+=2) {
			hap +=i;
		}
		System.out.println(hap);
		
		System.out.print("1~입력받은 정수까지 더한 값을 출력, 정수 입력>");
		int LastNum = sc.nextInt();
		hap = 0;
		for(i = 1; i<= LastNum; i++) {
			hap += i;
		}
		System.out.println("1~"+LastNum+"까지 더한 결과 = " + hap);
		
		
		
		sc.close();
		
	}

}
