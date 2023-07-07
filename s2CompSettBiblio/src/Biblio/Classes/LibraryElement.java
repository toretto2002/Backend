package Biblio.Classes;

public abstract class LibraryElement {
	
	protected String ISBNCode;
	protected String title;
	protected Integer year;
	protected int numberOfPages;
	
	
	public LibraryElement(String iSBNCode, String title, Integer year, int numberOfPages) {
		super();
		ISBNCode = iSBNCode;
		this.title = title;
		this.year = year;
		this.numberOfPages = numberOfPages;
	}
	
	public String getISBNCode() {
		return ISBNCode;
	}



	public String getTitle() {
		return title;
	}



	public Integer getYear() {
		return year;
	}



	public Integer getNumberOfPages() {
		return numberOfPages;
	}



	@Override
	public String toString() {
		return "Codice: " + this.ISBNCode + " Titolo: " + this.title + " Anno: " + this.year + " Numero di Pagine: " + this.numberOfPages;
	}
	
	
	
	
}
