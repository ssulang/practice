package ch10;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public void starCar() {
		System.out.println("시동을 켭니다");		
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다");
	}
	
	final public void run() { //final 하위클래스에서 재정의를 못함
		starCar();
		drive();
		stop();
		turnOff();
	}
}
