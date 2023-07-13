package model;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import enumerated.TipoEvento;

@Entity
@Table(name = "eventi")
public class Evento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String titolo;
	
	@Column(nullable = false)
	private LocalDate dataEvento;
	
	@Column(nullable = false)
	private String descrizione;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private TipoEvento tipoEvento;
	
	@Column(nullable = false)
	private int numeroMassimoPartecipanti;
	
	@Column(nullable = false)
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Partecipazione> partecipazioni;
	
	@Column(nullable = false)
	//@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Location location;

	public Evento() {
		super();
	}

	public Evento(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento,
			int numeroMassimoPartecipanti, Set<Partecipazione> partecipazioni, Location location) {
		super();
		this.titolo = titolo;
		this.dataEvento = dataEvento;
		this.descrizione = descrizione;
		this.tipoEvento = tipoEvento;
		this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
		this.partecipazioni = partecipazioni;
		this.location = location;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public LocalDate getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(LocalDate dataEvento) {
		this.dataEvento = dataEvento;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public int getNumeroMassimoPartecipanti() {
		return numeroMassimoPartecipanti;
	}

	public void setNumeroMassimoPartecipanti(int numeroMassimoPartecipanti) {
		this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
	}

	public Set<Partecipazione> getPartecipazioni() {
		return partecipazioni;
	}

	public void setPartecipazioni(Set<Partecipazione> partecipazioni) {
		this.partecipazioni = partecipazioni;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Evento [id=" + id + ", titolo=" + titolo + ", dataEvento=" + dataEvento + ", descrizione=" + descrizione
				+ ", tipoEvento=" + tipoEvento + ", numeroMassimoPartecipanti=" + numeroMassimoPartecipanti + "]";
	}
	
	
	
}
