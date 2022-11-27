package ch07;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] arr = new int[10];//배열 10개입력
		int total = 0;
		
		for(int i=0, num=1; i<10; i++) { // [1,2,3,4,5,6,7,8,9,10]
			arr[i] = num++;
		}
		
		for(int num : arr){// for( 변수 : 배열) 
			total += num;
		}
		//배열의 n개 요소를 0 부터 n-1까지 순차적으로 순회할 때 간단하게 사용
		System.out.println(total);
	}

}
