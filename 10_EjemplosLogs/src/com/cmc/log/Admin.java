package com.cmc.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Admin {
private static Logger  logger =LogManager.getLogger(Admin.class);

public void agregar (){
	logger.info("esto es informacion");
	logger.warn("mENSAJE WARN");
	logger.debug("mesaje de debug");
	logger.error("mesaje de error");
	logger.trace("Mensaje trace");
	
}


}
