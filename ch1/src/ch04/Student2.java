package ch04;

public class Student2 {

	public int studentNumber;
	public String studentName;
	public int grade; //맴버변수
	
	public Student2(int studentNumber, String studentName, int grade) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}//전달인자 부분이 객체 속성과 이름이 동일할 경우 this. 으로 구분
	
	public String showStudentInfo() {
		return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학년 입니다.";
	} //반환
}
