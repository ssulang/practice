package ch08;

public class VIPCustomer extends Customer { //상속
	
	double salesRatio;
	private String agentID;
	
	public VIPCustomer() {
		
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		
	}
	
	public String getagentID() {
		return agentID;
	}
}
