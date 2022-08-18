package interfaceEx_inherit_book;

public class MyClassMain {

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		
		//인터페이스 X로 받으면 X에 선언한 메서드만 호출가능
		X x = myClass;
		x.x();
		
		//인터페이스 Y로 받으면 Y에 선언한 메서드만 호출 가능
		Y y = myClass;
		y.y();
		
		
		//인터페이스 MyInterface로 받으면 MyInterface에 선언한 메서드 + 상혹한 메서드 모두 호출가능
		MyInterface mi = myClass;
		mi.x();
		mi.y();
		mi.myMethod();

	}

}
