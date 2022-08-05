package inheritance;

public class GoldCustomer extends Customer {
	/*
	 * 자식만이 가진 특징 추가
	 */
	public double saleRatio;//세일 비율 추가 : gold부터 물건을 살 때 세일을 해줌

	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		
		saleRatio = 0.05;
	}

	@Override
	public int calcPrice(int productPrice) {
		bonusPoint += productPrice*bonusRatio;
		return (int)(productPrice*(1-saleRatio));
	}

	@Override
	public String toString() {
		return "GoldCustomer [saleRatio=" + saleRatio + ", customerID=" + customerID + ", customerName=" + customerName
				+ ", customerGrade=" + customerGrade + ", bonusPoint=" + bonusPoint + ", bonusRatio=" + bonusRatio
				+ "]";
	}

	public double getSaleRatio() {
		return saleRatio;
	}

	public final void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
	
	//자식에만 추가한 메서드
	void showSaleRatio() {
		System.out.println(customerName + " 님은 " + customerGrade + " 등급으로 세일 비율이 " + saleRatio + " 입니다.");
	}

	
	
	
	
	
	
	
	
}
