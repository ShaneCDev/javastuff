package Lab9;

public class Book
{
	private String bookName;
	private String author;
	private int ISBN;
	private char status;
	private static int numberOfBooks = 0;
	
	public Book(String bookName, String author, char status)
	{
	
		this.bookName = bookName;
		this.author = author;
		ISBN = numberOfBooks + 1;
		numberOfBooks++;
		this.status = status;
		
	}
	public boolean Borrow()
	{
		if(status == 'B')
			return false;
		status = 'A';
		return true;
	}
	public void Return()
	{
		status = 'A';
	}
	public String getBookName()
	{
		return bookName;
	}

	public void setBookName(String bookName)
	{
		this.bookName = bookName;
	}

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public int getISBN()
	{
		return ISBN;
	}

	public void setISBN(int iSBN)
	{
		ISBN = iSBN;
	}

	public char getStatus()
	{
		return status;
	}

	public void setStatus(char status)
	{
		this.status = status;
	}

	public static int getNumberOfBooks()
	{
		return numberOfBooks;
	}

	public static void setNumberOfBooks(int numberOfBooks)
	{
		Book.numberOfBooks = numberOfBooks;
	}
	
}
