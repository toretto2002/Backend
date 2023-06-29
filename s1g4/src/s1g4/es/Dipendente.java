package s1g4.es;

public class Dipendente {
	
	static public double stipendioBase = 1000;
	
	private String matricola;
	private double stipendio;
	private double importoOrarioStraordinario;
	private Livello livello;
	private Dipartimento dipartimento;
	
	public Dipendente(String matricola, Dipartimento dipartimento) {
		super();
		this.matricola = matricola;
		this.stipendio = stipendioBase;
		this.importoOrarioStraordinario = 30;
		this.livello = Livello.OPERAIO;
		this.dipartimento = dipartimento;
	}

	public Dipendente(String matricola, double stipendio, double importoOrarioStraordinario, Livello livello,
			Dipartimento dipartimento) {
		super();
		this.matricola = matricola;
		this.stipendio = stipendio;
		this.importoOrarioStraordinario = importoOrarioStraordinario;
		this.livello = livello;
		this.dipartimento = dipartimento;
	}
	
	public double getImportoOrarioStraordinario() {
		return importoOrarioStraordinario;
	}
	public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
		this.importoOrarioStraordinario = importoOrarioStraordinario;
	}
	public Livello getLivello() {
		return livello;
	}
	public void setLivello(Livello livello) {
		this.livello = livello;
	}
	public String getMatricola() {
		return matricola;
	}
	public double getStipendio() {
		return stipendio;
	}
	public Dipartimento getDipartimento() {
		return dipartimento;
	}
	
	public void stampaDatiDipendente() {
		
		System.out.println("Dipendende N° " + matricola + ", stipendio: " + stipendio + "\ncon importo per ogni ora di straordinario di " + importoOrarioStraordinario + "\nlivello: " + livello + "\ndipartimento: " + dipartimento );
	}
	
	public Livello promuovi() {
		
		if(livello == Livello.OPERAIO) {
			livello = Livello.IMPIEGATO;
			stipendio = stipendioBase * 1.2;
		}else if(livello == Livello.IMPIEGATO) {
			livello = Livello.QUADRO;
			stipendio = stipendioBase * 1.5;
		}else if(livello == Livello.QUADRO) {
			livello = Livello.DIRIGENTE;
			stipendio = stipendioBase * 2;
		}else if(livello == Livello.DIRIGENTE) {
			System.out.println("Errore non si può promuovere un dirigente");
		}
		
		return livello;
	}
	
	public static double calcolaPaga(Dipendente d) {
		
		return d.stipendio;
		
	}
	
	public static double calcolaPaga(Dipendente d, int ore) {
		
		return d.stipendio + (d.importoOrarioStraordinario * ore);
		
	}
	

}
