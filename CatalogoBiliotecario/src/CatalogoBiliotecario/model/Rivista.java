package CatalogoBiliotecario.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;

import CatalogoBiliotecario.enumerated.Periodicita;

@Entity
@NamedQuery(name = "Rivista.findISBN", query = "SELECT r FROM Rivista r WHERE r.codiceISBN LIKE :cod_riv")
@NamedQuery(name = "Rivista.findAnno", query = "SELECT r FROM Rivista r WHERE r.annoPubblicazione LIKE :riv_anno")
public class Rivista extends ArticoloBiblioteca {
	
	@Column(nullable = false)
	private Periodicita periodicita;

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}

	@Override
	public String toString() {
		return "Rivista [periodicita=" + periodicita + ", getId()=" + getId() + ", getCodiceISBN()=" + getCodiceISBN()
				+ ", getTitolo()=" + getTitolo() + ", getAnnoPubblicazione()=" + getAnnoPubblicazione()
				+ ", getNumeroPagine()=" + getNumeroPagine() + "]";
	}
	
	
	
	
	

}
