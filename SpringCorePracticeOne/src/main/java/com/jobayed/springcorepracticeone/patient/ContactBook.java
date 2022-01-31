package com.jobayed.springcorepracticeone.patient;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class ContactBook {
    private Patient patient;
    private Map<String, EmergencyContact> contacts = new HashMap<>();

    public ContactBook() {
    }

    public void setContacts(Map<String, EmergencyContact> contacts) {
        this.contacts = contacts;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append((this.patient == null? "Patient is Null": this.patient.toString())+"\n");
        this.contacts
                .entrySet()
                .stream()
                .forEach((c)-> {
                    sb.append(c+"\n");
                });
        return sb.toString();
    }
}
