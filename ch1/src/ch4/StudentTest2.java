package ch4;

public class StudentTest2 {

	public static void main(String[] args) {

		//Student studentLee = new Student();
		
		Student2 studentLee = new Student2(12345, "Lee", 3);
		
		String data = studentLee.showStudentInfo();
		System.out.println(data);
	}

}
