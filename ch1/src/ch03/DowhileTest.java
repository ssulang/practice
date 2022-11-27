package ch03;

import java.util.Scanner;

public class DowhileTest {

	public static void main(String[] args) {

		System.out.println("숫자입력후 0을 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		int input; 
		int sum = 0;

		do {
			input = scanner.nextInt();
			sum += input;
			
		}while(input != 0);

			
		System.out.println(sum);
	}

}

// sum = sum + input
// sum = (sum+input) + input
// 0입력하면 반복 종료