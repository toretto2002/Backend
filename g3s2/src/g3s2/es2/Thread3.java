package g3s2.es2;

public class Thread3 extends Thread {
	
	private int[] arr;
	public int sum;
	
	

	public Thread3(int[] arr) {
		super();
		this.arr = arr;
	}



	@Override
	public void run() {
		for(int i:this.arr) {
			this.sum += i;
		}
		
	}
	
	

}
