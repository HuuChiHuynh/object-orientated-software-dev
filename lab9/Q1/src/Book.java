public class Book extends LibraryItem implements LoanItem {
	private String author;
	private String title;
	private int numPages;
	
	public Book(String author, String title, int numPages) {
		setAuthor(author);
		setTitle(title);
		setNumPages(numPages);
	}

	public double calculatePrice() {
		return numPages * 0.015;
	}

	public int getNumPages() {
		return numPages;
	}

	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
