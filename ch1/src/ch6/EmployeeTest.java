package ch6;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employeeLee = new Employee();//힙메모리 = 스택메모리
		employeeLee.setEmployeeName("이순신");
		
		System.out.println(employeeLee.getSerialNum());//데이터 영역
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신");

		System.out.println(employeeLee.getEmployeeName()+"님의 사번은"+ employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName()+"님의 사번은"+ employeeKim.getEmployeeId());
	}

}
