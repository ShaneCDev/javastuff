package Lab9;

public class Lab9Q1
{

	public static void main(String[] args)
	{
		Book book1 = new Book("Hello", "Shane Conway", 'A');
		Book book2 = new Book("Hello World", "Shane Conway", 'A');
		Book book3 = new Book("Book 3", "Stephen King", 'A');
		
		System.out.println(book1.getAuthor());
		System.out.println(book1.getISBN());
		System.out.println(book2.getAuthor());
		System.out.println(book2.getISBN());
		
		System.out.println("Num books: " + Book.getNumberOfBooks());
		
		Library myLibrary = new Library("IT Carlow");
		myLibrary.myBooks[0] = book1;
		myLibrary.myBooks[1] = book2;
		myLibrary.myBooks[2] = book3;
		
		
		System.out.println(myLibrary.getName());
		System.out.println(myLibrary.myBooks[0].getAuthor());
	}

}
