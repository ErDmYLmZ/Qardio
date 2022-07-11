package org.example;

import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * Unit test for DataReader App.
 */
public class CitiesSearchTest {
    // search specific parameter in JSON DATA
    @Test
    public void checkData() throws IOException, ParseException {

        List l = CityReader.searchData("Amsterdam");

        String expected="Amsterdam";
        String actual=l.get(0).toString();
        Assert.assertEquals(expected,actual);
    }

    // Validate cityName in cityName
    @Test
    public void searchCityName() throws IOException, ParseException {

        List cities = CityReader.searchByCity();
        Assert.assertTrue(cities.contains("Istanbul"));
    }

    // validate description in selected cityDescription
    @Test
    public void searchDescription() throws IOException, ParseException {

        List descriptions = CityReader.checkDescription("Shanghai");
        Assert.assertTrue(descriptions.get(0).toString().contains("China’s central coast"));
    }

    // validate specific  cityName index number in json
    @Test
    public void checkIndexNumber() throws IOException, ParseException {

        int descriptions = CityReader.checkCityIndexNumber("Singapore");
        int expected=4;
        int actual=descriptions;
        Assert.assertEquals(expected, actual);

    }

    // Negative Test Scenarious

    // check invalid data in cityName and cityDescription
    @Test
    public void invalidData() throws IOException, ParseException {

        List l = CityReader.searchData("Helsinki");
        Assert.assertEquals("Helsinki",l.get(0));
    }



    //Invalid CityName
    @Test
    public void checkInvalidCityName() throws IOException, ParseException {

        List cities = CityReader.searchByCity();
        Assert.assertTrue("invalid city name",cities.contains("Izmir"));
    }

    //Check Invalid content in cityDescription
    @Test
    public void invalidDescriptionCheck() throws IOException, ParseException {

        List descriptions = CityReader.checkDescription("Shanghai");
        Assert.assertTrue("cityDescription does not contain it",descriptions.get(0).toString().contains("America"));
    }


    //Invalid IndexNum
    @Test
    public void invalidIndexNum() throws IOException, ParseException {

        int descriptions = CityReader.checkCityIndexNumber("Tel Aviv");
        Assert.assertEquals("Index Number is not correct",4, descriptions);

    }








}
