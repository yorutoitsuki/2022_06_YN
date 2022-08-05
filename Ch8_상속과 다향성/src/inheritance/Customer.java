package inheritance;

/*
 * 부모 : 자손의 공통된 특징(속성과 기능)
 */
public class Customer {//고객 : 부모
	/*
	 * protected(같은 패키지에서 접근 가능, 다른 패키지에서는 자식만 접근 가능)
	 */
	 protected int customerID;//고객 아이디
	 protected String customerName;//고객 이름
	 protected String customerGrade;//고객 등급
	 
	 //같은 패키지에서만 접근 가능
	 int bonusPoint = 0;//보너스 포인트
	 double bonusRatio;//적립 비율
	 
	 //생성자 : 처음 고객 등록시 고객 등급 = "SILVER", 적립 비율 = 0.01 = 1%
	 Customer() {
		 super();
//		 customerGrade = "SILVER";
//		 bonusRatio = 0.01;
		 initCustomer();
	 }

	public Customer(int customerID, String customerName) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		
//		customerGrade = "SILVER";
//		bonusRatio = 0.01;
		initCustomer();
	}
	
	private void initCustomer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	
	/*
	 * 제품에 대해서 지불해야 하는 금액을 계산하여 반환
	 * (반환 하기 전에 보너스 포인트를 계산하여 누적)
	 */
	
	public int calcPrice(int productPrice) {//물건값
		bonusPoint -= productPrice*bonusRatio;
		return productPrice;
	}
	
	//메서드 작성할 때 리턴타입으로 작설할지 여부를 고민
	//고객 정보 반환
	String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + " 이며, 보너스 포인트는 " + bonusPoint + " 점 입니다.";
	}
	
	
	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", customerGrade="
				+ customerGrade + ", bonusPoint=" + bonusPoint + ", bonusRatio=" + bonusRatio + "]";
	}

	public final int getCustomerID() {//final : 재정의 불가
		return customerID;
	}

	public final void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public final String getCustomerName() {
		return customerName;
	}

	public final void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public final String getCustomerGrade() {
		return customerGrade;
	}

	public final void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public final int getBonusPoint() {
		return bonusPoint;
	}

//	public final void setBonusPoint(int bonusPoint) {
//		this.bonusPoint = bonusPoint;
//	}

	public final double getBonusRatio() {
		return bonusRatio;
	}

//	public final void setBonusRatio(double bonusRatio) {
//		this.bonusRatio = bonusRatio;
//	}
	
	void showNOsaleRatio() {
		System.out.println(customerGrade + " 등급은 세일 비율이 0%입니다");
	}
	 
}




















