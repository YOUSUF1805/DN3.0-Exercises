public class Main {
    public static void main(String[] args) {
        // Attempt to get instances of Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Check if both instances are the same
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same.");
        } else {
            System.out.println("Different instances of Logger found.");
        }

        // Test logging
        logger1.log("This is a log message from logger1.");
        logger2.log("This is a log message from logger2.");

        // Demonstrating that both logger1 and logger2 are the same instance
        System.out.println("logger1 and logger2 are the same instance: " + (logger1 == logger2));
    }
}
