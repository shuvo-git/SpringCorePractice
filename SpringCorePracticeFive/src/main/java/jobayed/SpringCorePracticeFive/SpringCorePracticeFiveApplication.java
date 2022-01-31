package jobayed.SpringCorePracticeFive;

import jobayed.SpringCorePracticeFive.Animal.Cat;
import jobayed.SpringCorePracticeFive.Animal.Parrot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCorePracticeFiveApplication
{

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans/bean.xml");

        Cat cat = (Cat) context.getBean("cat");
        cat.speak();
        Parrot parrot = (Parrot) context.getBean("parrot");
        parrot.speak();

        ((ClassPathXmlApplicationContext) context).close();
    }

}
