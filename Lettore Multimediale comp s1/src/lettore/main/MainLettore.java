package lettore.main;

import java.util.Scanner;

import lettore.classes.Audio;
import lettore.classes.Image;
import lettore.classes.MultimediaElement;
import lettore.classes.Video;

public class MainLettore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultimediaElement[] arr = new MultimediaElement[5];
		
		Scanner sc = new Scanner(System.in);
		int datatype;
		
		for(int i = 0; i < arr.length; i++) {
			
			do {
				System.out.println("Inserisci il tipo di dato che vuoi inserire");
				System.out.println("1 : Immagine");
				System.out.println("2 : Audio");
				System.out.println("3 : Video");
				datatype = sc.nextInt();
			}while(datatype != 1 && datatype != 2 && datatype != 3);
			
			switch(datatype) {
			
				case 1:
					System.out.println("Inserisci il titolo dell'immagine");
					String titoloImg = sc.next();
					Image img = new Image(titoloImg);
					arr[i] = (Image)img;
					break;
				case 2:
					System.out.println("Inserisci il titolo dell'audio");
					String titoloAud = sc.next();
					System.out.println("Inserisci la durata dell'audio");
					int durataAud = sc.nextInt();
					Audio aud = new Audio(titoloAud, durataAud);
					arr[i] = (Audio)aud;
					break;
				case 3:
					System.out.println("Inserisci il titolo del video");
					String titoloVid = sc.next();
					System.out.println("Inserisci la durata del video");
					int durataVid = sc.nextInt();
					Video vid = new Video(titoloVid, durataVid);
					arr[i] = (Video)vid;
					break;
				default:
					System.out.println("Errore, tipo sconosciuto del dato!!!");	
					break;
			}	
			
		}
		
		while(true) {
				int index;
				System.out.println("Inserisci l'indice dell'elemento dell'array che vuoi riprodurre(1-5)");	
				System.out.println("Inserisci 0 per interrompere");
				index = sc.nextInt();
				
				if(index == 0) {
					break;
				}
				
				index--;
				
				if(arr[index] instanceof Audio) {
					Audio aud = (Audio)arr[index];
					aud.play();
				}else if(arr[index] instanceof Video) {
					Video vid = (Video)arr[index];
					vid.play();
				}else if(arr[index] instanceof Image) {
					Image img = (Image)arr[index];
					img.show();
				}
				
			}
		
		sc.close();
				

	}

}
