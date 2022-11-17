package ch5;

public class Person {

	String name;
	int age;
	
	public Person() {
		this("이름없음", 1); //String name, int age
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showPerson() {
		System.out.println(name + "," + age);
	}
	
	public static void main(String[] arg) {
		
		Person person = new Person();
		person.showPerson();
	}
	
}
 