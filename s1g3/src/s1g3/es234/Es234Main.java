package s1g3.es234;

import java.util.Arrays;
import java.util.Scanner;

public class Es234Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		stampaNumero(2);
		
		System.out.println(Arrays.toString(dividiStringa("ciaooooooo:q")));
		
		contoAllaRovescia(10);
		

	}
	
	public static void stampaNumero(int n) {
		
		switch(n) {
			case 1:
				System.out.println("uno");
				break;
			case 2:
				System.out.println("due");
				break;
			case 3:
				System.out.println("tre");
				break;
			default:
				System.out.println("Il numero non corrisponde a nessuna delle opzioni");
				break;
		}
	}
	
	public static String[] dividiStringa(String str) {
		
		String[] splittedStr;
		splittedStr =  str.split("");
		return splittedStr;
		
	}
	
	public static void contoAllaRovescia(int n) {
		for(int i = n; i >= 0; i--) {
			System.out.println(i);
		}
	}

}
