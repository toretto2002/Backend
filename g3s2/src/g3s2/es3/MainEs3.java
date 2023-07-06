package g3s2.es3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import g3s2.es1.PrimoThread;

public class MainEs3 {

	static File file = new File("doc/text.txt");
	
	static Logger log = LoggerFactory.getLogger(PrimoThread.class);
	
	public static void main(String[] args) {
		
	
		
		
		

	}
	
	public static void scriviSuFile(String testo) throws IOException {
		FileUtils.writeStringToFile(file, testo, "UTF-8");
	}
	
	public static String leggidaFile() throws IOException {
		String textFile = FileUtils.readFileToString(file, "UTF-8");
		return textFile;
	}
	
	public static String registroPresenze(int n, String nome) {
		String toSave = nome + "@" + n + "#";
		log.info(toSave);
		try {
			scriviSuFile(toSave);
		} catch (IOException e) {
			log.error(e.getMessage());
		}
		return toSave;			
	}
	
	public static void leggiRegistro() {
		
		String toSplit = null;
		try {
			toSplit = leggidaFile();
		} catch (IOException e) {
			log.error(e.getMessage());
		}
		
		toSplit.split("#"); 
	}

}
