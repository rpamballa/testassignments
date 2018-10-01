package com.example.test;

import java.util.List;

public class CampaignByCountry {


    private List<CampaignCountry> countries;

    public CampaignByCountry(List<CampaignCountry> countries) {
        this.countries = countries;
    }

    public List<CampaignCountry> getCountries() {
        return countries;
    }

    public void setCountries(List<CampaignCountry> countries) {
        this.countries = countries;
    }
}
