public class Logger {
    // The single instance of Logger, initially null
    private static Logger instance;

    // Private constructor to prevent instantiation from outside
    private Logger() {
        // Initialization code, if any
    }

    // Public method to provide access to the instance
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Example method to demonstrate logging
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
