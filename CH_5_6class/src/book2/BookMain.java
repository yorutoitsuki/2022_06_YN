package book2;

/*
 * 다른 패키지에 있는 클래스는 반드시 import해서 사용해야 함
 * 이떄, public class Book이어야 다른 패키지 에서도 Book 클래스를 import할 수 있다.
 */
import book.Book;

public class BookMain {
	
	//public BookMain(){} 기본 생성자

	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book("test1","test2",22222);
		System.out.println("b1 바코드 : " + b1.barcode);
		System.out.println("b2 바코드 : " + b2.barcode);
		
		Book b3 = new Book("JAVA", "SPRING");
		System.out.println(b3.barcode);
		
		Book b4 = new Book("Oracle","HK",12345);
		System.out.println(b4.barcode);
		
		Book b5 = new Book("Oracle","HK",5546);
		System.out.println(b5.barcode);
	}

}
