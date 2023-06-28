package s1g3.es1;

import java.util.Scanner;

public class Es1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(stringaPariDispari("ciao"));
		
		System.out.println(annoBisestile(2003));
		
		

	}
	
	public static boolean  stringaPariDispari(String str){	
		if(str.length()%2 == 0) {
			return true;
		}else {
			return false;
		}	
	}
	
	public static boolean annoBisestile(int anno) {
		
		if(anno%4 == 0) {
			return true;
		}else if(anno % 100 == 0 && anno % 400 == 0) {
			return true;
		}else {
			return false;
		}
	}

}
