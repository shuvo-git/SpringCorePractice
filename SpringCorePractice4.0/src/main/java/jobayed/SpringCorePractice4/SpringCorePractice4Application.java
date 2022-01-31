package jobayed.SpringCorePractice4;

import jobayed.SpringCorePractice4.logger.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCorePractice4Application
{

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans/bean.xml");
        Logger logger = (Logger) context.getBean("logger");
        logger.writeToConsole("Hello Console.");
        logger.writeToFile("Hello File.");

        ((ClassPathXmlApplicationContext) context).close();
    }

}
