package lettore.classes;

import lettore.interfaces.IReproducibleElement;

public class Audio extends MultimediaElement implements IReproducibleElement {
	
	protected int volume = 5;
	protected int durata;

	public Audio(String titolo,int durata) {
		super(titolo);
		this.durata = durata;
	}

	@Override
	public void play() {
		String toPlay = this.titolo;
		
		for(int i = 0; i <= this.volume; i++) {
			toPlay += "!";
		}
		
		for(int i = 0; i <= this.durata; i++) {
			System.out.println(toPlay);
		}
		
	}
	
	public void volumeDown() {
		
		if(this.volume > 0) {
			this.volume--;
		}else {
			System.out.println("Volume al minimo!!!");
		}
	}
	
	public void volumeUp() {
		
		if(this.volume < 10) {
			this.volume++;
		}else {
			System.out.println("Volume al massimo!!!");
		}
	}
	
	

}
