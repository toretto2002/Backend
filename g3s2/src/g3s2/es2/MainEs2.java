package g3s2.es2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainEs2 {

	public static void main(String[] args) {
		
		Logger log = LoggerFactory.getLogger(MainEs2.class);
		
		int[] mainArr = new int[3000];
		int[] arr1 = new int[1000];
		int[] arr2 = new int[1000];
		int[] arr3 = new int[1000];
		
		int count1 = 0;
		int count2 = 0;
		
		for(int i = 0; i < 3000; i++) {
			mainArr[i] = (int) (Math.random()*100);
		}
		
		for(int i = 0; i < 1000; i++) {
			arr1[i] = mainArr[i];
		}
		
		for(int i = 1000; i <= 1999; i++) {
			arr2[count1] = mainArr[i];
			count1++;
		}
		
		for(int i = 2000; i <= 2999; i++) {
			arr3[count2] = mainArr[i];
			count2++;
		}
		
		Thread1 t1 = new Thread1(arr1);
		Thread2 t2 = new Thread2(arr2);
		Thread3 t3 = new Thread3(arr3);
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			log.error(e.getMessage());
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			log.error(e.getMessage());
		}
		try {
			t3.join();
		} catch (InterruptedException e) {
			log.error(e.getMessage());
		}
		
		
		System.out.println("somma primo arr: " + t1.sum);
		System.out.println("somma secondo arr: " + t2.sum);
		System.out.println("somma terzo arr: " + t3.sum);
		
		int tot = t1.sum + t2.sum + t3.sum;
		
		System.out.println("Somma totale: " + tot);
		
		
		

	}

}
