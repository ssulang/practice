package ch02;

public class 문자열을숫자로 {

	public static void main(String[] args) {
		
		//int seven = "7";
		int seven = Integer.parseInt("7");
		
		//double pi = "3.14";
		double pi = Double.parseDouble("3.14");
				
		System.out.println("seven =" + seven);
		System.out.println("pi = " + pi);
	}

}
