package MainContainer;


import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import Biblio.Classes.Autor;
import Biblio.Classes.Book;
import Biblio.Classes.LibraryElement;
import Biblio.Classes.Magazine;
import Biblio.Enum.Genres;
import Biblio.Enum.Periodicity;
import MyExeptions.CodeNotFoundException;

public class ProjectMain {
	
	static Logger log = LoggerFactory.getLogger(ProjectMain.class);
	static File file = new File("doc/test.txt");
	
	static Map<String, LibraryElement> m = new HashMap<String, LibraryElement>();
	
	public static void main(String[] args) {
		
		Autor a1 = new Autor("J. R. R.", "Tolkien");
		Autor a2 = new Autor("Mario", "Rossi");
		Autor a3 = new Autor("Elena", "Verdi");
		Autor a4 = new Autor("Rossella", "Alibaba");
		
		Book b1 = new Book("AA0001", "Il Signore Degli Anelli", 1954, 1380, a1, Genres.FANTASY);
		Book b2 = new Book("AA0002", "La Pimpa", 1978, 134, a2, Genres.THRILLER);
		Book b3 = new Book("AA0003", "Lorem Ipsum", 2004, 345, a3, Genres.HISTORY);
		
		
		//System.out.println(b1.toString());
		//System.out.println(b2.toString());
		//System.out.println(b3.toString());
		
		Magazine mg1 = new Magazine("BB0001", "Focus", 2023, 57, Periodicity.WEEKLY);
		Magazine mg2 = new Magazine("BB0002", "NatGeo", 2023, 48, Periodicity.MONTHLY);
		Magazine mg3 = new Magazine("BB0003", "Gazzetta", 2019, 23, Periodicity.HALFYEARLY);
		
		//System.out.println(m1.toString());
		//System.out.println(m2.toString());
		//System.out.println(m3.toString());
		
		addToArchive(b1);
		addToArchive(b2);
		addToArchive(b3);
		
		addToArchive(mg1);
		addToArchive(mg2);
		addToArchive(mg3);
		
		
		Set<String> keys = m.keySet();
		
		Object[] arr = keys.toArray();
				
		for (Object s : arr) {
			System.out.println("Elemento Libreria key: " + s + " Elemento: " + m.get(s));
		}
		
		System.out.println();
		
		removeWithISBN("AA000");
		
		System.out.println();
		
	    arr = keys.toArray();
				
		for (Object s : arr) {
			System.out.println("Elemento Libreria key: " + s + " Elemento: " + m.get(s));
		}
		
		System.out.println();
		
		findByYear(2023);
		
		System.out.println();
		
		findByAutor(a4);
		
		System.out.println();
		
		 try {
			saveOnFile();
		} catch (IOException e) {
			log.error(e.getMessage());
		}
		 
		 System.out.println();
		 
		 try {
			readFromFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	static public void addToArchive(Book b){
		m.put(b.getISBNCode(), b);
	}
	
	static public void addToArchive(Magazine mg){
		m.put(mg.getISBNCode(), mg);
	}
	
	static public void removeWithISBN(String code) {
		
		try {
			if(m.containsKey(code)) {
				System.out.println("Eliminato Elemento: " + m.get(code).toString());
				m.remove(code);
			}else {
				throw new CodeNotFoundException("Elemento con codice ISBN " + code + " non trovato!!");
			}
		}catch (CodeNotFoundException e){
			log.error(e.getMessage());
		}
		
	}
	
	static public void findByYear(int year) {
		
		Set<String> keys = m.keySet();
		int count = 0;
		Object[] arr = keys.toArray();
	
		for (Object s : arr) {
			if(m.get(s).getYear() == year) {
				System.out.println(m.get(s).toString());
				count++;
			}
		}
		
		if(count == 0) {
			System.out.println("Nessun elemento pubblicato nell'anno cercato");
		}
	}
	
	static public void findByAutor(Autor autor){
		
		Set<String> keys = m.keySet();
		Object[] arr = keys.toArray();
		int count = 0;
		for (Object s : arr) {
			if(m.get(s) instanceof Book) {
				Book b = (Book) m.get(s);
				if(b.getAutor().equals(autor)) {
					System.out.println(b.toString());
					count++;
				}
			}
		}
		
		if(count == 0) {
			System.out.println("Nessun elemento trovato dell'autore cercato");
		}
		
		
	}
	/*(String iSBNCode, String title, Integer year, int numberOfPages, Autor autor, Genres genre)*/
	/*String iSBNCode, String title, Integer year, Integer numberOfPages, Periodicity periodicity*/
	
	
	static public void saveOnFile() throws IOException {
		
		Set<String> keys = m.keySet();
		Object[] arr = keys.toArray();
		String toSave;
	
		for (Object s : arr) {
			if(m.get(s) instanceof Book) {
				Book b = (Book) m.get(s);
				toSave = "£" + b.getISBNCode() + "|" + b.getTitle() + "|" + b.getYear() + "|" + b.getNumberOfPages() + "|" + b.getAutor().getNome() + "|" + b.getAutor().getCognome() + "|" + b.getGenre() + "#";
				FileUtils.writeStringToFile(file, toSave, "UTF-8", true);
			}else if(m.get(s) instanceof Magazine) {
				Magazine mg = (Magazine)m.get(s);
				toSave = "&" + mg.getISBNCode() + "|" + mg.getTitle() + "|" + mg.getYear() + "|" + mg.getNumberOfPages() + "|" + mg.getPeriodicity() + "#";
				FileUtils.writeStringToFile(file, toSave, "UTF-8", true);
			}
		}
	}
	
	static public void readFromFile() throws IOException {
		String textFile = FileUtils.readFileToString(file, "UTF-8");
		
		String[] singleObj = textFile.split("#");
		for(String s : singleObj) {
			System.out.println(s);
		}
	}

}
