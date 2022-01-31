package jobayed.logger;

import jobayed.logger.logger.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class SpringCorePracticeTwoApplication {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans/bean.xml");
        Logger logger = (Logger) context.getBean("logger2");
        logger.writeToConsole("Hello Console.");
        logger.writeToFile("Hello File.");

        ((ClassPathXmlApplicationContext) context).close();
    }

}
