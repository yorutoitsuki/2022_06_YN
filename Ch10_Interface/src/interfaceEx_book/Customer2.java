package interfaceEx_book;

public class Customer2 implements Buy, Sell{

	@Override
	public void sell() {
		System.out.println("판매하기2");
	}

	@Override
	public void buy() {
		System.out.println("구매하기2");
	}
	
	//Duplicate default methods named order with the parameters () and () are inherited from the types Sell and Buy
	/*
	 * 위 오류 메세지는 default 매서드가 중복되었으니 두 인터페이스를 구현하는 클래스에서 재정의하라 는 뜻
	 */
	@Override
	public void order() {
		System.out.println("고객 판매 주문2");
	}
	
	public void customerMethod() {
		System.out.println("Customer에 추가한 메서드2");
	}
	
}
