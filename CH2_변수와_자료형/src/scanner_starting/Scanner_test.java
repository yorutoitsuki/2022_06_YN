package scanner_starting;

import java.util.Scanner;

public class Scanner_test {

	public static void main(String[] args) {
		//매서드안에 선언된 변수 = 지역변수 : 기본타입(값), 클래스타입
		Scanner sc = new Scanner(System.in);
		//Scanner 참조변수(주소) = Scanner 객체 생성
		/*
		 * nextInt() int
		 * nextDouble() double
		 * next() char
		 * 구분자(enter, space_bar, tab) 무시
		 */
		
		System.out.println("------------------------------------");
		System.out.println("insert lines");//구분자 == enter
		String str1 = sc.nextLine();
		System.out.println(str1);
		
		System.out.println("Insert two integers > ");
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		//System.out.println("Sum = " +(i1 + i2));
		System.out.println(i1 + " + " + i2 + " = " +(i1 + i2));
		System.out.println(i1 + " - " + i2 + " = " +(i1 - i2));
		System.out.println(i1 + " * " + i2 + " = " +(i1 * i2));
		System.out.println(i1 + " / " + i2 + " = " + ((double)i1 / i2));
		
		sc.nextLine();
		System.out.println("------------------------------------");
		System.out.println("insert lines");//구분자 == enter
		str1 = sc.nextLine();
		System.out.println(str1);
		
		System.out.println("------------------------------------");
		System.out.println("Insert two doubles > ");
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		System.out.println(d1 + " + " + d2 + " = " + (d1 + d2));
		System.out.println(d1 + " - " + d2 + " = " + (d1 - d2));
		System.out.println(d1 + " * " + d2 + " = " + (d1 * d2));
		System.out.println(d1 + " / " + d2 + " = " + (d1 / d2));
		
		System.out.println("------------------------------------");
		System.out.println("insert two Strings");
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println(s1 + "," + s2);
		System.out.println(s1.charAt(0) + "," + s2.charAt(0));
		
		sc.nextLine();
		System.out.println("------------------------------------");
		System.out.println("insert lines");//구분자 == enter
		str1 = sc.nextLine();
		System.out.println(str1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
