package com.jobayed.springcorepracticeone.patient;

import java.util.Date;
import java.util.List;

public class Patient {

    private int id;
    private String name;
    private String nationalId;
    private Address patientAddress;

    private List<EmergencyContact> emergencyContacts;

    public Patient() {
    }

    public Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static Patient getInstance(int id, String name) {
        System.out.println("Creating Patient Object using Factory method");
        return new Patient(id, name);
    }

    public void onCreate() {
        System.out.println("Patient Object Created on " + (new Date().toLocaleString()));
    }

    public void onDestroy() {
        System.out.println("Patient Object Destroyed on " + (new Date().toLocaleString()));
    }

    public void speak() {
        System.out.println("I am Patient " + this.name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public Address getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(Address patientAddress) {
        this.patientAddress = patientAddress;
    }

    public List<EmergencyContact> getEmergencyContacts() {
        return emergencyContacts;
    }

    public void setEmergencyContacts(List<EmergencyContact> emergencyContacts) {
        this.emergencyContacts = emergencyContacts;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nationalId='" + nationalId + '\'' +
                ", patientAddress=" + patientAddress +
                ", emergencyContacts=" + emergencyContacts +
                '}';
    }
}
