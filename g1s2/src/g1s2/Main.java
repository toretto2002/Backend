package g1s2;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	
	

	public static void main(String[] args) {
		
		Logger log = LoggerFactory.getLogger(Main.class);
		
		Scanner sc = new Scanner(System.in);
		
		
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random()*10 + 1);
		}
		
		
		
		while(true) {
			try {
				System.out.println("Inserisci l'indice dove salvare il numero(1-5) o 0 per interrompere");
				int index  = Integer.parseInt(sc.nextLine());
				
				if(index == 0) {
					return;
				}
				
				System.out.println("Inserisci il numero da salvare");
				int toPush  = Integer.parseInt(sc.nextLine());
				
				
				
				index--;
				
				arr[index] = toPush;
				
				for(int i = 0; i < arr.length; i++) {
					System.out.println(arr[i]);
				}
			}catch (ArrayIndexOutOfBoundsException e){
				log.error("indice non valido, fuori dalla memoria dell'array!!");}
			}
			
		
			
				
		}
	
		static double kmAlLitro(){
			
			Logger log = LoggerFactory.getLogger(Main.class);
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Inserisci i km percorsi");
			double km  = sc.nextDouble();
			System.out.println("Inserisci i litri utilizzati");
			double litri  = sc.nextDouble();
			try {	
				double kmLitro = km / litri;
				return kmLitro;
				
			}catch(ArithmeticException e) {
				log.error("Divisione per zero non possibile!!");
				return 0.0;
			}
		}
	
	
		
			
		 
		
		
		
		
		

	}


