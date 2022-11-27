package ch10;
//abstract -NoteBook이란 메소드를 구현을 안하겠다는 의미
public abstract class NoteBook extends Computer {

	@Override
	public void display() {
		System.out.println("NoteBook display");
		
	}

}
