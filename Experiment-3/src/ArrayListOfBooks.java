import java.util.ArrayList;

public class ArrayListOfBooks 
{
	public static void main(String args[]) 
	{
		ArrayList<Book> bList = new ArrayList<Book>();

		// Without parameters 
		Book b1 = new Book();
		bList.add(b1);

		// With parameters (name, author, genre, price) — throws InvalidPriceException or InvalidGenreException
		Book b2 = null;
		try {
			b2 = new Book("Eclipse", "Stephenie Meyer", "Fiction", 455.50);
			bList.add(b2);
		} catch (InvalidPriceException ip) {
			System.out.println("Book 2 - Price Error: " + ip.getMessage());
		} catch (InvalidGenreException ig) {
			System.out.println("Book 2 - Genre Error: " + ig.getMessage());
		}

		// Constructor (name, author, price, ISBN) — throws InvalidPriceException only
		Book b3 = null;
		try {
			b3 = new Book("Atomic Habits", "James Clear", 1111, "HLP12345");
			bList.add(b3);
		} catch (InvalidPriceException ip) {
			System.out.println("Book 3 - Price Error: " + ip.getMessage());
		}

		// Copy of b2 with modified fields
		if (b2 != null) {
			Book b4 = new Book(b2);
			b4.name = "Harry Potter and the Deathly Hallows";
			b4.authorName = "JK Rowling";
			bList.add(b4);
		}

		// Copy of b3 — copy constructor throws no exceptions
		if (b3 != null) {
			Book b5 = new Book(b3);
			bList.add(b5);
		}

		// Print all books
		bList.forEach(b -> {
			System.out.println("---------------------");
			System.out.println("Name: " + b.name);
			System.out.println("Author: " + b.authorName);
			System.out.println("Price: " + b.price);
			System.out.println("Publisher: " + b.publisherName);
			System.out.println("Genre: " + b.genre);
			System.out.println("ISBN: " + b.ISBN);
			System.out.println("Date: " + b.dateOfPublishing);
			System.out.println("---------------------");
		});

		// Print average price
		printAveragePrice(bList);

		// Print books by genre
		System.out.println("\nFiction books:");
		printBooksByGenre(bList, "Fiction");
	}

	public static void printAveragePrice(ArrayList<Book> books) {
		if (books.isEmpty()) {
			System.out.println("No books available.");
			return;
		}

		double sum = 0;
		for (Book b : books) {
			sum += b.price;
		}

		double avg = sum / books.size();
		System.out.println("\nAverage Price: " + avg);
	}

	public static void printBooksByGenre(ArrayList<Book> books, String genre) {
		books.forEach(book -> {
			if (book.genre != null && book.genre.equalsIgnoreCase(genre)) {
				System.out.println("Name: " + book.name + ", Author: " + book.authorName + ", Price: " + book.price);
			}
		});
	}
}