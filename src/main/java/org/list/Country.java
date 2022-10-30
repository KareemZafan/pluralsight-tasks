package org.list;

public class Country {

    private String countryName ;
    private int zipCode;
    private String presidentName;
    private long populationCount;
    private boolean isDeveloped;
    private String content;

    public Country() {
    }

    public Country(String countryName, String content) {
        this.countryName = countryName;
        this.content = content;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getPresidentName() {
        return presidentName;
    }

    public void setPresidentName(String presidentName) {
        this.presidentName = presidentName;
    }

    public long getPopulationCount() {
        return populationCount;
    }

    public void setPopulationCount(long populationCount) {
        this.populationCount = populationCount;
    }

    public boolean isDeveloped() {
        return isDeveloped;
    }

    public void setDeveloped(boolean developed) {
        isDeveloped = developed;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
