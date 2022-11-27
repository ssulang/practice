package ch08c;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		int price = customerLee.calcprice(1000);
		System.out.println(customerLee.showCustmonerInfo() + price);
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
		customerKim.bonusPoint = 10000;
		price = customerKim.calcprice(1000);
		System.out.println(customerKim.showCustmonerInfo() + price);
		
		Customer vc = new VIPCustomer(1234,"noname");
		//vc 변수의 타입은 Customer지만 인스턴스의 타입은 VIPCustomer 임
		System.out.println(vc.calcprice(1000));
		
		
	}
}
