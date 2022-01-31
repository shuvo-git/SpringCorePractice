package jobayed.logger.logger;

public class ConsoleLogWriter implements LogWriter {
    @Override
    public void write(String text) {
        System.out.println(text);
    }
}
