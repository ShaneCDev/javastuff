package Lab9;

public class Library
{
	private String name;
	public Book myBooks[] = new Book[10];
	private int bookCount = 0;
	
	public Library()
	{
		
	}
	public Library(String name)
	{
		this.name = name;
	}
	public void AddBook(Book book)
	{
		myBooks[bookCount] = book;
		bookCount++;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
}
