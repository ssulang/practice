package ch01;

public class 변수값복사 {

	public static void main(String[] args) {
		double score = 1.0 + 2.0 * 3.0;
		System.out.println(score);
		double copy = score;
		copy = copy / 2.0;
		System.out.println(copy);

	}

}
