


/*
 * [static 메서드가 되는 조건]
 * 1. 조건 : 메서드()가 static없는 멤버변수를 필요로 하지 않고
 * 			"static 있는 멤버변수 또는 매개변수"를 필요로 한다
 * 			이 조건을 만족하면 메서드 앞에 static 붙일 수 있다.
 * 			즉, static 없는 멤버변수를 필요로 하지 않을때
 */



package math;

public class Math {
	//1. 멤버변수
	static final double PI = 3.14195; 
	
	//2. 생성자
	//기본생성자 public Math()	{super();}
	
	//3. 메서드
	/*
	 * 
	 */
	static double circleArea(int r){
		return r*r*PI;
	}
	
	static double circleArea(double r){
		return r*r*PI;
	}
	
	static double circleLength(int r) {
		return 2*PI*r;
	}
	
	static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	static int mul(int num1, int num2) {
		return num1 * num2;
	}
}
