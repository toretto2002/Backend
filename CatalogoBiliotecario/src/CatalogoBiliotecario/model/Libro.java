package CatalogoBiliotecario.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Libro.findISBN", query = "SELECT l FROM Libro l WHERE l.codiceISBN LIKE :cod_lib")
@NamedQuery(name = "Libro.findAnno", query = "SELECT l FROM Libro l WHERE l.annoPubblicazione = :lib_anno")
@NamedQuery(name = "Libro.findAutore", query = "SELECT l FROM Libro l WHERE l.autore LIKE :lib_autore")
@NamedQuery(name = "Libro.findTitolo", query = "SELECT l FROM Libro l WHERE l.titolo LIKE :lib_titolo")
public class Libro extends ArticoloBiblioteca {
	
	//I libri hanno inoltre:
	
	@Column(nullable = false)
	private String autore;
	
	@Column(nullable = false)
	private String genere;

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	@Override
	public String toString() {
		return "Libro [autore=" + autore + ", genere=" + genere + ", getId()=" + getId() + ", getCodiceISBN()="
				+ getCodiceISBN() + ", getTitolo()=" + getTitolo() + ", getAnnoPubblicazione()="
				+ getAnnoPubblicazione() + ", getNumeroPagine()=" + getNumeroPagine() + "]";
	}

	
	
	

	
	
	
	

}
