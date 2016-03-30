import java.util.Date;
import java.util.Random;
import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Library {  

	//private final static Logger log = LoggerFactory.getLogger(Library.class);
	private final static Logger log = LogManager.getLogger(Library.class);
	
	public boolean someLibraryMethod() {
		int i = 0;
		while (i < 1000) {
			log.info(UUID.randomUUID());
			i++;
		}				
        return true;
    }
}
