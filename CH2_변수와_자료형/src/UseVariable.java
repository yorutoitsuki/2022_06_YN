import java.math.BigDecimal;
import java.util.Scanner;
public class UseVariable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*System.out.print("First interger num?");
		int num1 = sc.nextInt();
		System.out.print("Second interger num?");
		int num2 = sc.nextInt();
		if(num1 > num2)
			System.out.println("Num1 is bigger");
		else if (num1 < num2)
			System.out.println("Num2 is bigger");
		else
			System.out.println("Same");*/
		
//		int i3 = 12, i4 = 15;
//		int i5, i6;
//		i5 = 20; i6 =30;
		
		
//		short s1 = (short) 32767;
//		short s2 = (short) 32768;
//		short s3 = (short) 65535;
//		short s4 = (short) 65536;
//		System.out.println(s1);//Memory Overflow
//		System.out.println(s2);//Memory Overflow
//		System.out.println(s3);//Memory Overflow
//		System.out.println(s4);//Memory Overflow
//		
//		//자동형변환 : 자료형 큰 범위 = 작은 범위
//		//강제형변환 : 
//		long i7 = 12345678901L;//L:4바이트->8바이트
//		System.out.println(i7);
//		int i8 = (int)123456789012L;
//		System.out.println(i8);//Momory Overflow
//		
//		int i9 = (int)123L;
//		System.out.println(i9);
		
//		float f1 = 1;
//		System.out.println(f1);
//		float f3 = 1.0F;//1.0(double)(8byte)->1.0(float)(4byte)
//		System.out.println(f3);
//		double d1 = 1;
//		System.out.println(d1);
//		float f2 = 12345678912L;
//		System.out.println(f2);
//		double d2 = 12345678912L;
//		System.out.println(d2);
		
		/*
		 *정수연산
		 *정수는 CPU연산장치 4바이트(int)에 담겨 연산됨 따라서 연산 결과도 4바이트(int)
		 *
		 * 
		 */
//		short sh1, sh2;
//		sh1 =12; sh2 = 7;
//		short sh3 = (short) (sh1+sh2);
//		System.out.println(sh3);
//		
//		sh1 += sh2;//sh1 = sh1 + sh2
//		System.out.println(sh1);
//		sh1 -= sh2;//sh1 = sh1 - sh2
//		System.out.println(sh1);
//		sh1++;//sh1 = sh1 + 1
//		System.out.println(sh1);
//		
//		short sh4 = 30000, sh5 = 30000;
//		int sh6 = sh4 + sh5;
//		System.out.println(Short.MAX_VALUE);
//		System.out.println(Short.MIN_VALUE);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
		
		/*
		 * 
		 */
		double d1 = 0.0000001;
		System.out.println(d1);
		
		double d2 = 1.0000001;
		System.out.println(d2);
		
		System.out.println("d1 + d2 = "+(d1+d2));
		
		//오차가 발생한 결과로 객체 생성
//		BigDecimal b1 = new BigDecimal(d1);
//		BigDecimal b2 = new BigDecimal(d2);
//		BigDecimal bResult = b1.add(b2);//오차발생
		
//		BigDecimal b1 = BigDecimal.valueOf(d1);
//		BigDecimal b2 = BigDecimal.valueOf(d2);
		
//		BigDecimal b1 = BigDecimal.valueOf(0.0000001);
//		BigDecimal b2 = BigDecimal.valueOf(1.0000001);
		
		BigDecimal b1 = new BigDecimal("0.0000001");//"실수" 문자열 객체 생성
		BigDecimal b2 = new BigDecimal("1.0000001");
		BigDecimal Bresult = b1.add(b2);
		Bresult = b2.subtract(b1);
		System.out.println(Bresult);
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		
		System.out.println("--Char(2Byte)-----------");
		System.out.println("자바는 2바이트:유니코드,C는 1바이트:아스키코드");
		char c1;
		c1 = 97;
		System.out.println(c1);
		char c2 = 'b', c3 = 'c', c4 = ' ';
		System.out.println(""+c2 + c3 + c4);
		char c5 ='다';
		System.out.println((int)'가'+","+(int)'나'+","+(int)'다');
		System.out.println(c5 + "의 코드값=" + (int)'다');
		System.out.println((char)45796);
		
		char c6 = 'A';//65,a=97
		System.out.println(c6 + "=" + (int)c6);
		c6 += 32;
		System.out.println(c6 + "=" + (int)c6);
		System.out.println((char)32 + 'A');
		System.out.println((char)(32 + 'A'));
		int n1 = 97;
		n1 = 0xAC00;//0x = 16진수
		System.out.println(n1 + "=" +(char)n1);
		
		char ch1 = '\uAc00';
		System.out.println(ch1 + "=" + (int)ch1);
		if(n1 == ch1) System.out.println("same");
		else System.out.println("different");
		
		int n3 = 077;//8진수
		System.out.println("8진수 = " + n3);
		
		int n4 = 0B1010;//2진수
		System.out.println("2진수 = " + n4);
		
		double dNum1 = 1.2;
		float fNum2 = 0.9f;
		
		int iNum3 = (int)dNum1 + (int)fNum2;
		System.out.println(iNum3);
		
		iNum3 = (int)(dNum1 + fNum2);
		System.out.println(iNum3);
		
		int n5 = 12;
		double d5 = 12.3;
		double result = (n5 + d5);
		System.out.println(n5 + "+" + d5 + "=" + result);
		
		/*자동 형변환 시 주의사항 : 정수가 실수로 자동변환시
		 * 실수 : 부호(1) + 지수부 + 가수부
		 * float = 부호(1) + 지수부(8) + 가수부(23)
		 * double = 부호(1) + 지수부(11) + 가수부(52)
		 */
		
		int n6 = 1234567891;
		int n7 = 1234567891;
		
		float n8 = n7;//가수부에 담기에는 너무 큰 수
		n7 = (int)n8;
		System.out.println(n8);
		System.out.println(n6 - n7);
		
		n7 = 1234567891;
		
		double n9 = n7;//가수부가 담기에 충분함
		n7 = (int)n9;
		System.out.println(n6 - n7);
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}

