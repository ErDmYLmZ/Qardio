package org.example;

import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;
import java.util.List;

/**
 * Unit test for DataReader App.
 */
public class CitiesSearchTest
{
    @Test
    public void checkCityName() throws IOException, ParseException {
        List l = CityReader.searchByDescription("Istanbul");
        Assert.assertEquals(l.get(0) ,"Istanbul");
    }

    @Test
    public void test2() throws IOException, ParseException {
        List cities = CityReader.searchByCity();
        Assert.assertTrue(cities.contains("Amsterdam"));
    }

    @Test
    public void test3() throws IOException, ParseException {
        List descriptions = CityReader.checkDescription("Amsterdam");
        Assert.assertTrue(descriptions.get(0).toString().contains("intriguing history"));
    }
}
