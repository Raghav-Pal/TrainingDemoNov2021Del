package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4JDemo1 {
	
	static Logger logger = LogManager.getLogger(Log4JDemo1.class);
	
	//private static Logger logger = LogManager.getLogger(Log4JDemo1.class);
	
	public static void main(String[] args) {
		System.out.println("\nHello World...!\n");
		logger.info("This is information message");
		logger.error("This is error mesage");
		logger.trace("Trace message");
		System.out.println("Completed");
	}

}
