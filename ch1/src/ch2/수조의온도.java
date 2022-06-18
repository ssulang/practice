package ch2;

public class 수조의온도 {

	public static void main(String[] args) {
		double fahrenheit = Double.parseDouble(args[0]);

		double celsius = (fahrenheit - 32) / 1.8;
		
		System.out.println(celsius);
	}
}
