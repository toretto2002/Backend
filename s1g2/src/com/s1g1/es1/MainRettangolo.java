package com.s1g1.es1;

import java.util.Scanner;

public class MainRettangolo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Rettangolo square = new Rettangolo(5, 2);
		Rettangolo square2 = new Rettangolo(10, 30);
		
		stampaRettangolo(square);
		
		stampaDueRettangoli(square, square2);
		
		
		
		
		

	}
	
	public static void stampaRettangolo(Rettangolo r) {
		
		System.out.println(r.perimetro());
		System.out.println(r.area());
		
	}
	
public static void stampaDueRettangoli(Rettangolo r, Rettangolo v) {
		
		System.out.println(r.perimetro());
		System.out.println(r.area());
		
		System.out.println(v.perimetro());
		System.out.println(v.area());
		
		System.out.println(v.perimetro() + r.perimetro());
		System.out.println(v.area() + r.area());
		
	}
}
