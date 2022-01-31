package com.jobayed.springcorepracticeone.patient;

public class PatientFactory {
    public Patient createPatient(int id, String name) {
        System.out.println("Creating patient Object using Patient factory Class");
        return new Patient(id, name);
    }
}
