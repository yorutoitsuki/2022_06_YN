package inheritance;

import java.util.ArrayList;

public class CustomerArrayListMain {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		customerList.add(new Customer(1, "Customer1"));
		customerList.add(new GoldCustomer(2, "Gold Customer1"));
		customerList.add(new VIPCustomer(3, "VIPCustomer1", 1234));
		
		System.out.println("고객정보 출력");
		System.out.println(customerList.toString());
		
		for(Customer c:customerList) {
			c.showCustomerInfo();
		}
		
		System.out.println("지불 가격과 보너스 포인트 출력");
		int productPrice = 10000;
		System.out.println("제품가격 " + productPrice + "원에 대해");
		
		for(Customer c:customerList) {
			System.out.println(c.customerGrade + "등급인 "+ c.customerName + "님은 " + c.calcPrice(productPrice) + "원 입니다");
			System.out.println("보너스 포인트는 " + c.bonusPoint);
			System.out.println();
		}
		
		System.out.println("고객의 세일비율 출력");
		
		for(Customer c:customerList) {
			if(c instanceof VIPCustomer) {
				((VIPCustomer) c).showSaleRatio();;
			}
			else if(c instanceof GoldCustomer) {
				((GoldCustomer) c).showSaleRatio();
			}
			else {
				c.showNOsaleRatio();
			}
		}
	}

}
