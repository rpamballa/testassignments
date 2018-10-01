package com.example.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static com.sun.tools.internal.xjc.reader.Ring.add;

public class CampaignDecider {

    public CampaignByCountry getStartDates(List<Partner> partners) {

        Map<String, List<Partner>> partnersByCountry = new HashMap<>();
        partners.forEach(partner -> {
            if (partnersByCountry.containsKey(partner.getCountry())) {
                partnersByCountry.get(partner.getCountry()).add(partner);
            } else {
                partnersByCountry.put(partner.getCountry(), new ArrayList<Partner>() {{
                    add(partner);
                }});
            }
        });

        List<CampaignCountry> countries = new ArrayList<>();

        for (String c : partnersByCountry.keySet()) {

            if(partnersByCountry.get(c).size() == 1){
                List<Partner> partnerList = partnersByCountry.get(c);
                for ( Partner p:partnerList
                     ) {

                    Avail

                    countries.add(new CampaignCountry(1, Collections.singletonList(p.getEmail()),c,
                            Collections.sort(p.getAvailableDates()) ));

                }

            }

            List<Partner> partners1 = partnersByCountry.get(c);
            Map<Date, Integer> partnersByDate = new HashMap<>();

            partners1.forEach(partner -> partner.getAvailableDates().forEach(date -> {
                if (partnersByDate.containsKey(date)) {
                    partnersByDate.put(date, partnersByDate.get(date) + 1);
                } else {
                    partnersByDate.put(date, 1);
                }
            }));



            countries.add(new )


        }


        return new CampaignByCountry(countries);
    }

    private Date isCommonDateAvailable(Map<Date, Integer> partnersByDate) {

        Map<Date, Integer> treeMap = new TreeMap<>(
                Comparator.naturalOrder()
        );

        treeMap.putAll(partnersByDate);

        Date commonDate = Collections.max(treeMap.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();

        List<Date> dates = new ArrayList<>(partnersByDate.keySet());

        if (dates.indexOf(commonDate) + 1 == dates.size()) {
            return null;
        } else if (partnersByDate.get(commonDate) == 1) {
            return null;
        } else {

            return commonDate;
        }
    }


}
