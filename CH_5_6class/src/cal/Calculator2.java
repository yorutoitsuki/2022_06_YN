package cal;
/*
 * 다른 클래스의 멤버를 사용하는 방법 : 상속, 포함
 */


//class Add{
//	private int cntAdd = 0;//메서드가 호출될 때 마다 1씩 증가하는 카운터 변수
//	//실질적인 기능
//	double add(double n1, double n2) {
//		cntAdd++;
//		return n1 + n2;
//	}
//	int getCntAdd() {
//		return cntAdd;
//	}
//	
//}
//
//class Sub{
//	private int cntSub = 0;
//	double sub(double n1, double n2) {
//		cntSub++;
//		return n1 - n2;
//	}
//	int getCntSub() {
//		return cntSub;
//	}
//}
//
//class Mul{
//	private int cntMul = 0;
//	double mul(double n1, double n2) {
//		cntMul++;
//		return n1 * n2;
//	}
//	int getCntMul() {
//		return cntMul;
//	}
//}
//
//class Div{
//	private int cntDiv = 0;
//	double div(double n1, double n2) {
//		cntDiv++;
//		return n1 / n2;
//	}
//	int getCntDiv() {
//		return cntDiv;
//	}
//}





/*
 * 1개의 소스파일에 여러 클래스를 설계할 때
 * public은 반드시 1개의 클래스에만 붙일 수 있다
 * 파일이름 = public 붙은 클래스이름
 * public은 부품 클래스에 붙이지 않기
 * 
 * 만약 main() 클래스가 있다면 
 * public은 무조건 main() 클래스에만 붙일 수 있다.
 */


public class Calculator2 {//계산기
	//포함 관계 만드는 순서 1. 멤버변수 선언
	private Add a;
	private Sub s;
	private Mul m;//6.private로 정보 은닉 시켜서 "캡슐화"함
	private Div d;
	
	//2.생성자
	//잘못된 방법
//	public Calculator(Add a, Sub s, Mul m, Div d) {
//		super();
//		this.a = a;
//		this.s = s;
//		this.m = m;
//		this.d = d;
//	}
	
	public Calculator2() {
		super();//3.부모 객체 생성
		
		
		a = new Add();//4.부품 생성
		s = new Sub();
		m = new Mul();
		d = new Div();
	}//5.최종적으로 계산기 객체 생성

	//7.외부에 노출된 기능을 가진 버튼(+,-,*,/)
	public void add(double n1, double n2) {
		System.out.println(n1 + "+" + n2 + "=" + a.add(n1, n2)); 
	}
	public void sub(double n1, double n2) {
		System.out.println(n1 + "+" + n2 + "=" + s.sub(n1, n2)); 
	}
	public void mul(double n1, double n2) {
		System.out.println(n1 + "+" + n2 + "=" + m.mul(n1, n2)); 
	}
	public void div(double n1, double n2) {
		System.out.println(n1 + "+" + n2 + "=" + d.div(n1, n2)); 
	}
	
	void showOperationTimes() {
		if(a.getCntAdd()!=0) {
			System.out.println("덧셈 횟수 : " + a.getCntAdd());
		}
		if(s.getCntSub()!=0) {
			System.out.println("뺄셈 횟수 : " + s.getCntSub());
		}
		if(m.getCntMul()!=0) {
			System.out.println("곱셈 횟수 : " + m.getCntMul());
		}
		if(d.getCntDiv()!=0) {
			System.out.println("나눗셈 횟수 : " + d.getCntDiv());
		}
		int total = a.getCntAdd() + s.getCntSub() + m.getCntMul() + d.getCntDiv();
		if(total != 0) {
			System.out.println("총 연산 횟수 : " + total);
		}
		else {
			System.out.println("시행된 연산 없음");
		}
	}
	
	
}
