package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

         HashMap<String, Long> countriesPopulation;
        countriesPopulation = new HashMap<>();

        Country uk = new Country("UK",64_100_000L,"London", "Europe");
        Country germany = new Country("Germany", 80_620_000L, "Berlin","Europe");
        Country france = new Country("France",66_030_000L, "Paris","Europe" );
        Country japan = new Country("Japan",127_300_000L,"Tokyo", "Asia" );


        countriesPopulation.put(uk.getCountry(),uk.getPopulation());
        countriesPopulation.put(germany.getCountry(), germany.getPopulation());
        countriesPopulation.put(france.getCountry(), france.getPopulation());
        countriesPopulation.put(japan.getCountry(), japan.getPopulation());

        System.out.println(countriesPopulation.get("Japan"));

        System.out.println(countriesPopulation.keySet());
        System.out.println(countriesPopulation.values());
        System.out.println(japan.countryInfo());



    }
}