import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    protected int num = 1;

    private static Logger instance = null;

    private Logger() {}

    public void log(String msg) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        System.out.println("[" + dateFormat.format(date).toString() + " " + num++ + "] " + msg);
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
}