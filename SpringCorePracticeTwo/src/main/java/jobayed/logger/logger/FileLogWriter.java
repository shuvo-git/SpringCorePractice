package jobayed.logger.logger;

public class FileLogWriter implements LogWriter {
    @Override
    public void write(String text) {
        System.out.println(text);
    }
}
