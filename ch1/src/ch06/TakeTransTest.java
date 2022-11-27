package ch06;

public class TakeTransTest {

	public static void main(String[] args) {
		Student studentJ = new Student("James",5000);
		Student studentT = new Student("Tomas",10000);//학생정보

		Bus bus100 = new Bus(100);//100번버스
		Bus bus500 = new Bus(500);
		
		studentJ.takeBus(bus100);//James는 100번버스를 탔다
		
		Subway greenSubway = new Subway(2); //2번라인
		studentT.takeSubway(greenSubway);//Tomas는 지하철을 탔다
		
		studentJ.showInfo();
		studentT.showInfo();
		
		bus100.showBusInfo();
		greenSubway.showBusInfo();
		
		bus500.showBusInfo();
	}

}
