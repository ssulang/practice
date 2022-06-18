package ch1;

public class 쇼핑리스트 {
	
	
	public static void main(String[] args) {
		String item1 = "한우 꽃등심";
		String item2 = "참치 선물팩";
		String item3 = "맥스봉 한팩";
		
		int price1 = 12500;
		int price2 = 22500;
		int price3 = 5000;
		

		System.out.println("품명" + item1 + "가격" + price1);
		System.out.println("품명" + item2 + "가격" + price2);
		System.out.println("품명" + item3 + "가격" + price3);

		//%s : 문자열 출력
		//%d : 십진수를 출력 (%7d 오른쪽정렬 %-7d 왼쪽정렬(7은 맨뒤에 글자수에 따라 다름))
		//%f : 실수를 출력
		//\n : 엔터
		System.out.printf("품명: %s 가격:%7d \n", item1, price1);
		System.out.printf("품명: %s 가격:%7d \n", item2, price2);
		System.out.printf("품명: %s 가격:%7d \n", item3, price3);
				

	}

}


