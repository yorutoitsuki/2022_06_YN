package math;

import static java.lang.Math.*;
import java.util.Scanner;

public class MathMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[원의 넓이] 반지름 입력");
		double r = sc.nextDouble();
		System.out.println("반지름 " + r + " 의 원넓이 = " + Math.circleArea(r));
		
		System.out.println("[원의 둘레] 반지름 입력");
		r = sc.nextDouble();
		System.out.println("반지름 " + r + " 의 원둘레 = " + Math.circleLength(r));
		
		System.out.println("더할 첫 번째 정수 입력> ");
		int num1 = sc.nextInt();
		System.out.println("더할 두 번째 정수 입력> ");
		int num2 = sc.nextInt();
		
		System.out.println(num1 + "+" + num2 + "=" + Math.add(num1, num2));
		
		System.out.println("10=" + Math.add(10));
		System.out.println("10 + 20=" + Math.add(10,20));
		System.out.println("10 + 20 + 30=" + Math.add(10,20,30));
		System.out.println("10 + 20 + 30 + 40=" + Math.add(10,20,30,40));
		System.out.println("10 + 20 + 30 + 40 + 50=" + Math.add(10,20,30,40,50));
		
		System.out.println("10=" + Math.mul(10));
		System.out.println("10 * 20=" + Math.mul(10,20));
		System.out.println("10 * 20 * 30=" + Math.mul(10,20,30));
		System.out.println("10 * 20 * 30 * 40=" + Math.mul(10,20,30,40));
		System.out.println("10 * 20 * 30 * 40 * 50=" + Math.mul(10,20,30,40,50));
		
		System.out.println("-----[import된 같은 이름의 클래스가 여러개 일때]");
		System.out.println("java.jang.Math의 매서드 호출");
		
		//같은 패키지의 Math를 우선하므로 다른 패키지의 Math는 "패키지 이름으로 접근"
		java.lang.Math.abs(-3);
		//import static java.lang.Math.*; 하면
		System.out.println("2와 8중 큰 수 ="+max(2, 8));
		
		
		sc.close();
	}

}
