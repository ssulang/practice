package ch03;

public class WhileTest {

	public static void main(String[] args) {

		int num = 1;
		int sum  = 0;
		
		while( num <= 10) {
			
			sum += num;
			num++;
		}
		
		System.out.println(sum);
		System.out.println(num);
	}

} // sum = 0 + 1
  // sum = 1 + 2 
  // sum = 3 + 3 ...
  // sum = 45 + 10
