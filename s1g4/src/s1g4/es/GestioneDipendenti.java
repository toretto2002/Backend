package s1g4.es;

public class GestioneDipendenti {

	public static void main(String[] args) {
		
		
		Dipendente d1 = new Dipendente("ADE34568FF", Dipartimento.PRODUZZIONE);
		Dipendente d2 = new Dipendente("YUF64747PK", Dipartimento.PRODUZZIONE);
		
		Dipendente d3 = new Dipendente("YRT89569LK", 1500, 45, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
		Dipendente d4 = new Dipendente("NKM89649IO", 2000, 60, Livello.DIRIGENTE, Dipartimento.VENDITE);
		
		System.out.println(d1.promuovi());
		System.out.println(d3.promuovi());
		
		System.out.println(d1.getLivello());
		System.out.println(d2.getLivello());
		System.out.println(d3.getLivello());
		System.out.println(d4.getLivello());
		
		double stipendioDovuto;
		
		stipendioDovuto = Dipendente.calcolaPaga(d1, 5) + Dipendente.calcolaPaga(d2, 5) + Dipendente.calcolaPaga(d3, 5) + Dipendente.calcolaPaga(d4, 5);
		
		System.out.println(stipendioDovuto);
		
		
		
		
		
	}

}
