package ch07;

import java.util.ArrayList;

public class Student {

	int studentId;
	String studentName;  

	ArrayList<Subject> subjectList;


	Student(int studentId, String StudentName){
		this.studentId = studentId;
		this.studentName = StudentName;

		subjectList = new ArrayList<>();	
	}

	public void addSubject(String name, int point) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(point);
		
		subjectList.add(subject);
	}
	
	public void showScoreInfo() {

		int total = 0;
		
		for(Subject subject : subjectList) {
			
			total += subject.getScorePoint();
			System.out.println(studentName + "학생의 " + subject.getName() + "과목의 성적은." + subject.getScorePoint() + "입니다.");
		}
		
	}
}
