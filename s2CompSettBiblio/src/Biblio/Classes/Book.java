package Biblio.Classes;

import Biblio.Enum.Genres;

public class Book extends LibraryElement {

	private Autor autor;
	private Genres genre;
	
	
	public Book(String iSBNCode, String title, Integer year, int numberOfPages, Autor autor, Genres genre) {
		super(iSBNCode, title, year, numberOfPages);
		this.autor = autor;
		this.genre = genre;
	}


	public Autor getAutor() {
		return autor;
	}


	public Genres getGenre() {
		return genre;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Autore: " + this.autor.toString() + " Genere: " + this.genre;
	}

}
