package com.example.test;

import java.util.Date;
import java.util.List;

public class CampaignCountry {

    private int count;
    private List<String> attendees;
    private String name;
    private Date startDate;

    public CampaignCountry(int count, List<String> attendees, String name, Date startDate) {
        this.count = count;
        this.attendees = attendees;
        this.name = name;
        this.startDate = startDate;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<String> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<String> attendees) {
        this.attendees = attendees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}
