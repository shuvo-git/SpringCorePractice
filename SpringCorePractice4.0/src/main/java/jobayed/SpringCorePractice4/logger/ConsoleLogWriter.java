package jobayed.SpringCorePractice4.logger;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ConsoleLogWriter implements LogWriter {
    @Override
    public void write(String text) {
        System.out.println(text);
    }
}
