package compilator;

import java.time.LocalDate;

import Enumerated.TipoEvento;
import GestioneEventi.Evento;
import GestioneEventi.EventoDAO;

public class MainProject {

	public static void main(String[] args) {
		
		
//		Evento(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento, int numeroMassimoPartecipanti)
		
		
		Evento e1 = new Evento("Ballo", LocalDate.of(2000, 10, 22), "Ballo in maschera",TipoEvento.PRIVATO, 89);
		Evento e2 = new Evento("Cena", LocalDate.of(2023, 9, 8), "Cena di pesce",TipoEvento.PRIVATO, 23);
		Evento e3 = new Evento("Concerto", LocalDate.of(2010, 7, 1), "Concerto in piazza",TipoEvento.PUBBLICO, 5000);
		
		EventoDAO.save(e1);
		EventoDAO.save(e2);
		EventoDAO.save(e3);

	}

}
