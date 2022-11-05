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
    @Test
    public void testCountryName()
    {
        it=new Country();
        it.setCountryName("Italy");
        Assert.assertEquals(it.getCountryName(),"Italy");
        Assert.assertFalse(it.getCountryName()=="Roma","Country Name is Not Roma");
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
    public void testCountryZipCode()
    {
        it=new Country();
        it.setZipCode(118);
        Assert.assertEquals(it.getZipCode(),118);
        Assert.assertFalse(it.getZipCode() ==-118,"Zip Code must be Positive integer Number");
    }
    @Test
    public void testIsDeveloped()
    {
        it=new Country();
        it.setDeveloped(true);
        Assert.assertTrue(it.isDeveloped()==true);
        Assert.assertFalse(it.isDeveloped()==false);
    }

    @AfterTest
    public void closeResources(){
        // close all resources
    }












}
