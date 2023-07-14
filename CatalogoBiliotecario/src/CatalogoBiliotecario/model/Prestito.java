package CatalogoBiliotecario.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "utenti")
public class Prestito {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Utente utente; 
	
	@OneToOne
	private Libro libroPrestato;
	
	@OneToOne
	private Rivista rivistaPrestata;
	
	@Column(nullable = false)
	private LocalDate dataInizioPrestito;
	
	@Column(nullable = false)
	private LocalDate dataRestituzionePrevista;
	
	@Column(nullable = false)
	private LocalDate dataRestituzioneEffettiva;

	public Prestito() {
		super();
	}

	public Prestito(Utente utente, Libro libroPrestato, LocalDate dataInizioPrestito,
			LocalDate dataRestituzionePrevista, LocalDate dataRestituzioneEffettiva) {
		super();
		this.utente = utente;
		this.libroPrestato = libroPrestato;
		this.dataInizioPrestito = dataInizioPrestito;
		this.dataRestituzionePrevista = dataRestituzionePrevista;
		this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
	}

	public Prestito( Utente utente, Rivista rivistaPrestata, LocalDate dataInizioPrestito,
			LocalDate dataRestituzionePrevista, LocalDate dataRestituzioneEffettiva) {
		super();
		this.utente = utente;
		this.rivistaPrestata = rivistaPrestata;
		this.dataInizioPrestito = dataInizioPrestito;
		this.dataRestituzionePrevista = dataRestituzionePrevista;
		this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public Libro getLibroPrestato() {
		return libroPrestato;
	}

	public void setLibroPrestato(Libro libroPrestato) {
		this.libroPrestato = libroPrestato;
	}

	public Rivista getRivistaPrestata() {
		return rivistaPrestata;
	}

	public void setRivistaPrestata(Rivista rivistaPrestata) {
		this.rivistaPrestata = rivistaPrestata;
	}

	public LocalDate getDataInizioPrestito() {
		return dataInizioPrestito;
	}

	public void setDataInizioPrestito(LocalDate dataInizioPrestito) {
		this.dataInizioPrestito = dataInizioPrestito;
	}

	public LocalDate getDataRestituzionePrevista() {
		return dataRestituzionePrevista;
	}

	public void setDataRestituzionePrevista(LocalDate dataRestituzionePrevista) {
		this.dataRestituzionePrevista = dataRestituzionePrevista;
	}

	public LocalDate getDataRestituzioneEffettiva() {
		return dataRestituzioneEffettiva;
	}

	public void setDataRestituzioneEffettiva(LocalDate dataRestituzioneEffettiva) {
		this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
	}

	@Override
	public String toString() {
		return "Prestito [id=" + id + ", utente=" + utente + ", libroPrestato=" + libroPrestato + ", rivistaPrestata="
				+ rivistaPrestata + ", dataInizioPrestito=" + dataInizioPrestito + ", dataRestituzionePrevista="
				+ dataRestituzionePrevista + ", dataRestituzioneEffettiva=" + dataRestituzioneEffettiva + "]";
	}
	
	

	

}
