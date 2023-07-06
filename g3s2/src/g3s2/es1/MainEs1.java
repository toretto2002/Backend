package g3s2.es1;

public class MainEs1 {

	public static void main(String[] args) {
		
		PrimoThread t1 = new PrimoThread();
		SecondoThread t2 = new SecondoThread();
		
		t1.start();
		t2.start();

	}

}
