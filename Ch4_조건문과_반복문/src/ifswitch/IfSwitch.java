/*
 * 클래스 종류 3가지 : 모든 클래스에는 생성자가 존재한다
 * 1. 라이버리용(=설계도) : main()없다.
 * 
 * 2. 실행용 : main()이 있음
 * 
 * 3. 라이브러리용 + 실해용 : main()도 있고 
 * 						+라이브러리에 필요한 멤버변수(=필드)와
 * 						매서드들()을 추가하면
 * 						이 실행용 클래스도 라이브러리용으로도 사용가능함
 */

package ifswitch;

import java.util.Scanner;

class IfSwitch {
	/*
	 * public 어디서든 접근가능
	 * private 같은 클래스 내부에서만 사용가능
	 * protected 같은 패키지 내부와 상속받은 개체만 사용가능
	 * (null) 같은 패키지 내에서만 가능함
	 */
	public static final double PI = 3.14;//(final = 상속 후에도 값을 고정함)
/*
 * 1. 맴버변수 = 필드:옵션
 * 
 * 2. 기본생성자
 * 기본생성자 : 생성자가 없으면 컴파일러가 컴파일하기 전에 public IfSwitch(){super();}삽입
 * 
 * 3. 매서드:옵션
 * 
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.close();
//		System.out.println("점수 입력(0~100)");
//		int n1 = sc.nextInt();
//		//단독 if문
//		
//		if(n1 >= 90) {
//			if(n1 >= 95) {
//				System.out.print("A+");
//			}else {
//				System.out.print("A");
//			}
//		}else if(n1 >= 80) {
//			if(n1 >= 85) {
//				System.out.print("B+");
//			}else {
//				System.out.print("B");
//			}
//		}else if(n1 >= 70) {
//			if(n1 >= 75) {
//				System.out.print("C+");
//			}else {
//				System.out.print("C");
//			}
//		}else if(n1 >= 60) {
//			if(n1 >= 65) {
//				System.out.print("D+");
//			}else {
//				System.out.print("D");
//			}
//		}else {
//			System.out.print("F");
//		}
//		System.out.println("학점 입니다");
		
		/*
		 * switch()문 : sql에서의 decode()
		 * sql에서의 case~end와 같음
		 */
		
		
		System.out.println("-------------switch 정수테스트---------");
		switch(add(20, 30)) {
		case 10:
			break;
		case 20:
			break;
		case 30:
			break;
		default:
			break;
		}
		IfSwitch ifs = new IfSwitch();//주소로 접근, static이 없는 매서드
		switch(ifs.add(20, 20,30)) {
		case 10:
			break;
		case 20:
			break;
		case 30:
			break;
		default:
			break;
		}
		
		double result = ifs.add(12.3, 0.5);
		System.out.println(result);
		System.out.println(ifs.add(12.3, 0.5));
		
		ifs.addd(12.3, 12.3);
		
