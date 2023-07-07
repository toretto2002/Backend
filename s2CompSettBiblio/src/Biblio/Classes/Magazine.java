package Biblio.Classes;

import Biblio.Enum.Periodicity;

public class Magazine extends LibraryElement {
	
	private Periodicity periodicity;

	public Magazine(String iSBNCode, String title, Integer year, Integer numberOfPages, Periodicity periodicity) {
		super(iSBNCode, title, year, numberOfPages);
		this.periodicity = periodicity;
	}

	public Periodicity getPeriodicity() {
		return periodicity;
	}

	@Override
	public String toString() {
		return super.toString() + " Periodicità: " + this.periodicity;
	}

	
	
	

}
