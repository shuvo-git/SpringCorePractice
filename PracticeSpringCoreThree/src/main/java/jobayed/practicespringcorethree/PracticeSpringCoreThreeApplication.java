package jobayed.practicespringcorethree;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import jobayed.practicespringcorethree.logger.Logger;

public class PracticeSpringCoreThreeApplication
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
