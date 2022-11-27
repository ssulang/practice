package ch10;
//상속만을 위한 클래스
public class Desktop extends Computer {

	@Override
	public void display() {
		System.out.println("Desktop display");
		
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing");
		
	}

	@Override
	void turnOff() {
		System.out.println("Desktop turnOff");
	}

}
