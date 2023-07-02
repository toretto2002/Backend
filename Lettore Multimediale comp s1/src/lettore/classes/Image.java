package lettore.classes;

import lettore.interfaces.IBrightness;

public class Image extends MultimediaElement implements IBrightness {
	
	private int luminosita = 5;
	
	public Image(String titolo) {
		super(titolo);
		// TODO Auto-generated constructor stub
	}
	
	public void show() {
		String toShow = this.titolo;
		
		
		
		for(int i = 0; i <= this.luminosita; i++) {
			toShow += "*";
		}
		
		
		System.out.println(toShow);
		
	}

	@Override
	public void decreaseBrightness() {
		if(this.luminosita > 0) {
			this.luminosita--;
		}else {
			System.out.println("Luminosità al minimo!!!");
		}
		
	}

	@Override
	public void increaseBrightness() {
		if(this.luminosita < 10) {
			this.luminosita++;
		}else {
			System.out.println("Luminosità al massimo!!!");
		}
	}

}
