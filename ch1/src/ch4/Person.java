package ch4;

public class Person {
	public int tall;
	public int weight;
	public String gender;
	public String name;
	public int age;
	
	public Person(){}
	
	public Person(int tall, int weight, String gender, String name, int age) {
		this.tall = tall;
		this.weight = weight;
		this.gender = gender;
		this.name = name;
		this.age = age;
	}

	public String personInfo() {
		return "키가 " + tall+" 이고 " + " 몸무게가 " + weight + " 인 " + gender + " 이 있습니다." + "이름은 " + name + " 이고 " + " 나이는 " + age +" 세입니다.";
	}
}