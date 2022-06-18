package ch1;

public class 밥값계산 {

	public static void main(String[] args) {
		//구글링: 자바main 입력 , Integer.parseInt
		int donNum = Integer.parseInt(args[0]);
		int kalNum = Integer.parseInt(args[1]);
		int wangNum = Integer.parseInt(args[2]);
		
		int donSum = 8000 * donNum;
		int kalSum = 6000 * kalNum;
		int wangSum = 5000 * wangNum;
		int total = donSum + kalSum + wangSum;
		
		System.out.printf("%s x %2d = %d\n" , "돈 가 스", donNum, donSum);
		System.out.printf("%s x %2d = %d\n" , "칼 국 수", kalNum, kalSum);
		System.out.printf("%s x %2d = %d\n" , "왕 만 두", wangNum, wangSum);
		System.out.println("=====================");
		System.out.printf("총 합 : %d\n", total);
	}

}
