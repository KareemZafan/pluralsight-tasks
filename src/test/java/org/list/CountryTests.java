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
    Country it;

    @BeforeTest
    public void initializeObjects(){
        eg = new Country("Egypt","Africa");
        sud = new Country("Sudan","Africa");
        oma = new Country("Oman","Asia",  4580078L);
        ger = new Country("Germany","Europe", 83783942L);
    }

    @Test
    public void testCountryName(){
        ger.setCountryName("Germany");
        eg.setCountryName("Egypt");

        Assert.assertEquals(ger.getCountryName(), "Germany");
        Assert.assertEquals(eg.getCountryName(), "Egypt");
    }

    @Test
    public void testCountryZipCode(){
        oma.setZipCode(514);
        eg.setZipCode(11511);

        Assert.assertEquals(oma.getZipCode(), 514);
        Assert.assertEquals(eg.getZipCode(), 11511);
    }

    @Test
    public void testPresidentName(){
        ger.setPresidentName("Frank-Walter Steinmeier");

        Assert.assertEquals(ger.getPresidentName(), "Frank-Walter Steinmeier", "Wrong President Name!");
    }

    @Test
    public void testPopulationCount(){
        eg.setPopulationCount(100000000L);
        sud.setPopulationCount(3000000L);

        Assert.assertEquals(eg.getPopulationCount(),100000000L);
        Assert.assertEquals(sud.getPopulationCount(),3000000L);
    }

    @Test
    public void testIsCountryDeveloped(){
        sud.setDeveloped(false);
        ger.setDeveloped(true);

        Assert.assertEquals(sud.isDeveloped(), false);
        Assert.assertEquals(ger.isDeveloped(), true);
    }

    @Test
    public void testCountryContent(){
        ger.setContent("Europe");
        oma.setContent("Asia");
        Assert.assertEquals(ger.getContent(),"Europe", "Wrong content name!!");
        Assert.assertEquals(oma.getContent(),"Asia");
    }

    @Test
    public void testCountryPresidentName()
    {
        it=new Country();
        it.setPresidentName("X President");
        Assert.assertEquals(it.getPresidentName(),"X President");
        Assert.assertFalse(it.getPresidentName()=="Y President","President Name of Italy is Not 'Y president'");
    }
    @Test
    public void testIsDeveloped()
    {
        it=new Country();
        it.setDeveloped(true);
        Assert.assertTrue(it.isDeveloped()==true);
        Assert.assertFalse(it.isDeveloped()==false);
    }

    @Test
    public void testBiggerPopulation(){
        oma.setPopulationCount(4580078L);
        ger.setPopulationCount(83783942L);

        Assert.assertEquals(oma.biggerPopulation(oma, ger), "Germany");
    }

    @AfterTest
    public void closeResources(){
        // close all resources
    }
    
}
