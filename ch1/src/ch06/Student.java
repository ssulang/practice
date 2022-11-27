package ch06;

public class Student {

	String studentName;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000; //-= 왼쪽항에서 오른쪽항을 빼서 그 값을 왼쪽항에 대입
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "원입니다.");
	}
}
