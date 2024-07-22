package object;

public class Ex4 {

	public static void main(String[] args) {
		Book book = new Book(200, "개미");
		
		System.out.println(book.toString());
		System.out.println(book);
		
		Book book2 = book;
		
		System.out.println(book.hashCode());
		System.out.println(book2.hashCode()); // 같은 인스턴스를 바라보기 때문에 주소가 같음
	}

}

class Book {
	int bookNumber;
	String bookTitle;
	
	public Book(int bookNumber, String bookTitle) {
		super();
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

//	@Override
//	public String toString() {
//		return "Book [bookNumber=" + bookNumber + ", bookTitle=" + bookTitle + "]";
//	}
}
