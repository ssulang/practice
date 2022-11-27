package ch08b;

public class Customer {
	
	protected int customerID; //외부 클래스는 접근 할 수 없지만, 하위 클래스는 접근 할 수 있도록 protected 접근 제어자를 사용
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	// 디폴트 생성자 없애고 매개 변수가 있는 생성자 추가
	public Customer(int customerID, String customerName) {
			this.customerID = customerID;
			this.customerName = customerName;
			
			customerGrade = "SILVER";
			bonusRatio = 0.01;
			System.out.println("Customer(int, String) 생성자 호출");
	}

	
	public int calcprice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public String showCustmonerInfo() {
		return customerName + "님의 등급은" + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.";
	}
}
