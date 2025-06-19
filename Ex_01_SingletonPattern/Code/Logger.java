package Week1_DesignPrinciplesandPattern.Ex_01_SingletonPattern.Code;
public class Logger {
    
    private static Logger instance;

    private Logger() {
        System.out.println("Logger initialized.");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();  // ✅ assignment fixed
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

