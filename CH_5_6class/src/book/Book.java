/*
 * 라이브러리용 : main이 없는 클래스
 * 실행용 클래스 : main + 라이브러리
 */

/*
 * 접근제한자
 * public : 어디서든 접근 가능
 * protected : 같은 패키지 내에서만 접근가능(단, 자식은 어디서든 접근 가능 = 다른 패키지의 자식이라도 접근 가능)
 * 아무것도 없는것 (=default): 같은 패키지 내에서만 접근가능, 다른 패키지에서는 접근 불가 
 * private : 같은 클래스 안에서만 접근 가능함, 다른 클래스에서는 접근 불가
 * private 멤버변수는 메서드를 통해서 간접적으로 접근
 * private 멤버는 상속 불가
 * 
 * class 앞에 public 있으면 어디서든지 import 할 수 있다.
 * 
 * 
 * 생성자 역할, 멤버 변수에 값을 채워 객체 생성
 * -생성자는 반환티입이 없다. void 자체도 없음.
 * -객체 안에 생성자는 존재하지 않음
 * 
 * -생성자 없으면 컴파일러가 컴파일하기 전, 자동으로 기본생성자 삽입해줌
 * -생성자 {} 안의 super();가 없으면 컴파일러가 컴파일하기 전, 자동으로 첫줄에 상ㅂ입
 * 반드시 첫줄에 삽입하는 이유? super(); 부모 생성자를 호출 -> 부모 객체 생성
 * 
 * 기본생성자
 * public class Book { public Book(){super(); } }
 * 		  class Book {        Book(){super(); } }
 * -기본생성자는 super(); 호출하여 부모생성 -> 자식의 멤버변수에 '기본값'으로 채워 자식 객체 생성
 * -기본값 : 기본 타입(값) - int(0),double(0.0), boolean(false), char('\0' 널문자)
 * 클래스타입(객체의 주소) - null(참조하는 객체가 없다.)
 * 
 * super.부모의 멤버변수/매서드 : super(부모의 주소)로 접근
 * super();				  : 부모의 생성자 호출
 * 							반드시 '자식생성자 안에서만' 사용가능
 * this.자신의 멤버변수/메서드 : this(자신의 주소)로 접근
 * 
 * [멤버변수에 값을 저장하는 방법]
 * 
 * 1.기본값
 * public class Book { public Book(){super(); } }
 * 		  class Book {        Book(){super(); } }
 * -기본생성자는 super(); 호출하여 부모생성 -> 자식의 멤버변수에 '기본값'으로 채워 자식 객체 생성
 * -기본값 : 기본 타입(값) - int(0),double(0.0), boolean(false), char('\0' 널문자)
 * 클래스타입(객체의 주소) - null(참조하는 객체가 없다.)
 * 
 * 2.명시적으로 초기화
 * (예)int a = 10; String s = "b"
 * 
 * 3.생성자를 통해 초기화
 * static final 멤버변수는 값을 명시적으로 초기화하고 바로 메모리에 올라감
 * 그러나 생성자를 통해 값을 변경하려면 final 때문에 오류가 생김
 * 
 * static 영역 = 정적 영역 = 데이터 영역 = 메서드 영역 : 공유
 *   heap 영역 = 동적 영역 : 생성자를 통해 객체 생성
 * stack 영역 : 지역변수 - 기본타입, 클래스타입
 * 
 * [멤버변수, 메서드]
 * 1.static 있는것(=클래스 변수 또는 클래스 매서드 : 클래스이름으로 접근하므로) : 공유
 *  - Book 클래스(Book.class)가 메모리에 로딩될때 그 때 함께 올라감
 *  (이때, static 멤버변수는 초기화되어서 올라감)
 *  -만약, static 멤버변수는 '명시적인 값으로 초기화' 하지 않으면 '기본값'으로 채워짐
 *  그러나, final이 있으면 반드시 최최의 1번은 '명시적인 값으로 초기화' 시켜줘야함
 *  
 *  [static 멤버변수에 값을 저장하는 방법]
 *  메모리에 올라갈 때 기본값 또는 명시적인 값으로 초기화 하여 올라감
 *  1. 기본값
 *  2. 명시적으로 초기화
 *  3. 생성자를 통해 값 변경 가능
 *  	단, static final은 생성자를 통해 값 변경(이유? 이미 값이 채워져 있어 값 변경 불가)
 *  
 *  -'클래스이름' 으로 접근 가능(권장)
 *  -'객체주소'로도 접근 가능(경고)
 *  
 *  2.static 없는것(=instance 변수 또는 instance 메서드) : 객체 안에 존재
 *  - '생성자를 통해 멤버변수에 값을 채워' 객체 생성되면 메모리에 올라감
 *  - static 없는 멤버변수/메서드는 그 해당 객체 안에 존재
 *  
 *  [static 없는 멤버변수에 값을 저장하는 방법]
 *  1. 기본값
 *  2. 명시적으로 초기화
 *  3. 생성자를 통해 초기화
 *  - 이때, final 멤버변수 : 반드시 최초의 1번은 초기화(명시적 또는 생성자를 통해 초기화)
 *  					2. 명시적으로 초기화 : 모든 객체의 final 멤버 변수의 값이 같아짐
 *  					3. 생성자를 통해 초기화 : 생성자의 매개값에 따라 각 객체 안이 final 멤버변수의 '값이 달라짐'
 *  
 *  - 반드시 객체의 '주소로만' 접근가능
 *  (this : 자신의 객체주소, 해당 객체 안에만 존재. this로 static 멤버에 접근가능하나 경고)
 *  
 *  3.final 멤버변수 : 반드시 최초의 1번은 초기화시켜주고 -> 값변경 불가
 *  				변수이름은 '대문자'로 사용(권장)
 *  
 *  
 *  [초기화 방법]
 *  1. 기본값(X)
 *  2. 명시적으로 초기화
 *  3. 생성자를 통해 초기화
 *  - 이때, final 멤버변수 : 반드시 최초의 1번은 초기화(명시적 또는 생성자를 통해 초기화)
 *  					2. 명시적으로 초기화 : 모든 객체의 final 멤버 변수의 값이 같아짐
 *  					3. 생성자를 통해 초기화 : 생성자의 매개값에 따라 각 객체 안이 final 멤버변수의 '값이 달라짐'
 *  
 *  4.static final 멤버변수 : 반드시 '명시적으로 초기화'해야 함
 *  						static(공유) + final(값 변경 불가)
 *  
 *  5.private 멤버변수 : 다른 클래스에서는 접근 불가 -> 정보 은닉(=캡슐화)
 *  					[접근 방법]
 *  					'같은 클래스 안의 접근 가능한 메서드를 통해' 간접접근하여 값을 얻거나(=get~())
 *  					다른 값으로 변경(=set())할 수 있다.
 *  	private 멤버변수/메서드는 상속불가
 *  
 *  [final]
 *  1. final class 클래스명 : 상속불가, 자식 클래스가 없음
 *  2. final 멤버변수 : 값 변경 불가
 *  3. final 메서드 : 재정의 불가
 *  
 *  [static 매서드가 되는 조건]
 *  1. 조건 : 메서드()가 static없는 맴버변수(=instance 변수)를 필요로 하지 않고
 *  		static있는 멤버변수 또는 매개변수 를 핑료로 한다.
 *  		이 조건을 만족하면 메서드 앞에 static 붙일 수 있다.
 *  
 *  static 있는 멤버변수나 메서드는 해당 클래스(Math.class)가 메모리에 로딩될 때 함께 메모리에 올라옴
 *  static 없는 멤버변수나 메서드는 생성자를 통해 객체 생성하여 메모리에 올라올 때 그 객체 안에 존재
 */

