package CatalogoBiliotecario.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Id;

@MappedSuperclass
public abstract class ArticoloBiblioteca {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(nullable = false, unique = true)
	private String codiceISBN;
	
	@Column(nullable = false)
	private String titolo;
	
	@Column(nullable = false)
	private int annoPubblicazione;
	
	@Column(nullable = false)
	private int numeroPagine;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getCodiceISBN() {
		return codiceISBN;
	}

	public void setCodiceISBN(String codiceISBN) {
		this.codiceISBN = codiceISBN;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getAnnoPubblicazione() {
		return annoPubblicazione;
	}

	public void setAnnoPubblicazione(int annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}

	public int getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(int numeroPagine) {
		this.numeroPagine = numeroPagine;
	}

	@Override
	public String toString() {
		return "ArticoloBiblioteca [Id=" + Id + ", codiceISBN=" + codiceISBN + ", titolo=" + titolo
				+ ", annoPubblicazione=" + annoPubblicazione + ", numeroPagine=" + numeroPagine + "]";
	}
	
	
	
	
	

}
