package com.jobayed.springcorepracticeone;

import com.jobayed.springcorepracticeone.patient.Address;
import com.jobayed.springcorepracticeone.patient.ContactBook;
import com.jobayed.springcorepracticeone.patient.EmergencyContact;
import com.jobayed.springcorepracticeone.patient.Patient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class SpringCorePracticeOneApplication {
    public static void main(String[] args) throws IOException {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans/bean.xml");

        //Patient patient = (Patient) context.getBean("patient");
        //System.out.println(patient);

        //Patient patient2 = (Patient) context.getBean("patient2");
        //System.out.println(patient2);

//        Patient patient3 = (Patient) context.getBean("patient3");
//        System.out.println(patient3);
//
//        for (EmergencyContact c : patient3.getEmergencyContacts()) {
//            System.out.println(c);
//        }

        ContactBook contactBook = (ContactBook) context.getBean("contactbook");
        System.out.println(contactBook);

        //Address address2 = (Address) context.getBean("address2");
        //System.out.println(address2);

        ((ClassPathXmlApplicationContext) context).close();
    }

}