package book;

import java.util.Objects;

public class Book {
	/*
	 * 1.속성 => 멤버변수(=field)
	 * 
	 * 3.기능 => 매서드
	 */
	public String bookName;
	private String bookAuthor;
	
	public final int barcode;//반드시 1번만 초기화
	//static은 생성자를 통해 값을 채울 수 없다.
	public static final int BOOKPRICE;
	//static final = static은 메모리에 값을 채워 올라감(기본값 또는 '명시적'인 값) + final : 반드시 1범만 초기화
	//static final은 반드시 명시적으로 값을 초기화 해줘야함
	//static 생성자를 통해 값을 설정하는건 불가능
	public static String bookCampany = "기술출판사";	
	
	
	
	
	/*
	 * [static 초기화 블럭] static 멤버변수에 초기값을 적용
	 * - 언제 사용? '복잡한 계산'을 해야 하거나 '매서드 호출한 결과'를 초기값으로
	 * 설정시켜야 할 때
	 */
	
	static {
		int hap = 0;
		for(int i =1; i <= 100; i++) {
			hap += i;
		}
//		BOOKPRICE = hap;
		
		BOOKPRICE = hap(10, 100);
	}
	
	/*
	 * instance 초기화 블럭
	 * 생성자가 호출되기 직전에 초기화 블록이 실행됨
	 * -언제사용? 복잡한 계산을 해야 하거나 매서드 호출한 결과를 초기값으로 세팅 시켜야 할 때
	 */
	
//	{
//		System.out.println("초기화 블럭");
//		barcode = Math.abs(-12345) + 10;
//	}
	
	
	
	public Book() {
		super();
		//초기화 블럭 주석해제 하면 오류, final barcode : 초기화 블록을 통해 초기화 후 생성자를 통해 값 변경 불가
		barcode = 11111;//this.생략 가능, 같은 클래스 안에 있으므로
		
	}
	
	public Book(String bookName, String bookAuthor) {
//		super();
//		this.bookName = bookName;
//		this.bookAuthor = bookAuthor;
//		barcode = 22222; //각 객체의 바코드 값이 동일해짐
		//super();오류발생
		/*
		 * this() : 이 코드 위에는 어떠한 실행문도 있어서는 안됨
		 * 이유? this를 이용하여 다른 생성자를 호출할 대는 첫 번째 줄에 super(); 호출하면 안됨
		 * 
		 */
		this(bookName, bookAuthor,22222);
	}

