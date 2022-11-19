package ch6;

public class Company {

	private static Company instance = new Company();//instance라는 유일한 객체

	private Company() { //생성자
		
	}
	
	public static Company getInstace() {
		
		if( instance == null) {
			instance = new Company();
		}
		return instance;
	}
}//싱글톤 패턴