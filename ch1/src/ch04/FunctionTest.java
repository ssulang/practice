package ch04;

public class FunctionTest {
	
	public static int addNum(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	} //함수
	
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	} //반환값이 없을경우 void를 사용
	
	public static int calcSum() {
		
		int sum = 0;
		int i;
		
		for(i = 0; i<=100; i++) {
			sum += i;
		} //반복문
		
		return sum;
	}


	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		
		int total = addNum(n1, n2); //덧셈 메소드
		//반환값           //변수입력
		
		sayHello("안녕하세요"); //출력 메소드
		int num = calcSum(); //1~100까지의 합셈 메소드
		
		System.out.println(total);
		System.out.println(num);
	}
}
