package jobayed.SpringCorePractice4.logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

import javax.print.attribute.standard.RequestingUserName;
import java.util.Date;

@Component
public class Logger {
    //@Autowired
    private ConsoleLogWriter consoleLogWriter;
    //@Autowired
    private FileLogWriter fileLogWriter;

    @Autowired
    public Logger(FileLogWriter fileLogWriter) {
        this.fileLogWriter = fileLogWriter;
    }

    public String getCurrentFormattedDate() {
        return "[" + new Date().toString() + "] - ";
    }

    public void writeToConsole(String text) {
        consoleLogWriter.write(this.getCurrentFormattedDate() + text);
    }

    public void writeToFile(String text) {
        fileLogWriter.write(this.getCurrentFormattedDate() + text);
    }

    /// Getters and Setters
    @Autowired
    public void setConsoleLogWriter(ConsoleLogWriter consoleLogWriter) {
        this.consoleLogWriter = consoleLogWriter;
    }

    //@Autowired
    public void setFileLogWriter(FileLogWriter fileLogWriter) {
        this.fileLogWriter = fileLogWriter;
    }
}
