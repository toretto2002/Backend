package prova;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Prova {
	
	static EntityManagerFactory  emf = Persistence.createEntityManagerFactory("Prova");
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {
		System.out.println("ciao");

	}

}
