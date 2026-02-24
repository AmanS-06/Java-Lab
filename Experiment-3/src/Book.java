import java.time.LocalDate;

public class Book 
{
	// Declare the global variables
	public String name;
	public String authorName;
	public double price;
	public String publisherName;
	public String genre;
	public String ISBN;
	public LocalDate dateOfPublishing;

	// Constructor without parameters
	public Book() 
	{
		name = "NA";
		price = 0.0;
		authorName = "NA";
		publisherName = "NA";
		genre = "NA";
		ISBN = "00000000";
		dateOfPublishing = LocalDate.parse("2026-01-01");
	}

	// Constructor with parameters
	public Book(String n, String a, String g, double p) throws InvalidPriceException, InvalidGenreException
	{
		name = n;
		authorName = a;
		if (p < 0) 
		{
			throw new InvalidPriceException("Price cannot be negative!!");
		}
		price = p;
		if (!g.equalsIgnoreCase("fiction") && !g.equalsIgnoreCase("autobiography") && !g.equalsIgnoreCase("horror")) 
		{
			throw new InvalidGenreException("That genre does not exist!!");
		}
		genre = g;
	}

	// Another constructor but with different parameters
	public Book(String n, String a, double p, String isbn) throws InvalidPriceException
	{
		name = n;
		authorName = a;
		if (p < 0) 
		{
			throw new InvalidPriceException("Price cannot be negative!!");
		}
		price = p;
		ISBN = isbn;
	}

	public Book(Book b) 
	{
		name = b.name;
		authorName = b.authorName;
		price = b.price;
		publisherName = b.publisherName;
		genre = b.genre;
		ISBN = b.ISBN;
		dateOfPublishing = b.dateOfPublishing;
	}
}