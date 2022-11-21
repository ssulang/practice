package ch7;

public class ObjectCopyTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];

		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");

		System.arraycopy(library, 0, copyLibrary, 0, 5); //System.arraycopy(소스,어디서,어디로,어디부터,어디까지)

		System.out.println("== library ==");
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}

		System.out.println("== copy library ==");
		for(Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo(); //얕은 복사
		}

		library[0].setAuthor("박완서");
		library[0].setTitle("나목"); //배열값 바꾸기

		System.out.println("== library ==");
		for(Book book : library) {
			System.out.println(book);
			book.showInfo(); 
		}
		
		System.out.println("== copy library ==");
		for(Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo(); //배열은 같지만 다른 객체
							 //깊은 복사
		}
		

	}

}


