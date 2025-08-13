package logger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppLogger {
    private static final Logger logger = Logger.getLogger("Калькулятор комплексных чисел");

    static {

        logger.setUseParentHandlers(false);
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.INFO);
        logger.addHandler(handler);
        logger.setLevel(Level.INFO);
    }
    public static Logger getLogger() {
        return logger;
    }
}
