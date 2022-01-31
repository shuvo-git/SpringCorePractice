package jobayed.logger.logger;

import java.util.Date;

public class Logger {
    private ConsoleLogWriter consoleLogWriter;
    private FileLogWriter fileLogWriter;

//    public Logger(ConsoleLogWriter consoleLogWriter, FileLogWriter fileLogWriter) {
//        this.consoleLogWriter = consoleLogWriter;
//        this.fileLogWriter = fileLogWriter;
//    }

    public String getCurrentFormattedDate(){
        return  "["+new Date().toString() +"] - ";
    }

    public void writeToConsole(String text){
        consoleLogWriter.write(this.getCurrentFormattedDate()+text);
    }

    public void writeToFile(String text){
        fileLogWriter.write(this.getCurrentFormattedDate()+text);
    }

    /// Getters and Setters

    public LogWriter getConsoleLogWriter() {
        return consoleLogWriter;
    }

    public void setConsoleLogWriter(ConsoleLogWriter consoleLogWriter) {
        this.consoleLogWriter = consoleLogWriter;
    }

    public LogWriter getFileLogWriter() {
        return fileLogWriter;
    }

    public void setFileLogWriter(FileLogWriter fileLogWriter) {
        this.fileLogWriter = fileLogWriter;
    }
}
