package com.jobayed.springcorepracticeone.patient;

import java.util.Date;

public class Address {
    private String street;
    private String postcode;

    public Address() {
    }

    public Address(String street, String postcode) {
        this.street = street;
        this.postcode = postcode;
    }

    public  void init(){
        System.out.println("Address Object Created on "+(new Date().toLocaleString()));
    }

    public  void destroy(){
        System.out.println("Address Object Destroyed on "+(new Date().toLocaleString()));
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }
}
