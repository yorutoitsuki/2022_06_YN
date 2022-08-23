package classEX;
/*
 * class 클래스
 * 자바의 모든 클래스와 인터페이스는 컴파일을 하면 class파일 생성됨
 * Class 클래스는 컴파일된 class파일에 저장된 클래스나 인터페이스 정보를 가져오는데 사용함
 */

public class ClassTest_PersonMain {
	public static void main(String[] args) {
		//Class 클래스를 선언하고 클래스 정보를 가져오는 3가지 방법
		
		//방법 1 : 생성된 객체 필요
		Person person = new Person();
		Class p1 = person.getClass();
		System.out.println(p1.getName());
		
		//방법 2 
		Class p2 = Person.class;
		System.out.println(p2.getSimpleName());
		
		//방법 3
		//컴파일러가 Person클래스를 찾아서 있으면 메모리에 로딩 시킴(=동적 로딩)
		Class p3 = null;
		try {
			p3 = Class.forName("classEX.Person");
		} catch (ClassNotFoundException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
		System.out.println(p3.getSimpleName());

	}

}
