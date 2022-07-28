


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
	//private 생성자는 클래스 안의 모든 멤버들이 static 일떄
	public Math() {}
	//3. 메서드
	/*
	 * 
	 */
	public static double circleArea(int r){
		return r*r*PI;
	}
	
	public static double circleArea(double r){
		return r*r*PI;
	}
	
	public static double circleLength(int r) {
		return 2*PI*r;
	}
	
	public static double circleLength(double r) {
		return 2*PI*r;
	}
	

	
	//가변인수, 인수를 배열로 처리함
	public static double add(double...num) {
		double result = 0;
		for(double temp : num) {
			result += temp;
		}
		return result;
	}
	
	
	
	public static double mul(int...num) {
		double result = 1;
		for(double temp : num) {
			result *= temp;
		}
		return result;
	}
	
	public static double max(double...num) {
		double maximum = num[0];
		for(int i = 1; i < num.length; i++) {
			if(maximum < num[i]) {
				maximum = num[i];
			}
		}
		return maximum;
		
	}
}

















