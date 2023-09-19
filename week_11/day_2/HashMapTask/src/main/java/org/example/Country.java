package org.example;

import java.util.HashMap;

public class Country {
    private String country;
    private Long population;
    private String capital;
    private String continent;

    public Country(String _country, Long _population, String _capital, String _continent) {
        this.country = _country;
        this.population = _population;
        this.capital = _capital;
        this.continent = _continent;
    }

    public String getCountry() {
        return country;
    }

    public Long getPopulation() {
        return population;
    }

    public String getCapital() {
        return capital;
    }

    public String getContinent() {
        return continent;
    }

    public String countryInfo(){
        return String.format("In %s there are %d people. The Capital of %s is %s and it is in %s . ",
        this.getCountry(),this.getPopulation(),this.getCountry(),this.getCapital(),this.getContinent());
    }
}
