package com.example.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Partner {

    private String firstName;

    private String lastName;

    private String country;

    private String email;

    private List<Date> availableDates = new ArrayList<Date>();


    public Partner(String firstName, String lastName, String country, String email, List<Date> availableDates) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.email = email;
        this.availableDates = availableDates;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Date> getAvailableDates() {
        return availableDates;
    }

    public void setAvailableDates(List<Date> availableDates) {
        this.availableDates = availableDates;
    }

}
