package org.example;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CityReader {
    static JSONParser jsonParser = new JSONParser();
    static FileReader reader;

    static {
        try {
            reader = new FileReader("data.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static Object obj;

    static {
        try {
            obj = jsonParser.parse(reader);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    static JSONArray cities = (JSONArray) obj;

    public CityReader() throws IOException, ParseException {
    }


    public static List searchByDescription(String key) throws IOException, ParseException {

//        JSONParser jsonParser = new JSONParser();
//        FileReader reader = new FileReader("data.json");
//        Object obj = jsonParser.parse(reader);
//        JSONArray cities = (JSONArray) obj;
        List<String> results = new ArrayList<>();
        for (int i = 0; i < cities.size(); i++) {
            String cityDescription = ((JSONObject) (cities.get(i))).get("cityDescription").toString();
            String cityName = ((JSONObject) (cities.get(i))).get("cityName").toString();
            //search key parameter in cityDescription and cityName
            if (cityDescription.contains(key) ){
                results.add ( ( (JSONObject) (cities.get(i))).get("cityName").toString());
            }
            else if (cityName.contains(key)) {
                results.add(( (JSONObject) (cities.get(i))).get("cityName").toString());
            }
        }
        return results;
    }


    public static List searchByCity() throws IOException, ParseException {

//        JSONParser jsonParser = new JSONParser();
//        FileReader reader = new FileReader("data.json");
//        Object obj = jsonParser.parse(reader);
//        JSONArray cities = (JSONArray) obj;
        //City list
        List<String> citiesList = new ArrayList<>();
        for (int i = 0; i < cities.size(); i++) {
            citiesList.add (((JSONObject) (cities.get(i))).get("cityName").toString());
        }
        return citiesList;
    }
    public static List checkDescription(String key) throws IOException, ParseException {

//        JSONParser jsonParser = new JSONParser();
//        FileReader reader = new FileReader("data.json");
//        Object obj = jsonParser.parse(reader);
//        JSONArray cities = (JSONArray) obj;
        List<String> citiesList = new ArrayList<>();
        List<String> descriptionList = new ArrayList<>();
        for (int i = 0; i < cities.size(); i++) {
            citiesList.add ( ( (JSONObject) (cities.get(i))).get("cityName").toString());
            if (citiesList.get(i).equalsIgnoreCase(key)) {
                descriptionList.add(( (JSONObject) (cities.get(i))).get("cityDescription").toString());
            }
        }










        return descriptionList;
    }

}
