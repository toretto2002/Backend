package com.s1g2.es2;

import java.util.Arrays;
import java.util.Scanner;

public class Sim {
	
	String cellulare;
	double credito;
	Chiamata[] chiamate;
	
	public Sim(String cellulare) {
		this.cellulare = cellulare;
		this.credito = 0;
		this.chiamate = new Chiamata[5];
	}
	
	public void stampaDati() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(this.cellulare);
		System.out.println(Arrays.toString(this.chiamate));
		System.out.println(this.credito);
		
	}

}
