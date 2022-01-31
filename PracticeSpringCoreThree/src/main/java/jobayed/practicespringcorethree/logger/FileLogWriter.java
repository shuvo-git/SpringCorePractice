package jobayed.practicespringcorethree.logger;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;

@Primary
public class FileLogWriter implements LogWriter {
    @Override
    public void write(String text) {
        System.out.println(text);
    }
}
