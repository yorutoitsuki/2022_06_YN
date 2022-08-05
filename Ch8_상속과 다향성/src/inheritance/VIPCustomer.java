package inheritance;

public class VIPCustomer extends Customer{
	public double saleRatio;//세일 비율
	private final int agentID;//VIP고객만 상담하는 아이디 추가
	
	public VIPCustomer() {
		super();
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
		agentID = 1111;;
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
		this.agentID = agentID;
	}
	
	

	@Override
	public int calcPrice(int productPrice) {
		bonusPoint += productPrice*bonusRatio;
		return (int)(productPrice*(1-saleRatio));
	}
	
	@Override
	public String toString() {
		return "VIPCustomer [saleRatio=" + saleRatio + ", agentID=" + agentID + ", customerID=" + customerID
				+ ", customerName=" + customerName + ", customerGrade=" + customerGrade + ", bonusPoint=" + bonusPoint
				+ ", bonusRatio=" + bonusRatio + "]";
	}
	
	public int getAgentID() {
		return agentID;
	}

	public double getSaleRatio() {
		return saleRatio;
	}

	public final void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
	
	//자식에만 추가한 메서드
	public void showSaleRatio() {
		System.out.println(customerName + " 님은 " + customerGrade + " 등급으로 세일 비율이 " + saleRatio + " 입니다.");
	}
	
	public void showAgentID() {
		System.out.println(customerName + " 님의 상담원 ID는 " + agentID + " 입니다.");
	}
}