	public Book(String bookName, String bookAuthor, int barcode) {
		super();//반드시 생성자의 맨 첫줄에 1. 부모(Object) 생성자 호출 -> 부모 객체 생성
		
		this.bookName = bookName;//2. 자식의 각 멤버변수에 값을 채워 자식 객체 생성
		this.bookAuthor = bookAuthor;//this. 생략 불가 멤버변수와 매개변수를 구분하기 위해서
		this.barcode = barcode;//매개 값에 따라 바코드값이 달라짐
		
	}
	
	/*
	 * 3.기능 => 매서드
	 * get~() : 멤버변수의 값을 얻어올 떄
	 * set~() : 멤버변수의 값을 수정할때
	 */
	
	
	//static O-------------------------------------------------------------------------------------
	//매서드 호출한 결과
	static int hap(int start, int end) {
		int hap = 0;
		for(int i = start; i <= end; i++) {
			hap += i;
		}
		return hap;
	}
	
	public static int getBookprice() {
		return Book.BOOKPRICE;
		//이떄 this.으로도 접근 가능하다. 경고
		//그러나, static메서드 일때 this.는 사용 불가
		//static메서드는 객체 생성 이전에 이미 메모리에 올라와 있으므로
	}

	//static x---------------------------------------------------------------------------------------
	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public int getBarcode() {
		return barcode;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public void showBookInfo() {
		System.out.println("Book [bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", barcode=" + barcode + 
				"Price = " + Book.BOOKPRICE + ", 출판사" + Book.bookCampany + "]");
	}

	
	
	/*
	 * 매서드 재정의 : 부모로부터 상속받은 매서드를 그대로 사용하지 않고 자식클래스에서 재정의
	 * 1. '리턴타입과 매서드이름(매개변수)'가 부모와 같아야 한다.
	 * 		단, 리턴타입은 자식 클래스 타입으로 변경가능하다.
	 * 
	 * 2. 재정의 할 때 '접근 제한자는 부모와 같거나 더 넓은 범위로' 한다.
	 * (그래야 부모의 매서드를 재정의된 자식의 메서드로 덮어씌워서
	 * 컴파일러가 재정의된 자식 메서드만 호출할 수 있도록 한다.)
	 * 
	 * public > protected > 아무것도 없는 것 > private
	 * 
	 * 3. 예외처리는 부모 클래스 메서드의 예외보다 더 많이 선언할 수 없다.
	 *   (예-1) 부모메서드() throws IOException, SQLException
	 *   		자식메서드() throws IOException
	 *   		자식메서드() throws SQLException
	 *   
	 *   (예-2) 부모메서드() throws IOException, SQLException
	 *   		자식메서드() throws SocketException (가능) : 
	 *   		SocketException extends IOException, IOException의 자식이라 가능
	 *   		자식메서드() throws Exception (불가능) : 
	 *   		Exception은 모든 예외의 부모, DownCasting이 안되어 있어서 불가능함
	 *   
	 *   재정의 메서드는 재정의된 메서드가 예외를 선언하는지 여부에 관계 없이 
	 *   확인되지 않은 (런타임)예외를 throws 할 수 있다.
	 *   (예-3 예외) 부모매서드() {..}
	 *   			자식메서드() throws IOException {..}
	 *   			자식메서드() throws SocketException {..}
	 *   			자식메서드() throws NumberFormatException {..}
	 *   			=> 오류 유무는 자바컴파일러한테 맡김
	 */

	
	/*
	 * [toString() 재정의하는 이유]
	 * Object의 toString() : book.Book@adfa(객체주소로 만든 16진수 해쉬코드)
	 * -> Object의 toString()를 재정의하여 원하는 값을 리턴하기 위해서
	 * 
	 * toString() 재정의하는 방법 -1 : 오른쪽 클릭 -> 소스 -> 매서드 대체/구현(=overriding) 
	 * -> 재정의할 메서드 선택 -> 확인
	 * toString() 재정의하는 방법 -2 : 오른쪽 클릭 -> 소스 ->Generate toString()
	 * 
	 * @override : 어노테이션 - 감시자 역할 (재정의할 때 문법적으로 맞는지 확인하여 틀리면 오류를 띄워줌)
	 */
	
	
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", barcode=" + barcode + 
				"Price = " + Book.BOOKPRICE + ", 출판사" + Book.bookCampany + "]";
	}

	
	/*
	 * hashCode() 재정의 : 멤버변수의 값으로 해쉬코드 만듦 -> 같은 객체로 취급하여 add()할 수 없도록 함
	 * Hash~로 시작하는 클래스에서 같은 객체로 취급하여 추가할 수 없도록함
	 */

	@Override
	public int hashCode() {
		return Objects.hash(barcode, bookAuthor, bookName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return barcode == other.barcode && Objects.equals(bookAuthor, other.bookAuthor)
				&& Objects.equals(bookName, other.bookName);
	}
	
	

	
	
}
