package ch9;

public class VIPCustomer extends Customer { //상속
	
	double salesRatio;
	private String agentID;
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
}

	
	@Override /*상위 클래스에 정의된 메서드의 구현 내용이 하위 클래스에서 구현할 내용과 맞지 않는 경우
				하위 클래스에서 동일한 이름의 메서드를 재정의 할 수 있음*/
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		return super.calcPrice(price);
	}


	public String getagentID() {
		return agentID;
	}
	
	//showCustomerInfo() 재정의
	public String showCustomerInfo(){
			return super.showCustomerInfo() + " 담당 상담원 번호는 " + agentID + "입니다";  
	}

}
