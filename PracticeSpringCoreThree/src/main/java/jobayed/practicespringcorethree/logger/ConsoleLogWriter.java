package jobayed.practicespringcorethree.logger;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("consoleLog")
public class ConsoleLogWriter implements LogWriter {
    @Override
    public void write(String text) {
        System.out.println(text);
    }
}