		System.out.println("------------------------------------");
		IfSwitch ifs2 = new IfSwitch();
		result = ifs2.area(3);
		System.out.println("반지름 3의 원넓이" + (result + 20));
		
		
		System.out.println("--------------------switch문의 문자 테스트--------");
		switch('a') {//이름 없는 메모리 'a' => 97(2)
			case '0':
				System.out.println("문자 0 입니다.");
				break;
			case 97:
				System.out.println("문자 a 입니다.");
				break;
			default:
				System.out.println("문자 0, a 이외입니다.");
				break;
		}
		
//		System.out.println("65~90사이의 정수 입력>");
//		int num = sc.nextInt();
//		if(num>90 || num <65) {
//			System.out.println("not available");
//		}else {
//			System.out.print("당신이 입력한 정수에 해당하는 문자는");
//			switch(parseChar(num)) {
//				case 'A':
//					System.out.println("A입니다.");
//					break;
//				case 'B':
//					System.out.println("B입니다.");
//					break;
//				case 'C':
//					System.out.println("C입니다.");
//					break;
//				default:
//					System.out.println("A, B, C 이외의 문자입니다");
//					break;
//					
//			}
//			System.out.print("당신이 입력한 정수에 해당하는 문자는");
//			switch(parseChar(num)+32) {
//				case 'a':
//					System.out.println("A입니다.");
//					break;
//				case 'b':
//					System.out.println("B입니다.");
//					break;
//				case 'c':
//					System.out.println("C입니다.");
//					break;
//				default:
//					System.out.println("A, B, C 이외의 문자입니다");
//					break;
//			}
//			System.out.print("당신이 입력한 정수에 해당하는 문자는");
//			switch(parseChar(num)+32) {
//				case 'A'+32:
//					System.out.println("A입니다.");
//					break;
//				case 'B'+32:
//					System.out.println("B입니다.");
//					break;
//				case 'C'+32:
//					System.out.println("C입니다.");
//					break;
//				default:
//					System.out.println("A, B, C 이외의 문자입니다");
//					break;
//			}
//		}
//		System.out.println("-------switch문의 문자열 테스트---------------");
//		System.out.print("Insert words>");
//		String word = sc.next();
//		switch(word) {
//		case "love" : 
//			System.out.println("case1");
//			break;
//		case "happy" : 
//			System.out.println("case2");
//			break;
//		case "health" : 
//			System.out.println("case3");
//			break;
//		default:
//			break;
//		}
//		switch(word) {
//		case "love" : 
////			System.out.println("case1 or 10");
////			break;
//		case "happy" : 
//			System.out.println("case1 or 10");
//			break;
//			
//		case "health" : 
//			System.out.println("case3");
//			break;
//		default:
//			System.out.println(word + " is out of case");
//			break;
//		}
		
//		System.out.println("-------if to switch---------------");
//	
//		System.out.println("점수 입력(0~100)");
//		int n1 = sc.nextInt();
//		System.out.print(n1 + "은 ");
//		switch(n1/10) {
//		case 10:
//		case 9:
//			System.out.print("A");
//			break;
//		case 8:
//			System.out.print("B");
//			break;
//		case 7:
//			System.out.print("C");
//			break;
//		case 6:
//			System.out.print("D");
//			break;
//		default:
//			System.out.print("F");
//			break;
//		}
//		System.out.println(" 학점 입니다");
		
		/*
		 * 카페에서 주문(손님 주문 : 입력)
		 * switch문으로 처리 => 결과출력
		 */
		
		int i;
		for(i = 0; i < 3; i++) {
			System.out.print("3번 주문-1 menu(아메, 라떼, 치노) 중에서 주문>");
			String order = sc.next();
			switch(order) {
			case "아메" :
			case "라뗴" :
			case "치노" :
				System.out.println("You ordered " + order);
				break;
			default:
				System.out.println("not in the menu check your " + order);
				break;
			}
		}
		System.out.println("when out i = " + i);
		
		i = 1;
		for(; i < 3; ) {
			System.out.print("3번 주문-2 menu(아메, 라떼, 치노) 중에서 주문>");
			String order = sc.next();
			switch(order) {
			case "아메" :
			case "라뗴" :
			case "치노" :
				System.out.println("You ordered " + order);
				break;
			default:
				System.out.println("not in the menu you ordered " + order);
				break;
			}
			i++;
		}
		
		
		
		
		
	
	
	
		sc.close();
		

	}
	
	/*
	 * 매서드 오버로딩 : 같은 이름의 매서드(), 단 매개변수의 갯수, 형태등이 달라야함
	 */
	
	/*
	 * 매서드 만드는 방법
	 * return되는 결과타입 + 매서드명(매개변수 선언)
	 * return 결과;
	 * 
	 * return되는 결과타입이 없을경우 void
	 */
	static int add(int n1, int n2){//메모리에 올라와 있음
		return n1+n2;
	}
	int add(int n1, int n2, int n3){
		return n1+n2;
	}
	double add(double n1, double n2){
		return n1+n2;
	}
	void addd(double n1, double n2){
		System.out.println(n1+n2);
	}
	
	double area(double r) {
		return PI*r*r;
	}
	
	static char parseChar(int n){
		return (char)n;
	}

}
