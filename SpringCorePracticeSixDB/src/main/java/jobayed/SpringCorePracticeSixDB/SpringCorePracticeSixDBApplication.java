package jobayed.SpringCorePracticeSixDB;

import jobayed.SpringCorePracticeSixDB.dao.NoticesDAO;
import jobayed.SpringCorePracticeSixDB.model.Notice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

import java.util.ArrayList;
import java.util.List;

public class SpringCorePracticeSixDBApplication
{

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans/beans.xml");

        NoticesDAO noticesDAO = (NoticesDAO) context.getBean("noticesDao");


        try {
            Notice notice1 = new Notice(4,"Bobby4","bobby4@shdsh","Good to be saved 4");
            Notice notice2 = new Notice(2,"Bobby2","bobby2@shdsh","Good to be saved 2");
            Notice notice3 = new Notice(5,"Bobby5","bobby5@shdsh","Good to be saved 5");

            List<Notice> nList = new ArrayList<>();
            nList.add(notice1);
            nList.add(notice2);
            nList.add(notice3);

            noticesDAO.create(nList);

            List<Notice> notices = noticesDAO.getNotices();
            notices.stream().forEach((n)-> System.out.println(n));



        }catch (CannotGetJdbcConnectionException e){
            System.out.println("[Message] - "+"Can not get JDBC Connection.");

        }catch (DataAccessException e){
            System.out.println("[Message] - "+e.getMessage());
            System.out.println("[Cause] - "+e.getCause());
            System.out.println("[Class Name] - "+e.getClass());

        }


        ((ClassPathXmlApplicationContext) context).close();
    }

}
