package ch14;

public class StringTest {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		System.out.println(System.identityHashCode(java));
		
		java = java.concat(android);//문자열 합치기
		
		System.out.println(java);
		System.out.println(System.identityHashCode(java));
		
	}
}
