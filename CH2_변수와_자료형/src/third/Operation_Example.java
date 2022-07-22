/*
 * 클래스 종류
 * 1. main()이 있는것 : 실행용
 * 2. main()이 없는것 : 라이브러리용(ex:java.lang.*)
 * 3. 실행용 + 라이브러리용
 * 
 * import는 public 있으면 모든 패키지의 클래스에서 해당 클래스를
 * import 가능함
 * public이 없으면 같은 패키지의 클래스만 해당 클래스를 import 할 수 있다.
 */



package third;

import java.util.Scanner;

//이클립스 컴파일러가 컴파일 하기 전에 자동으로 삽입
//

public class Operation_Example {

	public static void main(String[] args) {//start
//		int iv1 = 10;
//		int iv2 = 3;
//		
//		System.out.println(iv1 + iv2);
//		System.out.println(iv1 - iv2);
//		System.out.println(iv1 * iv2);
//		System.out.println(iv1 / iv2);
//		System.out.println(iv1 % iv2);
//		
//		System.out.println((double)iv1 / iv2);
//		
//		/*
//		 * 
//		 */
//		byte b1 = (byte)1234;
//		System.out.println(b1);
//		int i = 300;
//		System.out.println("그냥 i =" + i);
//		if(i < Byte.MIN_VALUE || i > Byte.MAX_VALUE) {
//			System.out.println("the " + i + " Can not convert to Byte-Type");
//			System.out.println("Please check your Values");
//		}else {
//			System.out.println("Converted i to Byte =" + i);
//		}
//		
//		i = 127;
//		
//		if(i < Byte.MIN_VALUE || i > Byte.MAX_VALUE) {
//			System.out.println("the " + i + " Can not convert to Byte-Type");
//			System.out.println("Please check your Values");
//		}else {
//			System.out.println("number has Converted to Byte = " + (byte)i);
//		}
//		
//		
//		if(!(i >= Byte.MIN_VALUE && i <= Byte.MAX_VALUE)) {
//			System.out.println("the " + i + " Can not convert to Byte-Type");
//			System.out.println("Please check your Values");
//		}else {
//			System.out.println("number has Converted to Byte = " + (byte)i);
//		}
//		
//		int i1 = 10, i2 = 2;
//		boolean value = ((i1 += 10) < 10 && (i2 += 2) < 10);
//		System.out.println("value = " + value);
//		System.out.println("i1 = " + i1);
//		System.out.println("i2 = " + i2);
//		
//		System.out.println("------------------------");
//		
//		i1 = 10; i2 = 2;
//		value = ((i1 += 10) > 10 || (i2 += 2) < 10);
//		System.out.println("value = " + value);
//		System.out.println("i1 = " + i1);
//		System.out.println("i2 = " + i2);
//		
//		System.out.println("------------------------");
//		
//		i1 = 10; i2 = 2;
//		value = ((i1 += 10) < 10 || (i2 += 2) < 10);
//		System.out.println("value = " + value);
//		System.out.println("i1 = " + i1);
//		System.out.println("i2 = " + i2);
//		
//		System.out.println("------------------------");
//		
//		i1 = 10; i2 = 2;
//		value = ((i1 += 10) > 10 && (i2 += 2) < 10);
//		System.out.println("value = " + value);
//		System.out.println("i1 = " + i1);
//		System.out.println("i2 = " + i2);
//		
//		System.out.println("-resolve side effect----------");
//		
//		i1 = 10; i2 = 2;
//		i2 += 2;
//		value = ((i1 += 10) < 10 && i2 < 10);
//		System.out.println("value = " + value);
//		System.out.println("i1 = " + i1);
//		System.out.println("i2 = " + i2);
//		
//		i1 = 10; i2 = 2;
//		i2 += 2;
//		value = ((i1 += 10) > 10 || i2 < 10);
//		System.out.println("value = " + value);
//		System.out.println("i1 = " + i1);
//		System.out.println("i2 = " + i2);
//		
//		System.out.println("------------------------");
//		
//		System.out.print("자료형의 값은 사이클을 돈?다. \"overflow\"\n");
//		byte b = 126;
//		System.out.println(b+1);
//		System.out.println(b);
//		
//		System.out.println("------------------------");
//		System.out.println(++b);
//		System.out.println(b++);
//		System.out.println(b + " overflow");
//		System.out.println(--b);
//		System.out.println(b--);
//		System.out.println(b);
//		
//		int a1 = 10, a2 = 20, a3;
//		a1++;
//		++a1;
//		System.out.println(a1+", "+ a2);
//		System.out.println(a1+", "+ ++a2);
//		System.out.println(a1+", "+ a2++);
//		System.out.println(a1+", "+ a2);
//		System.out.println(a1+", "+(++a2));
//		System.out.println(a1+", "+(a2++));
//		System.out.println(a1+", "+a2);
//		
//		/*
//		 * ++,--이 앞에 있을때, 전치연산, 가장먼저 연산
//		 * 뒤에 있을때는 후치연산, 가장 나중에 연산
//		 */
//		a1 = 10; a2 = 20;
//		a3 = ++a1 + a2--;
//		System.out.println(a1+","+ a2 +"," +a3);
//		
//		/*
//		 * 부호도 연산자
//		 */
//		
//		int n1 = 5;
//		System.out.println(n1);
//		System.out.println(+n1);
//		System.out.println(-n1);
//		
//		short n2 = 7;
//		short n3 = 3; 
//		n3 = (short) +n2;
//		int n4 = +n2;
//		
//		i = 1;
//		i++;
//		i += 1;
//		i += 3;
//		i -= 3;
//		i *= 3;
//		i /= 2;
//		i %= 2;
//		
//		i2 = 7;
//		i += i2;
//		
//		/*
//		 * 단항연산자 : !, ++, --, ~
//		 * 논리연산자 : !, &&, ||
//		 * 비트연산자 : 
//		 * ^ : 다르면 1, 같으면 0
//		 * | : or
//		 * ~ : 반전
//		 * & : and
//		 * << : 곱하기
//		 * >> : 나누기
//		 */
//		
//		int num1 = 5, num2 = 3;
//		System.out.println(Integer.toBinaryString(num1));
//		System.out.println(Integer.toBinaryString(num2));
//		
//		System.out.println("5&3 = " + (num1&num2));
//		System.out.println("5|3 = " + (num1|num2));
//		System.out.println("5^3 = " + (num1^num2));
//		
//		
//		System.out.println("~5 = " + (~num1));
//		System.out.println("5^3 = " + (~num1+1));
//		
//		System.out.println();
//		
//		/*
//		 * 
//		 */
//		System.out.println(2<<1);
//		System.out.println(2<<2);
//		System.out.println(2<<3);
//		
//		System.out.println(3<<1);
//		System.out.println(3<<2);
//		System.out.println(3<<3);
//		
//		System.out.println(16>>2);
//		System.out.println(16>>3);
//		
//		//음수이면 양수로 바꾸기
//		int x = -10, temp = x;
//		if(x<0) {
//			x = -x;
//		}
//		System.out.println(temp + " => " + x);
//		
//		
//		
		Scanner sc = new Scanner(System.in);
//		x= 10;
//		temp = (x>=0)?x:-x;
//		System.out.println(x + " => " + temp);
//		
//		int count = 0;
//		while(true) {//repeatable as many as U want
//			System.out.println("insert new value for X = ");
//			x = sc.nextInt();
//			temp = x;
//			if(x == 0) {
//				System.out.println("shutting down");
//				break;
//			}else if(x<0) {
//				x = -x;
//			}
//			count++;
//			System.out.println(temp + " => " + x + ", count = " + count);
//		}
//		
//		int count = 0;
//		for(int i = 0; i < 3; i++) {
//			System.out.println("insert new Integer value for X = ");
//			int x = sc.nextInt();
//			int temp = x;
//			if(x == 0) {
//				break;
//			}else if(x<0) {
//				x = -x;
//			}
//			count++;
//			System.out.println(temp + " => " + x + ", count = " + count);
//		}
//		System.out.println("shutting down");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}//end

}











