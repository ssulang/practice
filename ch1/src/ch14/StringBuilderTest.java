package ch14;

public class StringBuilderTest {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));
		buffer.append("android");//문자열 합치기
		System.out.println(System.identityHashCode(buffer));
		
		java = buffer.toString();
	}
}

//StringBuilder는 append를 통해서 문자열을 붙여준다. 
//아까 concat과의 차이는 문자열을 계속 붙여도 주소값이 변하지 않는다
