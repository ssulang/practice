package ch05;

public class BirthDayTest {

	public static void main(String[] args) {
		
		BirthDay date = new BirthDay();
		date.setYear(2019);
		date.setMonth(12);
		date.setDay(30);
		
		date.showDate();
		
		BirthDay Date = new BirthDay();
		Date.setYear(2019);
		Date.setMonth(14);
		Date.setDay(30);
		
		Date.showDate();
	}
}
