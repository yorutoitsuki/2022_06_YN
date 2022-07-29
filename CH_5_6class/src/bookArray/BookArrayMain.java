package bookArray;

import java.util.ArrayList;

import book.Book;

public class BookArrayMain {

	public static void main(String[] args) {
		/*
		 * 1. 배열을 이용하여 객체 관리
		 */
		
		ArrayList<Book> libraryA = new ArrayList<Book>();
		libraryA.add(new Book("태백산맥","조정래",1));
		libraryA.add(new Book("토지","박경리",2));
		libraryA.add(new Book("어린왕자","생택쥐베리",3));
		
		
		Book[] library = new Book[3];
		library[0] = new Book("태백산맥","조정래",1);
		library[1] = new Book("토지","박경리",2);
		library[2] = new Book("어린왕자","생택쥐베리",3);
		
		for(int i = 0; i < libraryA.size(); i++) {
			System.out.println(libraryA.get(i));
		}

		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		for(Book b:library) {
			b.showBookInfo();
		}
		
		System.out.println("-------------[토지] 객체 삭제 후 출력-------------------------");
		
		for(int i = 0; i < library.length; i++) {
			if(library[i].bookName.equalsIgnoreCase("토지")) {
				for(int j = i + 1; j < library.length; j++) {
					library[i] = library[j];
					i++;
				}
				library[library.length-1] = null;
			}
		}
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		/*
		 * 배열로 객체를 관리할 때 문제점?
		 * 1. 배열은 크기가 고정 : 메모리를 비효율적으로 사용
		 * 				(예) length == 100, 그런데 1개만 사용하면 나머지 99개는 비어있는 문제
		 * 					 length == 100, 그런데 1개가 더 필요한 상황
		 * 
		 * 2. 추가와 삭제에 대한 코드를 프로그래머가 작성해야함
		 * [컬렉션 프레임워크]의 클래스나 인터페이스를 이용하여 간단하게 해결할 수 있다.
		 * (예 : ArrayList, Vector, LinkedList / )
		 */
	}

}
