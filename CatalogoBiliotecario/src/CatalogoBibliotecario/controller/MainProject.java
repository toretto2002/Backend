package CatalogoBibliotecario.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import CatalogoBiliotecario.enumerated.Periodicita;
import CatalogoBiliotecario.model.ArticoloBiblioteca;
import CatalogoBiliotecario.model.Libro;
import CatalogoBiliotecario.model.Rivista;

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
		
		//aggiungiACatalogo(r1); 
		//rimuoviTramiteISBN("LB0001", "libro");
		ricercaTramiteISBN("LB0002", "libro");
		cercaAnno(2019); 
		
		
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
					queryLibISBN.setParameter("cod_lib", cod);
					Libro l = (Libro) queryLibISBN.getSingleResult();
					System.out.println(l);
				}else if(tipo.equalsIgnoreCase("rivista")){
					Query queryRivISBN = em.createNamedQuery("Rivista.findISBN");
					queryRivISBN.setParameter("cod_riv", cod);
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
					
					List<ArticoloBiblioteca> l =  new ArrayList();
					Query queryLibISBN = em.createNamedQuery("Libro.findAnno");
					queryLibISBN.setParameter("lib_anno",anno);
					l =  queryLibISBN.getResultList();
				
					Query queryRivISBN = em.createNamedQuery("Rivista.findAnno");
					queryRivISBN.setParameter("riv_anno",anno);
					l = (List<ArticoloBiblioteca>) queryRivISBN.getSingleResult();
					
					for(ArticoloBiblioteca el : l) {
						System.out.println(el);
					}
			}catch(Exception e) {
				System.err.println(e.getMessage());
				}
			}
	
	//- Ricerca per autore
	//- Ricerca per titolo o parte di esso
	//- Ricerca degli elementi attualmente in prestito dato un numero di tessera utente
	//- Ricerca di tutti i prestiti scaduti e non ancora restituiti

		
		
	
		
	
	
}
