package ch7;

public class TwoDimensionTest {

	public static void main(String[] args) {
		int[][] arr = { {1,2,3}, {4,5,6,7}}; //데이터 지정할때 , 자료형[][]배열이름 = new int [행 개수][열 개수]
		int i, j;
		
		for(i =0; i<arr.length; i++) {
			for(j=0; j<arr[i].length; j++) { //첫번째 행
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(", \t" + arr[i].length); // \t 탭
			System.out.println();
		}
	}
}
