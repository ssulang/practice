package ch4;

public class PersonTest {

	public static void main(String[] args) {
		Person userTomas = new Person();
		userTomas.tall = 180;
		userTomas.weight = 78;
		userTomas.gender = "남성";
		userTomas.name = "Tomas";
		userTomas.age = 37;
		
		System.out.println(userTomas.personInfo());

	}

}
