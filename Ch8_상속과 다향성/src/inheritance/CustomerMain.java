package inheritance;

public class CustomerMain {

	public static void main(String[] args) {
		Customer c = new Customer();
		System.out.println(c);
		
		c.setCustomerID(1);
		c.setCustomerName("C_NAME");
		
		System.out.println(c.showCustomerInfo());
		
		VIPCustomer v = new VIPCustomer();
		System.out.println(v);
		
		v.customerID = 2;
		v.customerName = "V_NAME";
		
//		v.setCustomerID(2);
//		v.setCustomerName("V_NAME");
		System.out.println(v.showCustomerInfo());
		System.out.println("------------------------");
		
		Customer c2 = new Customer(3,"C2_NAME");
		int productPrice = 10000;
		int c2Price = c.calcPrice(productPrice);
		System.out.println(c2.customerName + " 님이 " + c2Price + " 원을 지불하셨습니다");
		System.out.println(c2.showCustomerInfo());
		
		System.out.println("---------------------------------");
		
		GoldCustomer g= new GoldCustomer(4, "G_NAME");
		
		int gPrice = g.calcPrice(productPrice);
		System.out.println(g.customerName + " 님이 " + gPrice + " 원을 지불하셨습니다");
		System.out.println(g.showCustomerInfo());
		
		VIPCustomer v2 = new VIPCustomer(5, "V_NAME", 123);
		int v2Price = v2.calcPrice(productPrice);
		System.out.println(v2.customerName + " 님이 " + v2Price + " 원을 지불하셨습니다");
		System.out.println(v2.showCustomerInfo());
	}

}

















