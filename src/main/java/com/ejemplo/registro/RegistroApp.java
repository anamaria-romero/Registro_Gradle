package com.ejemplo.registro;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RegistroApp {
    private static final Logger logger = LogManager.getLogger(RegistroApp.class);

    public static void main(String[] args) {
        logger.debug("Esto es un mensaje de DEBUG.");
        logger.info("Esto es un mensaje de INFO.");
        logger.warn("Esto es un mensaje de WARNING.");
        logger.error("Esto es un mensaje de ERROR.");
        logger.fatal("Esto es un mensaje FATAL.");
    }
}
