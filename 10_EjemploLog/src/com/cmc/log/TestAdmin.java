package com.cmc.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestAdmin {
	private static final Logger logger = LogManager.getLogger("HelloWorld");
	public static void main(String[] args) {
		Admin admin = new Admin();
		  
		admin.agregar();
		 //logger.logMessage(null, null, "HELLFO", null, null, null);
		 logger.info("sgsgsfg");
	}

}
