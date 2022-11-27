package ch02;

public class 타입변환 {

	public static void main(String[] args) {
		int a = 2;
		System.out.println(a); // 2 -> 2
		
		double b = 2/3;  // 2/3 ->0 ->0.0
		System.out.println(b); // int / int -> int
		
		int c = (int)1.5;
		System.out.println(c); // 캐스팅 : 강제적으로 형을 변환 시킨
		
		double d = 0;  // 자동변환 : 0 -> 0.0
		System.out.println(d);
		
		double e = (double)2/3; //연산자 우선순위
		System.out.println(e);
		

	}

}
