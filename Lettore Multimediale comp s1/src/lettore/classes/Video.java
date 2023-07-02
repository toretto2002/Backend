package lettore.classes;

import lettore.interfaces.IBrightness;

public class Video extends Audio implements IBrightness {
	
	private int luminosita = 5;

	public Video(String titolo, int durata) {
		super(titolo, durata);
	}
	
	public void play() {
		String toPlay = this.titolo;
		
		for(int i = 0; i <= this.volume; i++) {
			toPlay += "!";
		}
		
		for(int i = 0; i <= this.luminosita; i++) {
			toPlay += "*";
		}
		
		for(int i = 0; i <= this.durata; i++) {
			System.out.println(toPlay);
		}
		
	}
	
	
	
	public void decreaseBrightness() {
		
		if(this.luminosita > 0) {
			this.luminosita--;
		}else {
			System.out.println("Luminosità al minimo!!!");
		}
	}
	
	public void increaseBrightness() {
		
		if(this.luminosita < 10) {
			this.luminosita++;
		}else {
			System.out.println("Luminosità al massimo!!!");
		}
	}

}
