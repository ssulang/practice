package ch4;

public class Student {
	
	public int studentID;
	public String studentName;  
	public String address;
			
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	} //출력해주는 메소드 , 반환값은 없음
	
	public String getStudentName() {
		return studentName;
	} //변수 studentName를 반환해주는 메소드
	
	public void setStudentName(String name) { //String name 매개변수
		studentName = name;
	} //변수 studentName의 이름을 바꿔주는 메소드
}
