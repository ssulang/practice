package ch03;

import java.util.Scanner;

public class SwitchCaseTest2 {

	public static void main(String[] args) {
		
		System.out.println("1)Gold 2)Silver 3)Bronze");
		Scanner scanner = new Scanner(System.in);
		String medal = scanner.next();	
		
	
		
		switch(medal) {
		
			case "1":
				System.out.println("금메달 입니다.");
				break;
			case "2":
				System.out.println("은메달 입니다.");
				break;
			case "3":
				System.out.println("동메달 입니다.");
				break;
			default:
				System.out.println("메달이 없습니다.");
				break;
		}

	}
}
