import java.util.Scanner;

public class MainStringArray {
	/*
	 * 1. 맴버변수 = 필드 : 기본값(기본타입 : 0, 클래스타입 : null)
	 */
	
	/*
	 * 2.생성자 : 생성자는 반드시 존재(생성자 없으면 컴파일러가 컴파일하기 전에 기본 생성자를 자동 삽입)
	 * 기본생성자 public MainString Array(){super();}
	 */
	class testing{
		int testingInt;
		String testName= "";
		testing(){
			this.testingInt = 0;
			this.testName = "No One";
		}
		testing(int a, String b){
			this.testingInt = a;
			this.testName = b;
		}
		testing(int a){
			this.testingInt = a;
			this.testName = "this unit need name";
		}
		void setInt(int a){
			this.testingInt = a;
		}
	}
	/*
	 * 매서드 
	 */
	
	/*
	 * JVM이 MainStringArray.class 파일을 메모리에 로딩할 때 static 붙은 멤버들은 함께 올라감
	 * 이때, JVM이 main()을 호출할 때 "length가 0인 String[] 배열 객체"
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(args.length);
		
		if(args.length != 4) {
			System.out.println("실행할 때 4개의 숫자를 입력하세요.(정수 2개, 실수 2개)");
			return;//해당 매서드를 종료
		}
		
		System.out.println("----두 정수와 두 실수 연산---------");
		
		String s1 = args[0];
		String s2 = args[1];
		String s3 = args[2];
		String s4 = args[3];
		
		int i1 = Integer.parseInt(s1);
		int i2 = Integer.parseInt(s2);
		
		double d1 = Double.parseDouble(s3);
		double d2 = Double.parseDouble(s4);
		
		System.out.println("1.두 정수 연산, 연산자 입력(+-*/)");
		String opr1 = sc.next();
		oper(opr1, i1, i2);
		System.out.println("2.두 실수 연산, 연산자 입력(+-*/)");
		String opr2 = sc.next();
		oper(opr2, d1, d2);
		
		MainStringArray ms = new MainStringArray();
		ms.mul(i1, i2);
		ms.div(i1, i2);
		
		//2.연산자를 입력받아 두 정수를 연산한결과 출력
		
//		ArrayList<String> aList1 = new ArrayList<String>();
//		LinkedList<String> lList2 = new LinkedList<String>();
		
		
		sc.close();
	}
	static double add(int a, int b) {
		return a + b;
	}
	static double sub(int a, int b) {
		return a - b;
	}
	void mul(int a, int b) {
		System.out.println("실수 연산 곱 결과 = " + a*b);
	}
	void div(int a, int b) {
		System.out.println("실수 연산 나눗셈 결과 = "+(double)a/b);
	}
	
	static void oper(String opr, int i1, int i2) {
		switch(opr) {
		case "+":
			System.out.println(i1 + i2);
			break;
		case "-":
			System.out.println(i1 - i2);
			break;
		case "*":
			System.out.println(i1 * i2);
			break;
		case "/":
			System.out.println((double)i1 / i2);
			break;
		default:
			System.out.println("불가능한 연산");
		}
	}
	static void oper(String opr, double i1, double i2) {
		switch(opr) {
		case "+":
			System.out.println(i1 + i2);
			break;
		case "-":
			System.out.println(i1 - i2);
			break;
		case "*":
			System.out.println(i1 * i2);
			break;
		case "/":
			System.out.println(i1 / i2);
			break;
		default:
			System.out.println("불가능한 연산");
		}
	}

}
