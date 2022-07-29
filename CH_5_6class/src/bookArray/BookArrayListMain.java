package bookArray;

import java.util.ArrayList;
import java.util.Arrays;

import book.Book;

public class BookArrayListMain {

	public static void main(String[] args) {
		/*
		 * 2. ArrayList를 이용하여 객체 관리 = 추가나 삭제가 편리
		 * -객체만 저장가능(=클래스타입만 저장가능) (기본타입은 저장불가능)
		 * ArrayList객체를 생성할 때 초기화가 안되는 단점이 있다.
		 * ("기본값"으로 채워짐) : Arrays.asList() 매서드를 사용하여 초기화 가능
		 * 배열은 초기화가 가능(예) int[] arr = {1,2,3}
		 */
		ArrayList<Book> library = new ArrayList<Book>();
		
		Book b1 = new Book("태백산맥","조정래",1);
		library.add(b1);
		Book b2 = new Book("토지","박경리",2);
		library.add(b2);
		Book b3 = new Book("어린왕자","생택쥐베리",3);
		library.add(b3);
		
		for(Book b:library) {
			System.out.println(b);
		}
		
		library.add(new Book("신데렐라","작자미상",2));
		
		for(Book b:library) {
			System.out.println(b);
		}
		
		for(int i = 0; i < library.size(); i++) {
			if(library.get(i).bookName.equalsIgnoreCase("신데렐라")) {
				library.remove(i);
			}
		}
		for(Book b:library) {
			System.out.println(b);
		}
		
		for(int i = 0; i < library.size(); i++) {
			if(library.get(i).bookName.equalsIgnoreCase("토지")) {
				library.remove(i);
			}
		}
		for(Book b:library) {
			System.out.println(b);
		}
		
		library.remove(b1);
		for(Book b:library) {
			System.out.println(b);
		}
		
		System.out.println("----------------------Integer----------------------------------------");
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(new Integer(1));
		number.add(2);
		number.add(3);
		number.add(4);
		
		System.out.println("향상된 for 사용");
		for(Integer value : number) {
			System.out.print(value.toString() + " ");
		}
		System.out.println();
		for(int value : number) {//자동 unboxing
			System.out.print(value + " ");
		}
		
		System.out.println("Integer 2 삭제");
		System.out.println(number.remove(1));
		
		System.out.println("ArrayList의 toString() 이용");
		System.out.println(number.toString());
		System.out.println(number);
		
		System.out.println("----------String-------------------------");
		System.out.println("ArrayList 객체 생성 시 초기화 안되는 단점 해결 방법 : Array.asList()메서드 사용");
		/*
		 * 순서1. 배열객체 생성
		 */
		String[] fruitArr = {"apple", "banana", "mango","kiwi"};
		//순서2.ArrayList.asList(초기화된 배열객체)사용하여 초기화된 ArrayList 객체 생성함
		ArrayList<String> fruits = new ArrayList<String>(Arrays.asList(fruitArr));
		fruits.add("딸기");
		
		System.out.println(fruits);
		fruits.remove(1);
		System.out.println(fruits);
		
		
	}

}
