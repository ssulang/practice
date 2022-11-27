package ch07;

public class StudentSubjectTest {

	public static void main(String[] arg) {
		
		Student studentLee = new Student(1001,"Lee");
		
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		Student studentKim = new Student(1001,"Lee");
		
		studentKim.addSubject("국어", 100);
		studentKim.addSubject("수학", 85);
		studentKim.addSubject("영어", 100);
		
		studentLee.showScoreInfo();
		System.out.println("====================");
		studentKim.showScoreInfo();
	}
}
