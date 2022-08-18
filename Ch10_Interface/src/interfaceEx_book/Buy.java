package interfaceEx_book;
/*
 * 한 클래스가 여러 인터페이스를 구현하는 경우
 */
public interface Buy {
	void buy();
	
	default void order() {//필요시 재정의
		System.out.println("구매 주문");
	}
}
