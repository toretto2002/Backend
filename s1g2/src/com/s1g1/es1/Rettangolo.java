package com.s1g1.es1;

public class Rettangolo {
	
	int base;
	int altezza;
	
	public Rettangolo(int base, int altezza){
		this.base = base;
		this.altezza = altezza;		
	}
	
	
	public int perimetro() {
		return (this.base + this.altezza)*2;
	}
	
	public int area() {
		return this.base * this.altezza;
	}
}
