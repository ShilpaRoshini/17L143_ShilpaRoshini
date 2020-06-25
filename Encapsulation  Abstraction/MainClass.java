
public class MainClass {
	public static void main(String[] args) {
		Author author=new Author("shilprose","shilprose@gmail.com","F");
		Book book=new Book("shilprose","shilprose@gmail.com","F","rose",87.987654,author,2);
		System.out.println(book.toString());
	}

}
