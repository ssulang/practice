package ch8b;

public class VIPCustomer extends Customer { //상속
	
	double salesRatio;
	private String agentID;
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) 생성자 호출");
}

	
	public String getagentID() {
		return agentID;
	}
}
