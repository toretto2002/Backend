package CatalogoBibliotecario.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import CatalogoBiliotecario.enumerated.Periodicita;
import CatalogoBiliotecario.model.ArticoloBiblioteca;
import CatalogoBiliotecario.model.Libro;
import CatalogoBiliotecario.model.Prestito;
import CatalogoBiliotecario.model.Rivista;
import CatalogoBiliotecario.model.Utente;

public class MainProject {
	
	static EntityManagerFactory  emf = Persistence.createEntityManagerFactory("CatalogoBiliotecario");
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {
		System.out.println("ciao");
		
		Libro l1 = new Libro();
		l1.setCodiceISBN("LB0002");
		l1.setTitolo("Lo Hobbit 2");
		l1.setAnnoPubblicazione(1944);
		l1.setNumeroPagine(490);
		l1.setAutore("J. R. R. Tolkien");
		l1.setGenere("Fantasy");
		
		//aggiungiACatalogo(l1); 
		
		Rivista r1 = new Rivista();
		r1.setCodiceISBN("RV0002");
		r1.setTitolo("natgeo");
		r1.setAnnoPubblicazione(2019);
		r1.setNumeroPagine(49);
		r1.setPeriodicita(Periodicita.SETTIMANALE);
		
		
		//aggiungiAUtenti(u1);
		
		//aggiungiACatalogo(r1); 
		//rimuoviTramiteISBN("LB0001", "libro");
		ricercaTramiteISBN("LB0002", "libro");
		cercaAnno(2019); 
		
		cercaAutore("J. R. R. Tolkien");
		
		cercaTitolo("o");
		
		Utente u1 = new Utente( "Mario","Rossi",LocalDate.of(1993, 5, 6), "TS001");
		Prestito p1 = new Prestito(u1, l1, LocalDate.of(2023, 5, 17), LocalDate.of(2023, 6, 14));
		
		//aggiungiAPrestiti( p1);
		
		
	}
	
	//L'archivio deve permettere le seguenti operazioni:
	//- Aggiunta di un elemento del catalogo
	
	static void aggiungiACatalogo(Libro l) {
		
		try {
			em.getTransaction().begin();
			em.persist(l);
			em.getTransaction().commit();
		}catch(Exception e) {
			System.err.println(e.getMessage());
			em.getTransaction().rollback();
		}
		
	}
	
	static void aggiungiAUtenti(Utente u) {
		
		try {
			em.getTransaction().begin();
			em.persist(u);
			em.getTransaction().commit();
		}catch(Exception e) {
			System.err.println(e.getMessage());
			em.getTransaction().rollback();
		}
		
	}
	
	static void aggiungiAPrestiti(Prestito p) {
		
		try {
			em.getTransaction().begin();
			em.persist(p);
			em.getTransaction().commit();
		}catch(Exception e) {
			System.err.println(e.getMessage());
			em.getTransaction().rollback();
		}
		
	}
	
	static void aggiungiACatalogo(Rivista r) {
			
			try {
				em.getTransaction().begin();
				em.persist(r); 
				em.getTransaction().commit();
			}catch(Exception e) {
				System.err.println(e.getMessage());
				em.getTransaction().rollback();
			}
			
		}
	//- Rimozione di un elemento del catalogo dato un codice ISBN
	
	static void rimuoviTramiteISBN(String cod, String tipo) {
		
		try {
			if(tipo.equalsIgnoreCase("libro")) {
				Query queryLibISBN = em.createNamedQuery("Libro.findISBN");
				queryLibISBN.setParameter("cod_lib", cod);
				Libro l = (Libro) queryLibISBN.getSingleResult();
				em.getTransaction().begin(); // DELETE
				em.remove(l);
				em.getTransaction().commit();
				System.out.println("libro rimosso");
			}else if(tipo.equalsIgnoreCase("rivista")){
				Query queryRivISBN = em.createNamedQuery("Rivista.findISBN");
				queryRivISBN.setParameter("cod_riv", cod);
				Rivista r = (Rivista) queryRivISBN.getSingleResult();
				em.getTransaction().begin();
				em.remove(r);
				em.getTransaction().commit();
				System.out.println("rivista rimossa");
			}
		}catch(Exception e) {
			System.err.println(e.getMessage());
			}
		}
		
		//- Ricerca per ISBN
		
		static void ricercaTramiteISBN(String cod, String tipo) {
			
			try {
				if(tipo.equalsIgnoreCase("libro")) {
					Query queryLibISBN = em.createNamedQuery("Libro.findISBN");
					queryLibISBN.setParameter("cod_lib",cod);
					Libro l = (Libro) queryLibISBN.getSingleResult();
					System.out.println(l);
				}else if(tipo.equalsIgnoreCase("rivista")){
					Query queryRivISBN = em.createNamedQuery("Rivista.findISBN");
					queryRivISBN.setParameter("cod_riv",cod);
					Rivista r = (Rivista) queryRivISBN.getSingleResult();
					System.out.println(r);
				}
			}catch(Exception e) {
				System.err.println(e.getMessage());
		 }
			
			
		}
		
		//- Ricerca per anno pubblicazione
		static void cercaAnno(int anno) {
			
			try {
					
					Query queryLibISBN = em.createNamedQuery("Libro.findAnno");
					queryLibISBN.setParameter("lib_anno",anno);
					List<Libro> libri =  queryLibISBN.getResultList();
					
					for(Libro libro : libri) {
						System.out.println(libro);
					}
				
					Query queryRivISBN = em.createNamedQuery("Rivista.findAnno");
					queryRivISBN.setParameter("riv_anno",anno);
					List<Rivista> riviste = queryRivISBN.getResultList();
					
					for(Rivista rivista : riviste) {
						System.out.println(rivista);
					}
				
					
					
			}catch(Exception e) {
				System.err.println(e.getMessage());
				}
			}
	
	//- Ricerca per autore
		
		static void cercaAutore(String autore) {
			
			try {
				Query queryLibISBN = em.createNamedQuery("Libro.findAutore");
				queryLibISBN.setParameter("lib_autore", autore);
				List<Libro> libri =  queryLibISBN.getResultList();
				
				for(Libro libro : libri) {
					System.out.println(libro);
				}
			}catch(Exception e) {
				System.err.println(e.getMessage());
			}
			
		}
	//- Ricerca per titolo o parte di esso
		
		static void cercaTitolo(String titolo) {
			
				try {
					
					Query queryLibISBN = em.createNamedQuery("Libro.findTitolo");
					queryLibISBN.setParameter("lib_titolo", "%" +  titolo + "%");
					List<Libro> libri =  queryLibISBN.getResultList();
					
					for(Libro libro : libri) {
						System.out.println(libro);
					}
				
					Query queryRivISBN = em.createNamedQuery("Rivista.findTitolo");
					queryRivISBN.setParameter("riv_titolo", "%" +  titolo + "%");
					List<Rivista> riviste = queryRivISBN.getResultList();
					
					for(Rivista rivista : riviste) {
						System.out.println(rivista);
					}
				
					
					
				}catch(Exception e) {
					System.err.println(e.getMessage());
				}
			}
	//- Ricerca degli elementi attualmente in prestito dato un numero di tessera utente
		
		
	//- Ricerca di tutti i prestiti scaduti e non ancora restituiti

		
		
	
		
	
	
}
