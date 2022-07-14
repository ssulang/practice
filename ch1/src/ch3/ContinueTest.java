package ch3;

public class ContinueTest {

	public static void main(String[] args) {
		int num;
		for( num = 1; num <= 100; num++) {
			
			if( (num % 3) != 0) continue; //% 나눈 나머지  , != 두항이 다르면 참 아니면 거짓  , continue는 참일경우에 이후에 있는 다른 수행문들을 수행하지 않음
			// ex) (9 % 3) !=0 은 두항이 같아서 거짓임으로 출력 
			// ex) (10 % 3) !=0 은 두항이 달라서 참임으로 출력하지 않고 반복문으로 이동
			System.out.println(num);
			
		}
	}
}
 