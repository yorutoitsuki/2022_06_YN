package book;

//import book.Book;//같은 패키지내에 있음, import 할 필요 없음 고로 경고 뜸

public class BookMain {
	//1. 필드 = 멤버변수
	static String s1 = "Book 만들기 -1";
	String s2 = "Book 만들기 -2";
	
	//2. 기본생성자
	//public BookMain(){} 기본 생성자

	//3.메서드
	public static void main(String[] args) {
		System.out.println("---------------------[Book]-----------------------------------------");
		/*
		 * static O 멤버변수와 메서드
		 * static O 멤버에 접근 방법 : '클래스명.'으로 접근(권장)
		 */
		System.out.println("책가격 : " + Book.BOOKPRICE);
		System.out.println("책가격 : " + Book.getBookprice());
		
		//static O 멤버에 접근 방법 : '주소.'으로 접근(경고)
		Book b1 = new Book("뽀로로","아무개",11);
		System.out.println("책가격 : " + b1.BOOKPRICE);
		System.out.println("책가격 : " + b1.getBookprice());
		
		/*
		 * static X 멤버변수와 메서드
		 * static x 멤버에 접근 방법 : 생성자를 호출 -> 객체갱성
		 * 단, String은 "문자열 상수" 만으로도 객체 생성됨
		 */
		
		/*
		 * private 멤버는 다른 클래스에서 접근불가하므로 "접근가능한 메서드"를 통새서 간접 접근
		 */
		
		System.out.println("책 저자 -1 : " + b1.getBookAuthor());
		
		/*
		 * 멤버변수의 값을 출력하는 방법
		 */
		System.out.println("Book [bookName=" + b1.bookName + ", bookAuthor=" + b1.getBookAuthor() + ", barcode=" + b1.barcode + 
				"Price = " + Book.BOOKPRICE + ", 출판사" + Book.bookCampany + "]");
		
		//멤버변수의 값을 출력하는 방법2
		b1.showBookInfo();
		
		/*
		 * 멤버변수의 값을 출력하는 방법 3 : 객체의 값들을 리턴하는 "재정의된 toString()메서드" 호출 결과
		 * Object의 toString()메서드 호출 : book.Book@(객체주소로 만든 16진수 해쉬코드)
		 * ->Book 클래스에서 Object의 toString()메서드를 재정의 : 재정의된 메서드가 돌려주는 멤버변수의 값
		 */
		
		System.out.println(b1);
		System.out.println(b1.toString());
		
		System.out.println("---------------------[Book]-----------------------------------------");
		System.out.println(s1);//같은 클래스 안에 있으므로
		
		//기본생성자로 객체 생성
		BookMain bm = new BookMain();
		System.out.println(bm.s1);
		System.out.println(bm.s2);//bm 생략가능
		
		BookMain bm2 = new BookMain();
//		System.out.println(this.s1);//this 사용불가,main()은 static이므로 바로 메모리에올라가 있으므로 this 불가
		//즉 static 메서드 안에서는 this. 사용불가
//		System.out.println(this.s2);//static 영역에서 heap 영역으로 향하는 this는 불가능함, heap에서 static으로만 가능
		
	}//main()끝

	@Override
	public String toString() {
		/*
		 * BookMain 생략가능 같은 클래스 안에 있으므로
		 * this. 사용가능? toString()가 static 이 없으므로 각 객체안에 존재 -> 각체안에는 자신의 주소를 가진 this가 존재
		 */
		return "BookMain [s1 =" + BookMain.s1 + ", s2 = " + this.s2 + "]";
	}
	

}
