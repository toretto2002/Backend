package g3s2.es1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrimoThread  extends Thread{
	
	Logger log = LoggerFactory.getLogger(PrimoThread.class);
	
	@Override
	public void run() {
		
		int i = 0;
		
		while(i < 10) {
			log.info("*");
			i++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				log.error(e.getMessage());
			}
		}
	}

}
