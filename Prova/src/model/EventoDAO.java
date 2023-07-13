package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EventoDAO {
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAmercoledi");
	static EntityManager em = emf.createEntityManager();
	
	
	public static void save(Evento e) {
		
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		System.out.println(e);
		
	}
	
	
	
}
