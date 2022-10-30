package org.list;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CountryTests {

    Country eg;
    Country sud;
    Country oma;
    Country ger;

    @BeforeTest
    public void initializeObjects(){
        eg = new Country("Egypt","Africa");
        sud = new Country("Sudan","Africa");
        oma = new Country("Oman","Asia");
        ger = new Country("Germany","Europe");
    }

    @Test
    public void testPopulationCount(){
        eg.setPopulationCount(100000000L);
        oma.setPopulationCount(3000000L);

        Assert.assertEquals(eg.getPopulationCount(),100000000L);
        Assert.assertEquals(oma.getPopulationCount(),3000000L);
    }

    @Test
    public void testCountryContent(){
        ger.setContent("Europe");
        oma.setContent("Asia");
        Assert.assertEquals(ger.getContent(),"Europ", "Wrong content name!!");
        Assert.assertEquals(oma.getContent(),"Asia");
    }

    @AfterTest
    public void closeResources(){
        // close all resources
    }












}
