package jobayed.practicespringcorethree.logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

import javax.print.attribute.standard.RequestingUserName;
import java.util.Date;

public class Logger {
    //@Autowired
    private LogWriter consoleLogWriter;
    //@Autowired
    private LogWriter fileLogWriter;

    @Autowired
    public Logger(LogWriter fileLogWriter) {
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
    @Qualifier("consoleLog")
    public void setConsoleLogWriter(LogWriter consoleLogWriter) {
        this.consoleLogWriter = consoleLogWriter;
    }

    //@Autowired
    public void setFileLogWriter(FileLogWriter fileLogWriter) {
        this.fileLogWriter = fileLogWriter;
    }
}
