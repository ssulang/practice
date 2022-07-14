package ch3;

public class BreakTest {

	public static void main(String[] args) {

		int sum = 0;
		int num;
		for( num = 1; ; num++) {  //for 반복
			
			sum += num;
			if( sum >= 100)	break; //if 조건
		}
		
		System.out.println(sum);
		System.out.println(num);
	}
}
