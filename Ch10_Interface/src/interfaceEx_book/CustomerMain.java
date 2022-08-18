package interfaceEx_book;

public class CustomerMain {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Customer customer2 = new Customer();
		
		Buy buyer = customer;
		buyer.buy();//재정의
		buyer.order();//재정의
		
		Sell seller = customer;//Sell을 구현한 클래스1을
//		Sell seller = customer2;//Sell을 구현한 클래스2로 변경해도 아래 소스는 그대로 사용
		seller.sell();//재정의
		seller.order();//재정의
		
		/*
		 * 자식에 추가된 멤버를 사용하기 위해
		 */
		
		customer.order();
		if(seller instanceof Customer) {
			System.out.println("----");
			Customer c = (Customer)seller;
			c.buy();
			c.sell();
			c.customerMethod();
			System.out.println("----");
		}
		if(seller instanceof Customer2) {
			System.out.println("----");
			Customer2 c2 = (Customer2)seller;
			c2.buy();
			c2.sell();
			c2.customerMethod();
			System.out.println("----");
		}

	}

}
