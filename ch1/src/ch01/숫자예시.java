package ch01;

public class 숫자예시 {

	public static void main(String[] args) {
		//메뉴가격
		int duckboki = 2500;
		int twikim = 700;
		int soondae = 3000;
		//갯수
		int duckbokiCount = 2;
		int twikimCount = 8;
		int soondaeCount = 1;
		//최종 금액
		int totalPrince = duckboki * duckbokiCount 
						+ twikim * twikimCount 
						+ soondae * soondaeCount;
		//결과 출력
		System.out.println(totalPrince);
	}

}
