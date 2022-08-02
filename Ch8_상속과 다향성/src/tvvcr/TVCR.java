package tvvcr;
/*
 * 상황 : power() {} 완성된 메서드이면 자식 클래스에서 power()를 재정의 하지 않아도 오류 발생 안함
 * 그런데, 부모 입장에서는 반드시 power(){}메서드를 자식이 재정의해서 사용하기를 원함
 * 
 * 해결책 : power()를 미완성된 추상 메서드로 만들어 반드시 자식클래스에서 재엉의 하도록 함
 * 자식클래스에서 재정의안하면 오류발생 - 오류해결방법1 : 재정의
 * 							   - 오류해결방법2 : 자식 클래스도 추상 클래스로 만듬
 * 
 * [abstract class 클래스명 = 추상 클래스
 * 1. 여러 매서드 중 1개라도 미완성된 추상 메서드가 있으면 이 클래스도 미완성이므로 abstract class가 됨
 * 2. 객체 생성 불가 : 이유? 미완성 클래스이므로
 * 3. 그러나 부모 역할은 가능
 * (예)ArrayList<Electronics>의 배열에 자식 개체들이 자동으로 형변환 되어 전부 들어감(UpCasting)
 * 
 * Electronics e = new TV();(DownCasting)
 * Electronics e = new VCR();
 * Electronics e = new TVCR();
 */
abstract class Electronics {
	boolean power;
	
	abstract void power();
}

class TV extends Electronics{
	int channel;//채널
	int barcode;
	
	TV(int barcode) {
		this.barcode = barcode;
	}
	
	TV() {
		super();
	}
	
	void power() {
		power = !power;
		if(power) {
			System.out.println("TV 전원 ON");
		}
		else {
			System.out.println("TV 전원 OFF");
		}
	}
	
	void channelUp() {
		channel++;
		if(channel > 100) {
			channel = 0;
		}
	}
	
	void channelDown() {
		channel--;
		if(channel < 0) {
			channel = 100;
		}
		System.out.println("channel : " + channel);
	}

	@Override
	public String toString() {
		return "TV [power=" + power + ", channel=" + channel + "]";
	}
	
	

	
	
	
}

/*
 * 여러 개의 클래스를 하나의 파일에 설게할 때
 * public은 단 1개의 클래스에만 쓸 수 있다.
 * 
 * public 붙은 클래스이름 = 파일이름
 * 
 * main()있는 클래스에 public 붙이고
 * main()있는 클래스 이름 = 파일이름
 */

class VCR extends Electronics{//포함관계로 만들 예정
	
	void power() {
		power = !power;
		if(power) {
			System.out.println("VCR 전원 ON");
		}
		else {
			System.out.println("VCR 전원 OFF");
		}
	}
	
	void play()	{
		System.out.println("Play");
	}
	void stop()	{
		System.out.println("stop");
	}
	void rewind()	{
		System.out.println("rewind");
	}
	void fast()	{
		System.out.println("fast");
	}

	@Override
	public String toString() {
		return "VCR [power=" + power + "]";
	}
	
	void capture() {
		System.out.println("화면 캡쳐");
	}
}

public class TVCR extends TV {
	/*
	 * TV(부모)의 멤버(멤버변수, 메서드)만 상속,
	 * 생성자, 초기화블록, private멤버는 상속되지 않는다.
	 */
	
	private VCR vcr;
	int barcode;

	public TVCR() {
		super();
		power = true;
		this.barcode = 111;//주의 : 부모의 barcode 값이 변경 후 그대로 상속 받음
		this.vcr = new VCR();
	}
	
	public TVCR(int barcode) {
		super(4444);
		this.barcode = barcode;
	}

	@Override
	void power() {
		power = !power;
		if(power) {
			System.out.println("TVCR 전원 ON");
		}
		else {
			System.out.println("TVCR 전원 OFF");
		}
	}

	public void play() {
		vcr.play();
	}
	public void stop() {
		vcr.stop();
	}
	public void rewind() {
		vcr.rewind();
	}
	public void fast() {
		vcr.fast();
	}
	
	int getBarcode() {
		return this.barcode;
	}

	@Override
	public String toString() {
		return "TVCR [vcr=" + vcr + ", channel=" + channel + ", barcode=" + barcode + ", power=" + power + "]";
	}
	/*
	 * tv(부모)의 멤버(멤버변수, 메서드)만 상속,
	 * 생성자, 초기화블록, private멤버는 상속되지 않는다.
	 * 상황1. barcode가 부모인 tv클래스에만 있으므로
	 * this.barcode나 super.barcode는 tv클래스의 barcode값을 의미함(공유)
	 * 
	 * 
	 * 
	 * 상황2. tv의 barcode는 super.barcode로 접근
	 * 		tvcr의 barcode는 this.barcode로 접근(독립)
	 * 
	 * 각 상황에 따라 출력되는 결과는 다르다
	 */
	public int getTVBacode() {
		return super.barcode;
	}

	public int getTVCRBacode() {
		return this.barcode;
	}
	void setTVBarcode(int barcode) {
		super.barcode = barcode;
	}
	void setTVCRBarcode(int barcode) {
		super.barcode = barcode;
	}
	
}

class parents{
	int age = 50;
	String name = "parent";
	String FamilyName = "test";
	int test;
	parents(int test){
		this.test = test;
	}
	parents(){
		super();
	}
	public void Iam() {
		System.out.println("My name is " + this.name + " " + FamilyName + ", age : " + age);
	}
	
}
class child1 extends parents{
	child1(){
		this.age = 10;
		this.name = "child";
	}
	child1(int test){
		super(test);
	}
}

//boolean power;//전원
//int channel;//채널
//
//void power() {
//	power = !power;
//	if(power) {
//		System.out.println("TV 전원 ON");
//	}
//	else {
//		System.out.println("TV 전원 OFF");
//	}
//}
//
//void channelUp() {
//	channel++;
//	if(channel > 100) {
//		channel = 0;
//	}
//}
//
//void channelDown() {
//	channel--;
//	if(channel < 0) {
//		channel = 100;
//	}
//}


//public class TVCRmain {
//	public static void main(String[] args) {
//		
//	}
//}




















