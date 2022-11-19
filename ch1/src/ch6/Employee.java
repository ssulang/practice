package ch6;

public class Employee {

	private static int serialNum = 1000;//기준이 되는 변수(변경x)
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public static int getSerialNum() {
		
		int i = 0;//지역변수
		
		//employeeName = "Lee"; //인스턴스 변수
		
		return serialNum; //static변수
	}

	//public static void setSerialNum(int serialNum) {
	//	Employee.serialNum = serialNum;
	//}    //기준이 됨으로 setter는 사용x

	public Employee() {
		//serialNum = 1000;  일반 메소드에서는 메모리에 있어서 사용가능
		serialNum++;//생성될때마다 증가
		employeeId = serialNum; //각각 다른 번호로 변수 입력
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department; //source - getters,setters
	}
}
