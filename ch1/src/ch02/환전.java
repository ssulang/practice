package ch02;

public class 환전 {

	public static void main(String[] args) {
		int euro = Integer.parseInt(args[0]);
		
		int dollar = Integer.parseInt(args[1]);
		
		double euroToKwn = 1281.62664;
		double dollarToKwn = 1091.70306;
		
		double Kwn = (euro * euroToKwn) + (dollar * dollarToKwn);
		
		System.out.printf("환전결과: %.0f원",Kwn);//%.0f 소수점 이하가 안보이게 함
				

	}

}
