package math;

import java.util.Scanner;

public class MathMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Math m = new Math();
		
		System.out.println("[원의 넓이] 반지름 입력");
		double r = sc.nextDouble();
		System.out.println("반지름 " + r + " 의 원넓이 = " + m.circleArea(r));
		
		
		
		
		sc.close();
	}

}
