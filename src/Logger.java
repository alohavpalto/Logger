import java.util.*;

public class Logger {

  private static Logger logger;
  private int num = 1;

  private Logger() {
  }

  public static Logger getInstance() {
    if (logger == null) {
      logger = new Logger();
    }
    return logger;
  }

  public void log(String msg) {
    System.out.println("[" + new Date() + " " + num++ + "] " + msg);
  }
}